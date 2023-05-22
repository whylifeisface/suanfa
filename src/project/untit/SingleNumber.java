package project.untit;

public class SingleNumber {
    //给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，
    // 其余每个元素均出现两次。找出那个只出现了一次的元素。

    //解决思路
    // n ^ n = 0    0 ^ n = n
    // 把数组的所有元素都进行异或 相同的变为0 最终 0 ^ n = n  那么 n就是只出现一次的元素
    public int singleNumber(int[] nums) {
        int results = 0;
        for (int o :
                nums) {
            results = results ^ o;
        }
        return results;
    }
}
