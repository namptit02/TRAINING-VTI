package org.example;

import java.util.Scanner;

public class Lab1Bai4 {
    //    BÀI 4
//    Viết chương trình nhập các hệ số của phương
//    trình bậc 2. Tính delta và xuất căn delta ra màn hình.
//ax^2+bx+c=0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap c: ");
        int c = scanner.nextInt();
        double delta = Math.pow(b, 2) - 4 * a * c;
//        System.out.println(canDelta);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiep");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + -b / (2 * a));
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet la: ");
            System.out.println("x1 = " + (-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("x2 = " + (-b + Math.sqrt(delta)) / (2 * a));


        }
    }
}
