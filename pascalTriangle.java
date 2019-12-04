package com.company;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        int firstNum = 1;
        int counter = 2;
        int[] startArray = new int[1];
        startArray[0] = firstNum;
        System.out.println(firstNum);
        while (number - 1 > 0) {
            int[] numArr = new int[counter];
            for (int i = 0; i < counter; i++) {
                if (i == 0) numArr[i] = startArray[i];
                else if (i == counter - 1) numArr[i] = startArray[i - 1];
                else numArr[i] = startArray[i] + startArray[i - 1];
            }
            for (int i : numArr) System.out.print(i + " ");
            System.out.println();
            startArray = numArr;
            counter++;
            number--;
        }
    }
}
