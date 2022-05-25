package day06;

// parameter(매개 변수) : 함수가 외부에서 받아와야 하는 값을 저장하는 공간
public class MethodParam {

    // 2개의 정수를 전달받아 그 합을 돌려주는 함수
    static int add(int n1, int n2) {
        System.out.println("함수 호출!");
        int sum = n1 + n2;
        return sum;
    }

    // n개의 정수를 전달받아 그 총합을 리턴하는 함수
    static int addAll(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    static void hello() {
        System.out.println("안녕하십니까~?");
    }

    // 2개의 배열을 전달받아 길이가 더 긴 배열을 리턴하는 함수
    static int[] compareLength(int[] nums1, int[] nums2) {
        return (nums1.length > nums2.length) ? nums1 : nums2;
    }

    public static void main(String[] args) {

        System.out.println("함수호출 전!");
        System.out.println(add(10, 20) + 50);
        System.out.println("함수호출 후!");

        System.out.println("==================");

        long x = 12L;
        add(8, (int)x);

        System.out.println("==================");

        int[] arr = {10, 20, 30};
        int sum = addAll(arr);
        System.out.println("sum = " + sum);

        int sum2 = addAll(new int[]{3, 6, 9, 12});
        System.out.println("sum2 = " + sum2);

        int sum3 = addAll(5, 10, 15, 20, 25, 30);
        System.out.println("sum3 = " + sum3);

        System.out.println("=======================");

        compareLength(new int[] {1,3,5,7}, new int[] {2,4,6,8});

        for (int i = 0; i < 5; i++) {
            hello();
        }
    }
}
