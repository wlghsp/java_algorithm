package neetcode._3_dynamic_arrays;

public class DynamicArray {

    int capacity;
    int length;
    int[] arr;


    public DynamicArray(int capacity) {
        this.capacity = capacity;
        length = 0;
        arr = new int[capacity];
    }

    // Get Value at i-th index
    public int get(int i) {
        if (i < length) {
            return arr[i];
        }
        return -1;
    }

    // Insert n at i-th index
    public void set(int i, int n) {
        if (i < length) {
            arr[i] = n;
            return;
        }
        return;
        // Here we would throw an out of bounds exception
    }

    // Insert n in the last position of the array
    public void pushback(int n) {
        if (length == capacity) {
            this.resize();
        }
        // insert at next empty position
        arr[length] = n;
        length++;
    }

    // Remove the last element in the array
    public int popback() {
        return arr[length-- - 1];
    }

    private void resize() {
        // Create new array of double capacity
        capacity = 2 * capacity;
        int[] newArr = new int[capacity];

        // Copy elements to newArr
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
