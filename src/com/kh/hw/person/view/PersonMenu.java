package com.kh.hw.person.view;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

import java.util.Scanner;

public class PersonMenu {

    private Scanner sc;
    private PersonController pc;

    public PersonMenu() {
        sc = new Scanner(System.in);
        pc = new PersonController();
        mainMenu();
    }

    public void mainMenu() {
        while (true) {
            int[] personCount = pc.personCount();
            System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
            System.out.printf("현재 저장된 학생은 %d명입니다.\n", personCount[0]);
            System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
            System.out.printf("현재 저장된 사원은 %d명입니다.\n", personCount[1]);

            System.out.println();
            System.out.println("1. 학생 메뉴");
            System.out.println("2. 사원 메뉴");
            System.out.println("9. 끝내기");
            System.out.printf("메뉴 번호: ");
            int select = sc.nextInt();

            switch (select) {
                case 1: studentMenu(); break;
                case 2: employeeMenu(); break;
                case 9: System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }

    }

    public void studentMenu() {
        while (true) {
            int[] personCount = pc.personCount();
            System.out.println();
            if (personCount[0] == 3) {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화되지 않습니다.");
            } else {
                System.out.println("1. 학생 추가");
            }
            System.out.println("2. 학생 보기");
            System.out.println("9. 메인으로");



            System.out.printf("메뉴 번호: ");
            int select = sc.nextInt();


            switch (select) {
                case 1:
                    if (personCount[0] < 3) {
                        insertStudent();
                    } else {
                        System.out.println("더 이상 학생을 추가할 수 없습니다.");
                    }
                    break;
                case 2: printStudent(); break;
                case 9: return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    public void insertStudent() {
        while (true) {
            System.out.printf("학생 이름: ");
            String name = sc.next();

            System.out.printf("학생 나이: ");
            int age = sc.nextInt();

            System.out.printf("학생 키: ");
            double height = sc.nextDouble();

            System.out.printf("학생 몸무게: ");
            double weight = sc.nextDouble();

            System.out.printf("학생 학년: ");
            int grade = sc.nextInt();

            System.out.printf("학생 전공: ");
            sc.nextLine();
            String major = sc.nextLine();

            pc.insertStudent(name, age, height, weight, grade, major);

            int count = pc.personCount()[0];
            if (count < 3) {
                System.out.printf("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요: ");
                String select = sc.nextLine();
                if (select.toUpperCase().equals("N")) return;
            } else {
                System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
                return;
            }
        }
    }

    public void printStudent() {
        Student[] students = pc.printStudent();
        for (Student s : students) {
            if (s == null) return;
            System.out.println(s);
        }
    }

    public void employeeMenu() {
        while (true) {
            int empCount = pc.personCount()[1];
            System.out.println();
            if (empCount == 10) {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화되지 않습니다.");
            } else {
                System.out.println("1. 사원 추가");
            }
            System.out.println("2. 사원 보기");
            System.out.println("9. 메인으로");


            System.out.printf("메뉴 번호: ");
            int select = sc.nextInt();


            switch (select) {
                case 1:
                    if (empCount < 10) {
                        insertEmployee();
                    } else {
                        System.out.println("더 이상 사원을 추가할 수 없습니다.");
                    }
                    break;
                case 2: printEmployee(); break;
                case 9: return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }

    public void insertEmployee() {
        while (true) {
            System.out.printf("사원 이름: ");
            String name = sc.next();

            System.out.printf("사원 나이: ");
            int age = sc.nextInt();

            System.out.printf("사원 키: ");
            double height = sc.nextDouble();

            System.out.printf("사원 몸무게: ");
            double weight = sc.nextDouble();

            System.out.printf("사원 급여: ");
            int salary = sc.nextInt();

            System.out.printf("사원 부서: ");
            sc.nextLine();
            String dept = sc.nextLine();

            pc.insertEmployee(name, age, height, weight, salary, dept);

            int count = pc.personCount()[1];
            if (count < 10) {
                System.out.printf("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요: ");
                String select = sc.nextLine();
                if (select.toUpperCase().equals("N")) return;
            } else {
                System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
                return;
            }
        }
    }

    public void printEmployee() {
        Employee[] employees = pc.printEmployee();
        for (Employee e : employees) {
            if (e == null) return;
            System.out.println(e);
        }
    }

}
