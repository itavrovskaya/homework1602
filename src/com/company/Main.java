package com.company;

import java.time.Instant;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int year = 2022;
        printIsLeapYear(year);
        System.out.println();

        printReccomendAppVersion(0, 2022);
        System.out.println();

        System.out.println("Дней доставки - " + deliveryDistance(50));
        System.out.println();

        printDuplicates ("aabccddefgghiijjkk");
        System.out.println();

        int[] arr = new int[]{3, 2, 1, 6, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }

    private static void printDuplicates(String text) {
        char[] letters = text.toCharArray();
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                System.out.println("Найден дубль " + letters[i]);
            }
        }
        System.out.println("Дублей не найдено");

    }



    private static int deliveryDistance(int distance){
        int daysNumber = 0;
        if (distance < 20) {
            daysNumber = daysNumber + 1;
        }
        if (distance >= 20 && distance < 60) {
            daysNumber = daysNumber + 2;
        }
        if (distance >= 60 && distance < 100) {
            daysNumber = daysNumber + 3;
        }
        return daysNumber;
    }
    private static void printReccomendAppVersion (int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }
    }

    private static boolean isDeviceOld(int deviceYear) {
        int localDate = 2015;
        return deviceYear <= localDate;
    }

    private static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
