package javaTest;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("정수 " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("입력 받은 정수 출력:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("정수 " + (i + 1) + ": " + numbers[i]);
        }

        sc.close();
    }
}

