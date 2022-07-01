package datastructure.chap12.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 백준 11724
public class DFS_실전문제01 {

    // 그래프 인접 리스트 방식
    static List<List<Integer>> adjList = new LinkedList<>();
    // 방문 체크 배열
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점의 수
        int M = Integer.parseInt(st.nextToken()); // 간선의 수

        // 정점의 수만큼 인접리스트 내부에 1차원 리스트들을 추가
        for (int i = 0; i < N; i++) {
            adjList.add(new LinkedList<>());
        }
        // 정점 수만큼 방문체크 배열 초기화
        visited = new boolean[N];

        // 간선들을 연결하여 인접리스트에 연결정보 추가하기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 시작점
            int e = Integer.parseInt(st.nextToken()); // 끝점

            // 무방향 그래프이므로 양쪽에 모두 연결정보를 추가한다
            adjList.get(s-1).add(e);
            adjList.get(e-1).add(s);
        }

        // DFS를 수행하여 성공한 횟수를 기록하여 출력
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (!visited[i]) { // 방문하지 않은 정점만 DFS 수행
                DFS(i);
                count++;
            }
        }
        System.out.println(count);
    }

    // DFS 함수
    private static void DFS(int current) {

        if (visited[current]) return;

        // 현재 정점을 방문체크
        visited[current] = true;

        List<Integer> connectedList = adjList.get(current);
        for (Integer n : connectedList) {
            if (!visited[n - 1]) DFS(n - 1);
        }

    }

}
