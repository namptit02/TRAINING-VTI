package org.example;

import java.util.Scanner;

public class Lab3Bai2 {
    public static void main(String[] args) {
//        Viết chương trình xuất ra màn hình bảng cửu chương

        Scanner sc = new Scanner(System.in);
        System.out.println("Bang cuu chuong so: ");
        int x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + "x" + i+"="+x*i);
        }

    }
}
