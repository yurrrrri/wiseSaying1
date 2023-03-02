package com.ll.stage7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        int number = 1;
        List<appList> list = new ArrayList<>();
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
                list.add(new appList(number, author, saying));
                number++;
            } else if(order.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for(int i=list.size()-1; i>=0; i--){
                    System.out.printf("%d / %s / %s\n", list.get(i).number, list.get(i).author, list.get(i).saying);
                }
            } else if(order.substring(0, 2).equals("삭제")){
                int index = Integer.parseInt(order.substring(6, 7));
                boolean flag = false;
                for(int i=0; i<list.size(); i++){
                    if(list.get(i).number == index){
                        list.remove(i);
                        System.out.println(index + "번 명언이 삭제되었습니다.");
                        flag = true;
                    }
                }
                if(flag == false){
                    System.out.println(index + "번 명언은 존재하지 않습니다.");
                }
            } else if(order.equals("종료")){
                break;
            } else {
                System.out.println("사용 가능한 명령 : 등록, 목록, 삭제, 종료");
            }
        }
    }
}

class appList{
    int number;
    String author;
    String saying;

    public appList(int number, String author, String saying) {
        this.number = number;
        this.author = author;
        this.saying = saying;
    }
}