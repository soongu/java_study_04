package day17.song.controller;

import day17.song.model.vo.Artist;

import java.util.*;

public class ArtistController {

    // key는 가수명을 사용
    private final Map<String, Artist> artistMap;

    private static ArtistController ac;
    static {
        ac = new ArtistController();
    }

    private ArtistController() {
        artistMap = new HashMap<>();
    }


    // 싱글턴 객체 반환
    public static ArtistController getInstance() {
        return ac;
    }


    // list를 set으로 변환
    public Set<String> convert(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        return set;
    }

    // 가수 신규 등록 기능
    public void insertNewArtist(Artist artist) {
        artistMap.put(artist.getName(), artist);
    }

    // 등록 가수 노래목록에 노래 추가 기능
    public boolean addNewSong(String artistName, String songName) {
        // 노래 목록 얻기
        List<String> songList = artistMap.get(artistName).getSongs();
        // 중복 확인을 위한 set 변환
        Set<String> songSet = convert(songList);
        // 노래 넣고 결과 얻기
        boolean result = songSet.add(songName);

        // set에 성공적으로 저장되었다면 중복이 아닌 노래이므로 리스트에 저장
        if (result) songList.add(songName);

        // 노래 넣기 성공 유무 결과 반환
        return result;
    }

    // 가수가 등록되어 있는지 유무 확인
    public boolean isRegister(String artistName) {
        return artistMap.containsKey(artistName);
    }

    // 등록된 가수의 수 반환
    public int count() {
        return artistMap.size();
    }

    // 특정 가수 노래 목록 반환
    public List<String> getSongList(String artistName) {
        return artistMap.get(artistName).getSongs();
    }
}
