import java.util.PriorityQueue;

/**
 * Minimum_Cost_of_ropes
 */
public class Minimum_Cost_of_ropes {

    public static void main(String[] args) {
        long arr[] = { 4, 3, 2, 6 };
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        int totalCost = 0;

        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        while (minHeap.size() > 1) {

            long firstMin = minHeap.poll();
            long secondMin = minHeap.poll();
            long cost = firstMin + secondMin;

            totalCost += cost;
            minHeap.add(cost);
        }
        System.out.println(totalCost);
    }
}