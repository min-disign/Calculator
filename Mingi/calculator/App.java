package Mingi.calculator;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Calculator car1 = new Calculator();

        Scanner a = new Scanner(System.in);
        while (true) {
            double result = 0;
            System.out.println("첫번째 숫자를 입력하세요 :");
            int num1 = a.nextInt();
            System.out.println("두번째 숫자를 입력하세요 :");
            int num2 = a.nextInt();
            System.out.println("사칙연산의 기호를 입력하세요 :");
            String input = a.next();
            char ch = input.charAt(0);
            result = car1.calculate(num1,num2,ch);
            car1.getLastResult();
            car1.setLastResult(30);
            if (ch == '+') {
                result = num1 + num2;
            } else if (ch == '-') {
                result = num1 - num2;
            } else if (ch == '*') {
                result = num1 * num2;
            } else if (ch == '/') {
                if (num2 == 0) {
                    System.out.println("분모에 0이 들어갈수 없습니다. 다시 입력하세요");
                    continue;
                }
                result = num1 / num2;
            }
            else {
                System.out.println("기호를 잘못 입력했습니다.");
                continue;
            }

            System.out.println("결과는 :" + result);



            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료):");
            String mi = a.next();
            if(mi.equalsIgnoreCase("exit")){
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
