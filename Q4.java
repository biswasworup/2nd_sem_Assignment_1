import java.util.*;
public class Q4 {
    private static void permute(char[] arr, int l, int r) {
        if (l == r) {
            System.out.println(String.valueOf(arr));
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i); // backtrack
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many alphabets you want to give as input : ");
        int n = sc.nextInt();
        System.out.println("enter alphabets to get multiple strings : ");
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        permute(arr, 0, n - 1);
    }
}
