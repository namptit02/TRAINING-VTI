package org.example;

import java.util.Scanner;

public class Lab2Bai1 {
    //    BÀI 1
//    Viết chương trình cho phép giải phương trình bậc nhất
//    trong đó các hệ số a và b nhập từ bàn phím
//    ax+b=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a= sc.nextInt();
        System.out.println("Nhap b: ");
        int b= sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("PT vo os nghiem");
            }else{
                System.out.println("Pt vo no");
            }
        }else{
            double x = (double) -b /a;
            System.out.println("pt co nghiem duy nhat x= "+ x);
        }
    }

}
