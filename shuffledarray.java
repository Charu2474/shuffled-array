import java.util.Scanner;

public class ShuffledArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) 
        {
            nums[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
