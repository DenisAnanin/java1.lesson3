package ru.gb.java1.lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRep(new int[]{1, 0, 1, 0, 1})));
        System.out.println(Arrays.toString(arrayCycle(new int[100])));
        System.out.println(Arrays.toString(cycleMulti(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        diagonal(9);
        System.out.println(Arrays.toString(array(5, 0)));
        arrayMinMax();
//        System.out.println(checkBalance(new int[]{2, 3, 5, 10}));
        offset(new int[]{7, 8, 9, 10, 11}, 0);


    }

    public static int[] arrayRep(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] arrayCycle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        return arr;
    }

    public static int[] cycleMulti(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    public static void diagonal(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == size - 1 - i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] array(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void arrayMinMax() {
        int[] arr = {500, 10, 1, -2, 600, 1, -5};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }

    public static void offset(int[] arr, int off) {
        System.out.println(Arrays.toString(arr));
        int temp = 0;
        if (off > 0) {
            for (int i = 0; i < off; i++) {
                for (int j = 0; j < arr.length; j++) {
                    temp = arr[0];
                    arr[0] = arr[j];
                    arr[j] = temp;
                }
            }
        } else {
            for (int i = 0; i > off; i--) {
                for (int j = arr.length - 1; j > 0; j--) {
                    temp = arr[0];
                    arr[0] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
