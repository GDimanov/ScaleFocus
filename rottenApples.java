package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class rottenApples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pass in the array positions separated by space. it should have ad least one rotten apple /1/:");
        List<Integer> apples = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("pass in the number of day the apples will age");
        int daysGone = Integer.parseInt(sc.nextLine());

        while (daysGone > 0) {

            for (int i = 0; i < apples.size(); i++) {
                if (apples.get(i) == 1) {
                    if (i == 0 ) apples.set(i + 1, 1);
                    else if (i == apples.size() -1 ) apples.set(i -1, 1);
                    else {
                        apples.set(i - 1, 1);
                        apples.set(i + 1, 1);
                    }
                    i++;
                }
            }
            daysGone--;
        }
        System.out.println(apples);
    }
}
