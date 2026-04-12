package basics;

public class FindMax {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 19, 1, 7};
        System.out.println("Maximum: " + findMax(arr));
    }
}
