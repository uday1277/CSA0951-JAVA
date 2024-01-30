public class MthAndNth {
    public static void main(String[] args) {
        int arr[] = {24,86,98,32,12,43,21};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int m = 2, n = 5;
        int max = arr[len - m];
        int min = arr[n - 1];
        System.out.print(m + "nd max number = " + max);
        System.out.print("\n" + n + "th min number = " + min);
        int sum = max + min;
        int Diff = max - min;
        System.out.print("\nSum = " + sum);
        System.out.print("\nDifference = " + Diff);
    }
}