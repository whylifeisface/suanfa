package project.untit;

public class HammingDistance {
// 汉明距离
//    指的是这两个数字对应二进制位不同的位置的数目。
//    给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
    public int hammingDistance(int x, int y) {
        // 获得两个整数 二进制位不同的数
        int num = x ^ y;
        //  求异 获得该数中的二进制数
        int index = 0;
        while (num != 0){
            num = num & (num-1);
            index++;
        }
        return index;
    }


    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        int i = hammingDistance.hammingDistance(5, 6);
        // 5 101 6 110
        System.out.println(i);
        System.out.println( 5 >> 2);
    }

}
