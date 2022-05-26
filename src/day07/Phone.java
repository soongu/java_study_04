package day07;

// 핸드폰 설계도
// 설계도로 쓸 클래스는 main을 만들지 않습니다.
public class Phone {

    // 속성: 객체의 데이터 (field)

    // 고유 속성
    String model; // 모델명
    String color; // 색상
    int price;    // 가격

    // 상태 속성
    int messageCount; // 받은 문자메시지 수
    boolean on; // 전원이 켜진 여부

    // 부품 속성
    // 문자메시지함
    String[] receiveMessages = new String[3];

    // 생성자 (constructor) : 객체의 초기화를 담당하며, 객체 생성시 반드시 호출
    // 하나도 선언하지 않을 시 자동으로 기본 생성자가 만들어진다.
    Phone() { // 매개변수가 없는 생성자 => 기본 생성자
        System.out.println("1번 생성자 호출!");
        model = "애니콜";
        color = "그레이";
        price = 120000;
        powerOn();
        Math.random();
    }

    // 생성자 오버로딩 : 생성자를 중복 선언
    Phone(String pModel) {
        System.out.println("2번 생성자 호출!");
        model = pModel;
        color = "사파이어";
        price = 500000;
        powerOn();
    }

    Phone(String pModel, String pColor) {
        System.out.println("3번 생성자 호출!");
        model = pModel;
        color = pColor;
        price = 800000;
        powerOn();
    }

    Phone(String pModel, String pColor, int pPrice) {
        model = pModel;
        color = pColor;
        price = pPrice;
        powerOn();
    }


    // 기능: 객체의 행위, 동작 (method)
    // 설계도의 메서드는 static을 붙이지 말 것!

    // 전원을 켜는 기능
    void powerOn() {
        on = true;
        System.out.println(model + "의 전원을 켭니다.");
    }

    // 전원을 끄는 기능
    void powerOff() {
        on = false;
        System.out.println(model + "의 전원을 끕니다.");
    }

    // 핸드폰 정보를 알려주는 기능
    void showSpec() {
        if (!on) {
            System.out.println(model+"의 전원을 먼저 켜세요.");
            return;
        }
        System.out.println("\n# 휴대폰 정보");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price);
    }

    // 메시지를 보내는 기능
    // 아이폰.메시지를보낸다(갤럭시, 메시지내용);
    // 고양이.먹는다(참치캔);
    void sendMessage(Phone targetPhone, String msg) {
        // 상대방의 메시지함이 가득차있는가?
        if (targetPhone.receiveMessages.length > targetPhone.messageCount) {
            // 상대방 메시지함에 메시지 넣기
            targetPhone.receiveMessages[targetPhone.messageCount++] = msg + "by " + model;
        } else { // 가득 찬 경우
            System.out.println(targetPhone.model + "의 메시지함이 가득찼습니다.");
        }
    }

    // 수신메시지를 확인하는 기능
    void checkMessages() {
        System.out.printf("\n========= [%s]의 메시지함 ==========\n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i+1, receiveMessages[i]);
        }
    }


}// end class
