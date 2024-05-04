import java.util.*;

public class LUCSorter {
    private int[] a;

    public LUCSorter(int[] anArray) {
        a = anArray;
    }

    public void divisibleByKFirst(int k) {
        if (k == 0) {
            return;
        }

        if (a.length <= 1) {
            return;
        }

        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];
        System.arraycopy(a, 0, first, 0, first.length);
        System.arraycopy(a, first.length, second, 0, second.length);
        LUCSorter firstSorter = new LUCSorter(first);
        LUCSorter secondSorter = new LUCSorter(second);
        firstSorter.divisibleByKFirst(k);
        secondSorter.divisibleByKFirst(k);
        merge(first, second, k);
    }

    private void merge(int[] first, int[] second, int k) {
        int[] merged = new int[first.length + second.length];
        int mergedIndex = 0;
        int a = 0;
        int b = 0;

        while (a < first.length && b < second.length) {
            int remainderA = first[a] % k;
            int remainderB = second[b] % k;
            if (remainderA == 0 && remainderB != 0) {
                merged[mergedIndex++] = first[a++];
            } else if (remainderB == 0 && remainderA != 0) {
                merged[mergedIndex++] = second[b++];
            } else if (remainderA < remainderB || (remainderA == remainderB && first[a] < second[b])) {
                merged[mergedIndex++] = first[a++];
            } else {
                merged[mergedIndex++] = second[b++];
            }
        }
        while (a < first.length) {
            int remainderA = first[a] % k;
            if (remainderA == 0) {
                merged[mergedIndex++] = first[a];
            }
            a++;
        }
        while (b < second.length) {
            int remainderB = second[b] % k;
            if (remainderB == 0) {
                merged[mergedIndex++] = second[b];
            }
            b++;
        }
        System.arraycopy(merged, 0, first, 0, first.length);
        System.arraycopy(merged, first.length, second, 0, second.length);
    }

    // This method is used to check your work
    public static void check(int[] a, int k) {
        LUCSorter sorter = new LUCSorter(a);
        sorter.divisibleByKFirst(k);
        System.out.println(Arrays.toString(a));
    }
}
