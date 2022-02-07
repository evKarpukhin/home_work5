package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
// Task 1
        int [] firstArray = new int[]{1, 2, 3};
        float [] secondArray = {1.57f, 7.654f, 9.986f};
        char [] thirdArray = {'P', 'R', 'I', 'V', 'E', 'T'};

//Task 2
// print firstArray
        System.out.println("Task_2");
        for (int i = 0; i < firstArray.length; i++) {
            if (i == firstArray.length - 1) {
                System.out.println(firstArray[i]);
            } else {
                System.out.print(firstArray[i]+ ", ");
            }
        }
// print secondArray
        for (int i = 0; i < secondArray.length; i++) {
            if (i == secondArray.length - 1) {
                System.out.println(secondArray[i]);
            } else {
                System.out.print(secondArray[i]+ ", ");
            }
        }
// print thirdArray
        for (int i = 0; i < thirdArray.length; i++) {
            if (i == thirdArray.length - 1) {
                System.out.println(thirdArray[i]);
            } else {
                System.out.print(thirdArray[i]+ ", ");
            }
        }

//Task 3
        System.out.println("Task_3");
// print firstArray
        for (int i = firstArray.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(firstArray[i]);
            } else {
                System.out.print(firstArray[i]+ ", ");
            }
        }
// print secondArray
        for (int i = secondArray.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(secondArray[i]);
            } else {
                System.out.print(secondArray[i]+ ", ");
            }
        }
// print thirdArray
        for (int i = thirdArray.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(thirdArray[i]);
            } else {
                System.out.print(thirdArray[i]+ ", ");
            }
        }

//Task 4
        System.out.println("Task_4");
        for (int i = 0; i < firstArray.length; i++) {
            if ( firstArray[i] % 2 != 0 ) {
                firstArray[i] += 1;
            }
            System.out.print(firstArray[i]+ ", ");
            }

    }
}
