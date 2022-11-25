package home1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arrFirst = arrGenerator(10);
        int[] arrSecond = arrGenerator(10);
        int[] arrLenght = arrGenerator(12);

        printArr(checkArray(arrFirst, arrSecond));
        // printArr(checkArray(arrFirst, arrLenght));
        // printArr(checkArray(arrFirst, arrFirst));
        // printArr(checkArray(arrFirst, null));

    }

    public static int[] checkArray(int[] arrFirst, int[] arrSecond) {
        if (arrFirst == null || arrSecond == null) {
            // return null;
            throw new RuntimeException("Один из массивов равен null");
        }

        if (arrFirst.length != arrSecond.length) {
            throw new RuntimeException("Массивы имеют разную длину");
        }
        if (arrFirst.equals(arrSecond)) {
            throw new RuntimeException("Массивы одинаковы");
        }

        int[] result = new int[arrFirst.length];
        for (int i = 0; i < arrFirst.length; i++) {

            result[i] = addA(arrSecond[i], arrFirst[i]); // subA() - разница, addA() - сложение
        }
        return result;
    }

    public static int addA(int i, int j) {
        return i + j;
    }

    public static int subsA(int i, int j) {
        return i - j;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] arrGenerator(int len) {
        int[] arr = new int[len];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        return arr;
    }

}