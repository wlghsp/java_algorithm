package neetcode.adsb;

public class StaticArray {

    // Insert n into arr at the next open position
    // Length is the number of 'real' values in arr, and capacity
    // is the size (aka memory allocated for the fixed size array).
    public void insertEnd(int[] arr, int n, int length, int capacity) {
        if (length < capacity) {
            arr[length] = n;
        }
    }

    // Remove from the last position in the array if the array is not empty (i.e. length is non-zero)
    public void removeEnd(int[] arr, int length) {
        if (length > 0) {
            // overwrite last element with some default value.
            // We would also consider the length to be decreased by 1.
            arr[length  - 1] = 0;
            length--;
        }
    }

    // Insert n into index i after shifting elements to the right.
    // Assuming i is a valid index and arr is not full.
    public void insertMiddle(int[] arr, int i, int n, int length) {
        // Shifting start from the end to i.
        for (int index = length - 1; index > i - 1; index--) {
            arr[index + 1] = arr[index];
        }
        // Insert at i
        arr[i] = n;
    }
}
