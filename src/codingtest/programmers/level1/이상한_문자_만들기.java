package codingtest.programmers.level1;

/*
      123   12345   12345  -> count
      try   hello   world
      ^ ^   ^ ^ ^   ^ ^ ^  -> count가 홀수인경우 대문자변환

      변환완료된 단일문자들을 하나로합쳐서 문자열로 구성

      - 의사 코드
      각단어의 위치를 기억할 count변수를 선언 초기값 0;
      완성 문자열을 저장할 변수;
      for (문자열의 길이만큼 반복) {
          한글자씩 뽑아내서 공백인 경우 count를 0으로 만들고
          공백이 아닌경우 count를 1씩 증가시키면서
          홀수카운트일경우 대문자 변환을 하고 짝수카운트일경우 소문자변환을 한다.
          지속적으로 변환한 문자를 하나의 문자열로 합친다.
      }
      완성 문자열을 반환;
 */
public class 이상한_문자_만들기 {

    public static String solution(String s) {

        // 단어 위치를 기억할 변수
        int count = 0;
        // 완성문자열이 저장될 변수
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            // 한글자씩 추출
            char c = s.charAt(i);
            // count값은 공백인 경우 0이되고 아닌경우 1씩증가
            count = (c == ' ') ? 0 : count + 1;
            // c를 문자열로 변환
            String ss = String.valueOf(c);
            answer += (count % 2 == 1) ? ss.toUpperCase() : ss.toLowerCase();
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("try hello world"));
    }
}
