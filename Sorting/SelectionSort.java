public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
