package com.ll.stage4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        int number = 1;
        while(true){
            System.out.print("명령) ");
            String order = sc.next();
            if(order.equals("등록")){
                String space = sc.nextLine();
                System.out.print("명언 : ");
                String saying = sc.nextLine();
                System.out.print("작가 : ");
                String author = sc.next();
                System.out.println(number + "번 명언이 등록되었습니다.");
                number++;
            }
            if(order.equals("종료")) break;
        }
    }
}