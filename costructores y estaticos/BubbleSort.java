public class BubbleSort {
    static void bubbleSort(int[] arraytest) {
        int n = arraytest.length; // length of the array is initialized to the integer n
        int temp = 0; // A temporary variable called temp is declared as an integer and initialized to
                      // 0
        for (int i = 0; i < n; i++) { // first for loop performs multiple iterations
            for (int j = 1; j < (n - i); j++) {
                if (arraytest[j - 1] > arraytest[j]) { // if loop compares the adjacent numbers
                    // swaps the numbers
                    temp = arraytest[j - 1]; // assigns the greater number to temp variable
                    arraytest[j - 1] = arraytest[j]; // shifts the lesser number to the previous position
                    arraytest[j] = temp; // bigger number is then assigned to the right hand side
                }
            }
        }
    }

    public static void main(String[] args) {
        int arraytest[] = { 23, 16, 3, 42, 75, 536, 61 }; // defining the values of array
        System.out.println("Array Before Doing Bubble Sort");
        for (int i = 0; i < arraytest.length; i++) { // for loop used to print the values of array
            System.out.print(arraytest[i] + " ");
        }
        System.out.println();
        bubbleSort(arraytest); // array elements are sorted using bubble sort function
        System.out.println("Array After Doing Bubble Sort");
        for (int i = 0; i < arraytest.length; i++) {
            System.out.print(arraytest[i] + " "); // for loop to print output values from array
        }
    }
}