/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexamples;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ArrayOperations<T> {
    private List<T> array;

    public ArrayOperations() {
        array = new ArrayList<>();
    }

    public void addElement(T element, int position) {
        array.add(position, element);
    }

    public void deleteElement(int position) {
        if (position >= 0 && position < array.size()) {
            array.remove(position);
        } else {
            System.out.println("Invalid position");
        }
    }

    public List<T> getArray() {
        return array;
    }

    public void displayArray() {
        System.out.println("Array: " + array);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of ArrayOperations
        ArrayOperations<Integer> integerArrayOperations = new ArrayOperations<>();

        // Add elements to the array
        integerArrayOperations.addElement(10, 0);
        integerArrayOperations.addElement(20, 1);
        integerArrayOperations.addElement(30, 2);

        // Display the initial array
        System.out.println("Initial Array:");
        integerArrayOperations.displayArray();

        // Add an element at the beginning
        System.out.print("Enter element to add at the beginning: ");
        int elementToAdd = scanner.nextInt();
        integerArrayOperations.addElement(elementToAdd, 0);
        integerArrayOperations.displayArray();

        // Add an element at the middle
        System.out.print("Enter element to add in the middle: ");
        elementToAdd = scanner.nextInt();
        int middlePosition = integerArrayOperations.getArray().size() / 2;
        integerArrayOperations.addElement(elementToAdd, middlePosition);
        integerArrayOperations.displayArray();

        // Add an element at the end
        System.out.print("Enter element to add at the end: ");
        elementToAdd = scanner.nextInt();
        integerArrayOperations.addElement(elementToAdd, integerArrayOperations.getArray().size());
        integerArrayOperations.displayArray();

        // Delete an element
        System.out.print("Enter position to delete element: ");
        int positionToDelete = scanner.nextInt();
        integerArrayOperations.deleteElement(positionToDelete);
        integerArrayOperations.displayArray();

        scanner.close();
    }
}
