package project.untit;

import java.util.Arrays;
import java.util.Objects;

public class MergeSort {
    public void mergeSort(int[] nums) {
        int start = 0, end = nums.length - 1;
        mergeSort(nums, start, end);
    }

    public void mergeSort(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        if (start == end) {
            return;
        } else {  //0 1 2  3 4 5
            if (start < mid)
                mergeSort(nums, start, mid);
            // 相当于 奇数时 把数组分为前奇数后偶数 长度3的数组 分为 1  2 把中间值放到后面的数组里
            if (mid + 1 < end)
                mergeSort(nums, mid, end);
            sort01(nums, start, mid, end);
        }

    }

    public void sort(int[] nums, int start, int mid, int end) {
        int l = start, r = mid;
        while (l <= mid && r < end) {
            if (nums[l] < nums[r]) {
                l++;
                //if (nums[l]>nums[r])
            } else {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r++;
            }
        }
        System.out.println();
        // 4 5 6  1 2
        // 左边提前结束
        if (l < mid)
            for (int index = mid; index < end; index++) {
                if (!(nums[index] <= nums[index + 1])) {
                    int temp = nums[index];
                    nums[index] = nums[index + 1];
                    nums[index + 1] = temp;
                }
            }
        else if (r == end && mid == l) {
            for (int index = mid; index < end; index++) {
                if (!(nums[index] <= nums[index + 1])) {
                    int temp = nums[index];
                    nums[index] = nums[index + 1];
                    nums[index + 1] = temp;
                }
            }
        } else if (l == mid && nums[r] < nums[l]) {
            for (int index = start; index < end; index++) {
                if (nums[index] < nums[r]) {
                    int temp = nums[index];
                    nums[index] = nums[r];
                    nums[r] = temp;
                }
            }

        }
        System.out.println();

    }

    public void sort01(int[] nums, int start, int mid, int end) {
        int l = start, r = mid;
        int index = 0;

        while (l < mid || r < end) {

            if (nums[l] < nums[r]) {
                l++;
                index++;
            } else if (nums[l] > nums[r]) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r++;
                index++;
            } else if (l == mid) {
                int temp = nums[index];
                nums[index] = nums[r];
                nums[r] = temp;
                r++;
                index++;
            } else {
                int temp = nums[index];
                nums[index] = nums[l];
                nums[l] = temp;
                l++;
                index++;
            }
        }
        System.out.println();
    }

    // 1 2 6  4 5
    public static void test(int[] nums, int l, int mid, int end) {
        if (l < mid)
            for (int index = mid; index < end; index++) {
                if (!(nums[index] <= nums[index + 1])) {
                    int temp = nums[index];
                    nums[index] = nums[index + 1];
                    nums[index + 1] = temp;
                }
            }
        for (int anInt : nums) {
            System.out.println(anInt);
        }
    }

    //1 2 6 4 5 ==> 1 2 4 6 5
    public static void test01(int[] nums, int r, int end) {
        if (r < end) {
            while (r < end) {
                //数组越界
                if (nums[r] > nums[r + 1]) {
                    int temp = nums[r];
                    nums[r] = nums[r + 1];
                    nums[r + 1] = temp;
                }
                r++;
            }
        }
        for (int anInt : nums) {
            System.out.println(anInt);
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] ints = {9, 5, 1, 55, 1};
        mergeSort.mergeSort(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

//        test(new int[]{1, 2, 6, 4, 5}, 0, 2,4);

//        test01(new int[]{1, 2, 4, 6, 5}, 3, 4);
    }

}
