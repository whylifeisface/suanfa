package project.untit;


import java.util.Arrays;
import java.util.Objects;

public class A {
    public void mergeSort(int[] nums) {
        int start = 0, end = nums.length - 1;
        mergeSort(nums, start, end);
    }

    public void mergeSort(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        if (start == end) {
            return;
        } else {
            if (start < mid)
                mergeSort(nums, start, mid);
            if (mid + 1 < end)
                mergeSort(nums, mid, end);
            sort(nums, start, mid, end);
        }

    }

    public void sort(int[] nums, int start, int mid, int end) {
        int l = start, r = mid;
        while (l <= mid && r < end) {
            if (nums[l] < nums[r]) {
                l++;
            } else {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r++;
            }
        }
        System.out.println();
        // 4 5 6  1 2
        if (l < mid)
            for (int index = mid; index < end; index++) {
                if (!(nums[index] <= nums[index + 1])) {
                    int temp = nums[index];
                    nums[index] = nums[index + 1];
                    nums[index + 1] = temp;
                }
            }
            // 1 2 6 4 5 ==> 1 2 4 6 5
        else if (r < end) {
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
        System.out.println();

    }
    public void sort01(int[] nums, int start, int mid, int end) {
        int l = start, r = mid;
        int index = 0;
        while (l<=mid||r<end){

            if (nums[l]<nums[r]){
                l++;
                index++;
            }
            else if (nums[l]>nums[r]){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r++;
                index++;
            }else if(l == mid){
                nums[index] = nums[r];
                index++;
            }else {
                nums[index] = nums[l];
                index++;
            }
        }
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
        int[] ints = {1, 6, 5, 2, 4};
        mergeSort.mergeSort(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

//        test(new int[]{1, 2, 6, 4, 5}, 0, 2,4);

//        test01(new int[]{1, 2, 4, 6, 5}, 3, 4);
    }

}
