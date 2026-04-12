package basics;

public class FindMin {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 19, 1, 7};
        System.out.println("Minimum: " + findMin(arr));
    }
}
