package datastructure.chap09;
/*
   0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
     <----->          =>   1회
         <--->
   <----------->
             <--->    =>   2회
         <--------->
             <------>
               <------->
                   <------>  =>  3회
                   <--------->
       <------------------------>
                            <-------> => 4회


        주의 ) 2, 2 일 경우 시작하자마자 끝나는 회의이므로 횟수에 추가할 수 있다.
              다만 1, 2가 있을 경우 실제로 2개의 회의가 겹치지 않을 수 있지만
              로직상 1, 2보다 2, 2가 먼저 등장한 경우 나중에 나온 1, 2가 카운팅되지 않는다.
              따라서 종료시간이 같은 경우 시작시간을 먼저 배치하도록 정렬해야 한다.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 백준 1913
public class 그리디04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> A = new ArrayList<>();

        // 2차원 리스트에 데이터 입력받기
        for (int i = 0; i < N; i++) {
            A.add(new ArrayList<>());
            A.get(i).add(sc.nextInt());
            A.get(i).add(sc.nextInt());
        }
        sc.close();

        // 정렬
        A.sort((o1, o2) -> {
            if (o1.get(1) == o2.get(1)) { // 종료 시간이 같으면
                return o1.get(0) - o2.get(0); // 시작 시간으로 정렬
            }
            return o1.get(1) - o2.get(1); // 종료시간으로 정렬
        });

        int count = 0;  // 회의 횟수
        int end = -1;   // 종료시간 저장
        for (int i = 0; i < N; i++) {
            if (A.get(i).get(0) >= end) { // 시작시간이 기존 종료시간보다 크거나같으면
                end = A.get(i).get(1); // 종료시간을 갱신
                count++;
            }
        }
        System.out.println(count);
    }
}
