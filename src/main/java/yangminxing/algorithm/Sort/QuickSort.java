package yangminxing.algorithm.Sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] testInts = new int[]{5, 1, 4, 2, 3};
        quicksort(testInts, 0, testInts.length - 1);

        for (int i = 0; i < testInts.length; i++) {
            System.out.print(testInts[i] + ", ");
        }
    }

    public static void quicksort(int[] sourceInts, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return;
        }

        int pivot = partition(sourceInts, startIndex, endIndex);
        quicksort(sourceInts, startIndex, pivot - 1);
        quicksort(sourceInts, pivot + 1, endIndex);
    }

    public static int partition(int[] sourceInts, int startIndex, int initalPivotIndex) {
        int pivot = sourceInts[initalPivotIndex];
        int curisor = startIndex;

        for (int i = startIndex; i < initalPivotIndex; i++) {
            if (sourceInts[i] < pivot) {
                swap(sourceInts, curisor, i);
                curisor++;
            }
        }

        swap(sourceInts, curisor, initalPivotIndex);
        return curisor;
    }

    public static void swap(int[] ints, int aIndex, int bIndex) {
        int temp = ints[aIndex];
        ints[aIndex] = ints[bIndex];
        ints[bIndex] = temp;
    }
}
