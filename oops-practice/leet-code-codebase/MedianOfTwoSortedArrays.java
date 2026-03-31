import java.util.*;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter size of first sorted array: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter size of second sorted array: ");
        int m = sc.nextInt();
        int[] nums2 = new int[m];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        // Solution class object
        Solution sol = new Solution();

        // Finding median
        double median = sol.findMedianSortedArrays(nums1, nums2);

        // Output result
        System.out.println("Median of the two sorted arrays is: " + median);

        sc.close();
    }
}


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }

        while (i < nums1.length)
            ans[k++] = nums1[i++];

        while (j < nums2.length)
            ans[k++] = nums2[j++];

        if (ans.length % 2 == 0) {
            return (double) (ans[ans.length / 2] + ans[(ans.length / 2) - 1]) / 2;
        } else {
            return (double) ans[ans.length / 2];
        }
    }
}
