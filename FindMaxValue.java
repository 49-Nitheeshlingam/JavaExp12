/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexamples;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class FindMaxValue {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the type of elements from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array of the specified type
        Integer[] intArray = new Integer[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        // Find and display the maximum value
        Integer max = findMax(intArray);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}
