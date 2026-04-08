public class FindMaxNum {
    public static void main(String[] args) {
        int[] a = {3,5,8,70,300,2};
        int max = a[0];
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}