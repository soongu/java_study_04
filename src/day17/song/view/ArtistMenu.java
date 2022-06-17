package day17.song.view;

import day17.song.controller.ArtistController;
import day17.song.model.vo.Artist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArtistMenu {

    private final Scanner sc;
    private final ArtistController ac;

    public ArtistMenu() {
        sc = new Scanner(System.in);
        ac = ArtistController.getInstance();
    }

    public void mainMenu() {

        ac.makeDirectory();
        ac.load();

        while (true) {
            System.out.println("\n\n**** 음악 관리 프로그램 ****");
            System.out.printf("# 현재 등록된 가수: %d명\n", ac.count());
            System.out.println("# 1. 노래 등록하기");
            System.out.println("# 2. 노래 정보 검색");
            System.out.println("# 3. 프로그램 종료");
            System.out.println("===============================");
            System.out.print(">> ");

            int menu = 0;
            try {
                menu = sc.nextInt();
            } catch (Exception e) {
                System.out.println("숫자로만 입력하세요!");
                continue;
            } finally {
                sc.nextLine();
            }

            switch (menu) {
                case 1:
                    insertMusic();

                    break;
                case 2:
                    searchMusic();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다!");
                    System.exit(0);
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다.");
            }
        }
    }

    private void insertMusic() {
        System.out.println("\n# 노래 등록을 시작합니다.");
        System.out.printf("- 가수명: ");
        String name = sc.nextLine();

        System.out.printf("- 곡명: ");
        String song = sc.nextLine();

        // 신규 가수인가?
        if (!ac.isRegister(name)) {
            // 신규 가수 객체 생성
            Artist artist = new Artist(name, new ArrayList<>());
            // 가수를 map에 등록
            ac.insertNewArtist(artist);
            // 곡명을 등록
            ac.addNewSong(name, song);
            System.out.printf("# 아티스트 %s님이 신규 등록되었습니다.\n", name);
        } else { // 이미 등록된 가수
            if (ac.addNewSong(name, song)) { // 노래 정상 추가됨
                System.out.printf("# %s님의 노래목록에 '%s'곡이 추가되었습니다.\n"
                        , name, song);
            } else { // 노래 추가 실패 -> 중복
                System.out.printf("# [%s]은(는) 이미 등록된 노래입니다\n", song);
            }
        }
        ac.save();
    }

    public void searchMusic() {
        System.out.println("\n# 검색할 가수명을 입력하세요.");
        System.out.printf("- 가수명: ");
        String name = sc.nextLine();

        // 등록된 가수인가?
        if (ac.isRegister(name)) {
            System.out.printf("\n# %s님의 노래목록 \n", name);
            System.out.println("================================");

            // 해당 가수 노래목록 얻기
            List<String> songList = ac.getSongList(name);
            for (int i = 0; i < songList.size(); i++) {
                System.out.printf("* %d. %s\n", i+1, songList.get(i));
            }
        } else {
            System.out.println("# 해당 가수는 등록되지 않았습니다.");
        }
    }
}
