package com.skm.algo.problemsoliving;

/**
 * @author saroj on 10/10/2019
 */
public class FindRunningMedianUsingHeap {
    int maxElementSupported = 10;

    int[] minHeap = new int[maxElementSupported];
    int minIndex = 0;

    int[] maxHeap = new int[maxElementSupported];
    int maxIndex = 0;

    public static void main(String[] args) {
        new FindRunningMedianUsingHeap();
    }

    FindRunningMedianUsingHeap() {
        addNumber(5);
        float median = getMedian();
        System.out.println("Median :" + median); //5.0

        addNumber(8);
        median = getMedian();
        System.out.println("Median :" + median); //6.5

        addNumber(1);
        median = getMedian();
        System.out.println("Median :" + median); //5.0

        addNumber(4);
        median = getMedian();
        System.out.println("Median :" + median); //4.5

        addNumber(2);
        median = getMedian();
        System.out.println("Median :" + median); //4.0

        addNumber(8);
        median = getMedian();
        System.out.println("Median :" + median); //4.5

        addNumber(5);
        median = getMedian();
        System.out.println("Median :" + median); //5.0

        addNumber(5);
        median = getMedian();
        System.out.println("Median :" + median); //5.0
    }

    private float getMedian() {
        if (minIndex == maxIndex) {
            //Both MinHeap and MaxHeap contains same element
            float sum = minHeap[0] + maxHeap[0];
            return sum / 2;

        } else if (minIndex > maxIndex) {
            return minHeap[0];
        } else {
            return maxHeap[0];
        }
    }

    private void addNumber(int number) {
        if (number > minHeap[0]) {
            if (minIndex >= maxElementSupported) {
                throw new RuntimeException("minIndex reached max array limit, cannot continue");
            }
            minHeap[minIndex++] = number;
        } else {
            if (maxIndex >= maxElementSupported) {
                throw new RuntimeException("maxIndex reached max array limit, cannot continue");
            }

            //Randomly added the element in the max heap, so check if the max element is still at the peek(index 0),
            //if not, swap it with the element just added so that peek always contain max
            maxHeap[maxIndex++] = number;

            if (maxHeap[maxIndex - 1] > maxHeap[0]) {
                int temp = maxHeap[maxIndex - 1];
                maxHeap[maxIndex - 1] = maxHeap[0];
                maxHeap[0] = temp;
            }
        }

        if (Math.abs(minIndex - maxIndex) > 1) {

            if (minIndex > maxIndex) {
                //MinHeap contains more element
                int elementToTransfer = minHeap[0];
                minHeap[0] = minHeap[--minIndex];

                //Transferred to maxHeap
                maxHeap[maxIndex++] = elementToTransfer;
                if (maxHeap[maxIndex - 1] > maxHeap[0]) {
                    int temp = maxHeap[maxIndex - 1];
                    maxHeap[maxIndex - 1] = maxHeap[0];
                    maxHeap[0] = temp;
                }

                //MinHeap is disturbed, going for heapify to bring the smaller back on top of MinHeap.
                buildMinHeap(minHeap, minIndex);
            } else {
                //MaxHeap contains more element
                int elementToTransfer = maxHeap[0];
                maxHeap[0] = maxHeap[--maxIndex];

                //Transferred to minHeap
                minHeap[minIndex++] = elementToTransfer;
                if (minHeap[minIndex - 1] < minHeap[0]) {
                    int temp = minHeap[minIndex - 1];
                    minHeap[minIndex - 1] = minHeap[0];
                    minHeap[0] = temp;
                }

                //MaxHeap is disturbed, going for heapify to bring the largest back on top of MaxHeap.
                buildMaxHeap(maxHeap, maxIndex);
            }

        }
    }

    private void buildMinHeap(int[] minHeap, int minIndex) {
        int startIndex = (minIndex - 1) / 2;
        for (int i = startIndex; i >= 0; i--) {
            minHeapify(i, minHeap, minIndex);
        }
    }

    private void minHeapify(int indexRoot, int[] minHeap, int minIndex) {
        int leftChild = 2 * indexRoot + 1;
        int rightChild = 2 * indexRoot + 2;

        int min = indexRoot;
        if (leftChild < minIndex && minHeap[leftChild] < minHeap[min]) {
            min = leftChild;
        }
        if (rightChild < minIndex && minHeap[rightChild] < minHeap[min]) {
            min = rightChild;
        }

        if (min != indexRoot) {
            int temp = minHeap[min];
            minHeap[min] = minHeap[indexRoot];
            minHeap[indexRoot] = temp;
            minHeapify(min, minHeap, minIndex);
        }
    }

    private void buildMaxHeap(int[] maxHeap, int maxIndex) {
        int startIndex = (maxIndex - 1) / 2;
        for (int i = startIndex; i >= 0; i--) {
            maxHeapify(i, maxHeap, maxIndex);
        }
    }

    private void maxHeapify(int indexRoot, int[] maxHeap, int maxIndex) {
        int leftChild = 2 * indexRoot + 1;
        int rightChild = 2 * indexRoot + 2;

        int max = indexRoot;
        if (leftChild < maxIndex && maxHeap[leftChild] > maxHeap[max]) {
            max = leftChild;
        }
        if (rightChild < maxIndex && maxHeap[rightChild] > maxHeap[max]) {
            max = rightChild;
        }

        if (max != indexRoot) {
            int temp = maxHeap[max];
            maxHeap[max] = maxHeap[indexRoot];
            maxHeap[indexRoot] = temp;
            maxHeapify(max, maxHeap, maxIndex);
        }
    }
}