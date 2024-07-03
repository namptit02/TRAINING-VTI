package org.example;

import java.util.Scanner;

public class Lab3Bai4 {


//    BÀI 4
//    Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
//    ü Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực
//    o Yếu: điểm < 5
//    o Trung bình: 5 <= điểm < 6.5
//    o Khá: 6.5 <= điểm < 7.5
//    o Giỏi: 7.5<= điểm < 9
//    o Xuất sắc: điểm >= 9
//    Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Đọc dòng mới để tránh lỗi nhập liệu

        String[] names = new String[n];
        double[] scores = new double[n];

        // Nhập thông tin sinh viên
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();  // Đọc dòng mới để tránh lỗi nhập liệu
        }

        // Sắp xếp sinh viên theo điểm tăng dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i] > scores[j]) {
                    // Hoán đổi điểm
                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    // Hoán đổi tên
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        // Xuất thông tin sinh viên
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            String grade = getGrade(scores[i]);
            System.out.println("Họ tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + grade);
            System.out.println();
        }

        scanner.close();
    }

    // Phương thức xác định học lực dựa trên điểm
    public static String getGrade(double score) {
        if (score < 5) {
            return "Yếu";
        } else if (score < 6.5) {
            return "Trung bình";
        } else if (score < 7.5) {
            return "Khá";
        } else if (score < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
}
