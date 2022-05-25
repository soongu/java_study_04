package day05;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int playerNum;
        while (true) {
            try {
                System.out.printf("게임 인원 (2 ~ 4명) ==> ");
                playerNum = sc.nextInt();
                sc.nextLine();

                // 인원 수 검증
                if (playerNum < 2 || playerNum > 4) {
                    System.out.println("인원 수가 올바르지 않습니다.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("정수로만 써주세요!");
                sc.nextLine();
            }
        } // end while

        // 참여 인원 수만큼 플레이어 이름 입력받기
        System.out.println("\n플레이어 이름을 등록합니다.");
        // 플레이어 이름을 저장할 배열
        String[] players = new String[playerNum];
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름: ", i + 1);
            players[i] = sc.nextLine();
        }
        // 참여 인원 이름 전체 출력
        System.out.println(Arrays.toString(players) + " 참가!");

        // 실탄 개수 입력받기
        System.out.printf("\n실탄 개수 (1 ~ 5개) ==> ");
        int bulletNum = sc.nextInt();
        sc.nextLine();

        // 실탄 장전하기
        boolean[] magazine = new boolean[6];

        // 입력된 실탄 수만큼 탄창배열의 내부값을 랜덤하게 true로 바꿔야함
        int success = 0; // 성공적으로 장전되었을 때의 카운트
        while (success < bulletNum) {
            int position = (int) (Math.random() * magazine.length);
            if (!magazine[position]) {
                magazine[position] = true;
                success++;
            }
        }

        //=========== 핵심 게임 로직 ===========//
        // 선턴 플레이어를 랜덤으로 결정
        int turn = (int) (Math.random() * playerNum);
        System.out.printf("\n총을 받았습니다. %s부터 시작합니다.\n", players[turn]);

        while (true) {
            /*
               # 1턴동안 해야할 일
               1. 탄창을 회전시켜서 무작위로 격발구의 위치를 결정
               : 랜덤 인덱스 (0 ~ 5) 생성하여 총알이 있는 위치(true)
                 가 결정되면 죽는다.
               2. 격발처리: 탄창배열을 조회해서 true값인지 확인
               3. 사망 판정: 해당 격발 위치에 총알이 있었으면 사망처리
                           없었으면 생존처리
               3-1. 사망 처리: players배열에서 죽은 플레이어 이름 삭제
                             탄창배열에서 격발위치 값 false로 조정
               4. 턴조정: 지금 격발한 플레이어가 마지막 사람이면
                         다음 턴의 인덱스는 0번, 아니면 +1번
               5. 게임종료처리 : 총알이 모두 소진되거나, 플레이어가 1명만 남으면 종료
             */

            // 격발 위치 결정
            int firePos = (int) (Math.random() * magazine.length);
            System.out.printf("\n[%s님의 턴!] 탄창을 회전합니다.\n", players[turn]);
            System.out.println("# 엔터를 누르면 격발합니다.");
            sc.nextLine();

            // 사망 판정
            if (magazine[firePos]) { // 사망
                System.out.printf("\n# 빵!! [%s]님 사망...RIP\n", players[turn]);

                // 사망자를 players배열에서 삭제
                for (int i = turn; i < players.length - 1; i++) {
                    players[i] = players[i + 1];
                }
                String[] temp = new String[--playerNum];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = players[i];
                }
                players = temp;

                // 격발된 총알 처리
                magazine[firePos] = false;
                bulletNum--;

                // 게임 종료 여부 판단
                // 남은 플레이어가 1명일 경우
                if (playerNum == 1) {
                    System.out.println("\n# 단 한명만 살아남았습니다. 게임을 종료합니다");
                    System.out.printf("# 최후 생존자: %s\n", players[0]);
                    break;
                }
                // 총알이 0개일 경우
                else if (bulletNum == 0) {
                    System.out.println("\n# 총알이 모두 소진되었습니다. 게임을 종료합니다.");
                    System.out.printf("# 생존한 인원: %s\n", Arrays.toString(players));
                    break;
                }
                // 게임을 지속시키는 경우
                else {
                    System.out.println("\n# 남은 인원으로 게임을 계속합니다.");
                    System.out.printf("# 생존한 인원 : %s\n", Arrays.toString(players));
                    // 마지막 플레이가 죽은경우 turn을 0으로 초기화
                    if (turn == players.length) {
                        turn = 0;
                    }
                }

            } else { // 생존
                System.out.println("...휴~~ 살았습니다.");
                // 턴 조정
                if (turn == players.length - 1) {
                    turn = 0;
                } else {
                    turn++;
                }
            }

        } // end while


    }// end main
}// end class