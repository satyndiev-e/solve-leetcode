import java.util.*;
public class p4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lenA = nums1.length;
        int lenB = nums2.length;
        int lenC = lenA + lenB;
        int [] commonArr = new int [lenC];

        System.arraycopy(nums1, 0, commonArr, 0, lenA);
        System.arraycopy(nums2, 0, commonArr, lenA, lenB);

        Arrays.sort(commonArr);

        if (lenC % 2 == 1) {
            return (double) commonArr[lenC / 2];
        } else {
            int middle1 = commonArr[lenC / 2 - 1];
            int middle2 = commonArr[lenC / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }
}
