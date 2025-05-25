package com.sbs.java.board;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== 자바 텍스트 게시판 ==");
        System.out.println("텍스트 게시판을 시작합니다.");
        while (true){
            System.out.print("명령)");
            String cmd = sc.nextLine();

            if(cmd.equals("/usr/article/write")){
                System.out.println("== 게시물 작성 ==");
                System.out.print("제목 : ");
                String subject = sc.nextLine();

                System.out.print("내용 : ");
                String content = sc.nextLine();

                int id = 1;

                System.out.printf("%d번 게시물이 등록되었습니다.\n", id);
            } else if(cmd.equals("exit")){
                System.out.println("텍스트 게시판을 종료합니다.");
                break;
            } else{
                System.out.println("잘 못 입력된 명령어입니다.");
            }

            System.out.printf("입력받은 명령어 : %s\n", cmd);
        }


        System.out.println("== 자바 텍스트 게시판 종료==");
        sc.close();

    }
}