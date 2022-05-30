package day09.objarr;

// 계좌 클래스
public class Account {

    String bankName; // 은행명
    int balance; // 예금잔액
    // 예금주 정보
    Person owner;

    // 생성자
    Account(Person p) {
        this.owner = p;
    }

}
