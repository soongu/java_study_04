package day07;

// 실행용 클래스
// main메서드를 생성
public class PhoneFactory {

    public static void main(String[] args) {



        // Phone 객체 생성
        Phone galaxy = new Phone();


        // 객체의 속성과 기능을 참조( . 연산자)
//        galaxy.model = "갤럭시 S6";
//        galaxy.color = "그레이";
//        galaxy.price = 600000;
        galaxy.model = "갤럭시";

       //galaxy.powerOn();
        galaxy.showSpec();

        System.out.println("=====================");

        Phone iPhoneX = new Phone("아이폰X");
        iPhoneX.showSpec();

        System.out.println("=====================");

        Phone gNote = new Phone("갤럭시 노트", "제니레드");
        gNote.showSpec();

        System.out.println("=====================");

        Phone xhaomi = new Phone("샤오미3.0", "화이트", 200000);


    }
}
