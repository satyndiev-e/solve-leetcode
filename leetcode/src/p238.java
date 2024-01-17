import java.util.Arrays;
import java.util.Scanner;

public class p238 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4};

        int[] newArr = productExceptSelf(arr);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] arrOfProd = new int[nums.length];
        arrOfProd[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            arrOfProd[i] = arrOfProd[i - 1] * nums[i - 1];
        }

        int right = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            right *= nums[i + 1];
            arrOfProd[i] *= right;
        }
        return arrOfProd;
    }
}
