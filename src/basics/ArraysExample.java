package basics;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Array - 'Fixed size', a sequence of elements of the same type
        // 1. array-literal (initialization)
        int[] arr1 = {1, 2, 3, 4, 5};

        // the length(size) of array
        System.out.println(arr1.length);

        // access elements in array
        System.out.println(arr1[0]);  // 1
        System.out.println(arr1[arr1.length - 1]);  // last element 5

        // for-loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // change the element
        arr1[0] = 7;

        // for-each loop (collections)
        for (int elem : arr1) {
            System.out.println(elem);
        }

        // 2. create an array with the "size"
        // - create a new array object with size 10
        // - by default, it stores ten zeros
        // type[] array = new type[size];
        int[] arr2 = new int[10]; // {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        // arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        System.out.println(arr2);  // memory address
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();
        // helper method 'util'
        System.out.println(Arrays.toString(arr2));

        // 3. 1 + 2 combine
        String[] countries = new String[] {"Canada", "USA"};
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
