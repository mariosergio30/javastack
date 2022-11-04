package com.nttdata.formacao;

import java.util.Scanner;

public class SumTwoNumbers {
    private int num1;
    private int num2;

    private int sumTwoNumbers(int num1, int num2)
    {
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        return num1+num2;
    }
}
