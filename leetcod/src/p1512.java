import java.util.*;

public class p1512 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (inp.hasNext()) {
            int n = inp.nextInt();
            list.add(n);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i < j) {
                    if (nums[i] == nums[j])
                        count++;
                }
            }
        }
        return count;
    }
}
