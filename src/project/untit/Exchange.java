package project.untit;

public class Exchange {
    //输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
    //
    // pass 执行用时：
    //2 ms
    //, 在所有 Java 提交中击败了
    //44.95%
    //的用户
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (isOdd(nums[i]) && i<j) i++;
            while (!isOdd(nums[j]) && i<j) j--;
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        int a = 6,b=5;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a"+a+"b"+b);
//        exchange.exchange()
    }
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
