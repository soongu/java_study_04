package day07;

public class PhoneMain {

    public static void main(String[] args) {

        Phone galaxy = new Phone("갤럭시S21");
        Phone iphone = new Phone("아이폰13 pro");
        Phone note = new Phone("갤노트");

//        System.out.printf("p1의 주소: %s\n", p1);
//        System.out.printf("p2의 주소: %s\n", p2);

        galaxy.sendMessage(iphone, "안녕 나는 갤럭시~");
        galaxy.sendMessage(iphone, "메롱멜롱 ~~!");
        note.sendMessage(iphone, "나는 갤럭시 노트야~~ 하위~");

        iphone.sendMessage(note, "나는 애플폰이야~");
        galaxy.sendMessage(note, "ddddd");

        iphone.sendMessage(galaxy, "ggpgpgpgp");


        iphone.checkMessages();
        galaxy.checkMessages();
        note.checkMessages();

    }
}
