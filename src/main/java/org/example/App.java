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
            String c = this.sc.nextLine();

            if(c.equals("종료")){
                break;
            }
        }

    }


}
