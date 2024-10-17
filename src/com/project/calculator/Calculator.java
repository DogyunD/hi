package com.project.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 받기

        // 변수 선언
        double Fnum; // 첫번째 입력값
        double Snum; // 두번째 입력값
        char Cal; // 연산 기호


        // 첫번째 숫자 입력 받기
        System.out.println("첫번째 숫자를 입력하세요: ");
        Fnum = sc.nextDouble();

        // 두번째 숫자 입력 받기
        System.out.println("두번째 숫자를 입력하세요: ");
        Snum = sc.nextDouble();

        // 연산기호 입력 받기
        System.out.println("기호를 입력하세요: ");
        Cal = sc.next().charAt(0);

        if (Cal == '+') { // +의 경우
            System.out.println("결과: " + (Fnum + Snum)); // +의 경우 결과값 출력

        } else if (Cal == '-') { // -의 경우
            System.out.println("결과: " + (Fnum - Snum)); // -의 경우 결과값 출력

        } else if (Cal == '*') { // *의 경우
            System.out.println("결과: " + (Fnum * Snum)); // *의 경우 결과값 출력

        } else if (Cal == '/') { // /의 경우
            if (Snum == 0) { // 분모가 0인 경우 제외
                System.out.println("계산 불가능"); // 경고 메시지 출력
            } else {
                System.out.println("결과: " + (Fnum / Snum)); // /의 경우 결과값 출력
            }
        }
        System.out.println("계속하시겠습니까?(end 입력 시 종료)");
    }
}
