package project.untit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntUnaryOperator;

//剑指 Offer 45. 把数组排成最小的数
//输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，
// 打印能拼接出的所有数字中最小的一个。
public class MinNumber {
    public String minNumber(int[] nums) {
        String[] n = new String[nums.length];
        int index = 0;
        for (int m:nums) {
            n[index++] = String.valueOf(m);
        }
        System.out.println();
        Arrays.sort(n, (o1, o2) -> {
            //303 330
          if ((new StringBuilder(o1)).append(o2).compareTo((new StringBuilder(o2)).append(o1)) > 0){
              return 1;
          }
          return -1;
        });
        StringBuilder s = new StringBuilder();
        for (String integer : n) {
            s.append(integer);
        }
        return s.toString();
    }

    public static void main(String[] args) {


        MinNumber minNumber = new MinNumber();
        String s = minNumber.minNumber(new int[]{10,2});//"3033459" // {3,30,34,5,9}
        System.out.println(s);
    }
}
