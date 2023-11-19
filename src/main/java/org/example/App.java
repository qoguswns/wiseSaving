package org.example;

import java.util.Scanner;

public class App {
    private Scanner sc;
    App (Scanner sc) {
        this.sc = sc;
    }
    void run () {

        System.out.println("==명언 앱==");

        while(true){
            System.out.println("명령)");
            String c = this.sc.nextLine().trim();


            if(c.equals("종료")){
                break;
            }
            else if(c.equals("등록"))
            {
                System.out.println("명언 : ");
                c = this.sc.nextLine().trim();
                System.out.println("작가 : ");
                c = this.sc.nextLine().trim();
            }
        }

    }


}
