package LogicalPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 2, 3};

        // Using Set to store unique elements
        int[] resultArray = removeDuplicates(inputArray);

        // Displaying the result
        System.out.print("Original Array: ");
        printArray(inputArray);

        System.out.print("Array without Duplicates: ");
        printArray(resultArray);
        
    }

    private static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int element : array) {
            if (uniqueSet.add(element)) {
                // If the element is not present in the set, add it to both the set and result list
                resultList.add(element);
            }
        }

        // Convert the result list to an array
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}