package project.untit;

public class HammingWeight {
    //编写一个函数，输入是一个无符号整数（以二进制串的形式），
    // 返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量).）

    // n & (n-1) = x   x 比 n 二进制中1减少了1个
    public int hammingWeight(int n) {

        int count = 0, temp = n;
        while (temp != 0) {
            temp = (temp - 1) & temp;
            // 5 101 4 100  => 4 100
            count++;
        }
        return count;
    }
}
