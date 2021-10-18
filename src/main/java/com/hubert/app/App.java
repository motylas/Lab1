package com.hubert.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int tura=0;
        Boss boss = new Boss(100,  "ARGGH!");
        Hero hero = new Hero(10);
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj atak bohatera: ");
        hero.ad = Integer.parseInt(scan.nextLine());

        System.out.println(boss.roar);
        System.out.println("Zycie bossa: " + boss.hp);

        while(boss.hp>0){
            tura++;
            System.out.println("Tura " + tura);
            System.out.println("Bohater atakuje!");
            boss.hp-=hero.ad;
            System.out.println("Zycie bossa: " + boss.hp);
        }

        System.out.println("Pokonales bossa w turze " + tura);


    }
}
