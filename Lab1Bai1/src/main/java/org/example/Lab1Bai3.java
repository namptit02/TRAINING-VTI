package org.example;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
//        Viết chương trình nhập từ bàn phím cạnh của một khối lập phương.
//                Tính và xuất thể tích của khối chữ nhật
        Scanner sc= new Scanner(System.in);

        System.out.println("Nhap canh lap phuong");
        int a= sc.nextInt();
        System.out.println("The tich lap phuong: "+ (int)Math.pow(a,3));
    }
}
