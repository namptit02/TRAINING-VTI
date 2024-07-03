package org.example;

import java.util.Scanner;

public class Lab2Bai3 {
    //    BÀI 3 (2ĐIỂM)
//    Viết chương trình  nhập vào  số  điện sử dụng của tháng và tính tiền
//    điện theo phương pháp lũy tiến
//    Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
//    Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien");
        int soDien = sc.nextInt();
        int tiendien;
        System.out.println("tien dien la: ");
//        if(soDien<50){
//            tiendien = soDien*1000;
//        }else{
//            tiendien = soDien*1000+(soDien-50)*1200;
//        }
        tiendien = soDien < 50 ? soDien * 1000 : soDien * 1000 + (soDien - 50) * 1200;
        System.out.println(tiendien);

    }
}


