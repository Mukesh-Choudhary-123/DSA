public class Array1 {

    public static void linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i);
            }
        }
    }

    public static void largestAndSmallestNumberInArray(int arr[]) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest Number In Array :- " + max);
        System.out.println("smallest Number In Array :- " + min);

    }

    public static void binarySearch(int arr[], int key) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                System.out.println(mid);
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }

    }

    public static void reversArray(int arr[]) {
        int temp;

        int first = 0, last = arr.length - 1;

        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void pariInAnArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("( " + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }

    }

    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubArray(int arr[]) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }

        System.out.println("Max Sum :- " + maxSum);
    }

    public static void kadanesAlgo(int arr[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            currSum += arr[i];

            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }

        }
        System.out.println(maxSum);

    }

    public static void trappedRainWater(int arr[]) {
        // calculate left max boundary = array

        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        // calculate right max boundary = array

        int rightMax[] = new int[arr.length];

        rightMax[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        int trappedRainWater = 0;
        // loop
        for (int i = 0; i < arr.length; i++) {

            // waterLevel = min (leftmax boundary , rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterLevel - height[i];
            trappedRainWater += waterLevel - arr[i];

        }
        System.out.println(trappedRainWater);

    }

    public static void buyAndSellStocks() {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        int buyPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrices < prices[i]) { // profit
                int profit = prices[i] - buyPrices; // today profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrices = prices[i];
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        int key = 8;
        // linearSearch(arr, key);
        // largestAndSmallestNumberInArray(arr);
        // binarySearch(arr, key);
        // reversArray(arr);
        // pariInAnArray(arr);
        // subArray(arr);
        // maxSubArray(arr);
        // kadanesAlgo(arr);
        // trappedRainWater(arr);
        buyAndSellStocks();
    }

}
