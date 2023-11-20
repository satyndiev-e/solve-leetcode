import java.util.*;

public class p01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String s = inp.nextLine();
        String [] newStr = s.split(" ");

        int[] arr = new int[newStr.length - 2];
        int target = 0;

        for (int i = 0; i < newStr.length; i++) {
            if(newStr[i].equals("")){
                target = Integer.parseInt(newStr[i + 1]);
                break;
            }
            arr[i] = Integer.parseInt(newStr[i]);
        }

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
