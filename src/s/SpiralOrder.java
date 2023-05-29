package s;

import com.sun.source.tree.IfTree;

import java.util.Arrays;

//剑指 Offer 29. 顺时针打印矩阵
//        输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
/// 1 循环次数  2 无横向  3 mark
public class SpiralOrder {
    //    public int[] spiralOrder(int[][] matrix) {
//        if (matrix.length == 0) return new int[]{};
//        int length = matrix.length * matrix[0].length;
//        int[] nums = new int[length];
//        boolean control = true, leftOrRight = true, upOrDown = true;
//        //leftOrRight true left 减  false right 加
//        //upOrDown true up   false down 应该是加
//        //control  false是row打印 true col 打印
//        int rowId = 0, colId = 0,  //当前行数 当前列数
//                rowMax = matrix.length, colMax = matrix[0].length,
//                index = 0;
//        int mark = 1;
//        //index nums 下标
//        //
//        if (rowMax != colMax) {
//            if (rowMax == 1) {
//                for (int i = 0; i <= colMax - 1; i++) {
//                    nums[index++] = matrix[rowId][colId];
//                }
//                return nums;
//            } else if (colMax == 1) {
//                for (int i = 0; i <= rowMax - 1; i++) {
//                    nums[index++] = matrix[rowId][colId];
//                }
//                return nums;
//            }
//        }
//        int count = 1; //计数 次数  向右 和向下 好做 用 colId >= colMax -1  向左 向上 用 count <= rowMax - 1
//        int countRow = 0;
//        for (int i = 0; i <= length - 1; i++) {
//            if (control) {
//                // 0 1 2  2
//                if (leftOrRight) {  // 三次循环 数组越界
//                    nums[index++] = matrix[rowId][colId];
//                    colId++;
//                    countRow++;
//                    if (colId >= colMax - 1) {
//                        leftOrRight = !leftOrRight;
//                        control = !control;
//                        colId = colMax - 1;
//                        //如果是col = 1
//                        if (countRow == 1) rowId++;
//
//                        countRow=0;
//                    }
//                } else {
//                    nums[index++] = matrix[rowId][colId];
//                    colId--;
//                    count++;
//
//                    if (count > colMax - mark) {
//                        leftOrRight = !leftOrRight;
//                        control = !control;
//                        count = 1;
//                        colMax -= 1;
//                    }
//
//                }
//            } else {
//                if (upOrDown) {  // 三次循环 数组越界
//                    nums[index++] = matrix[rowId][colId];
//                    rowId++;
//                    if (rowId >= rowMax - 1) {
//                        upOrDown = !upOrDown;
//                        control = !control;
//                        rowId = rowMax - 1;
//                    }
//                } else {
//                    nums[index++] = matrix[rowId][colId];
//                    rowId--;
//                    count++;
//                    if (count > rowMax - mark) {
//                        upOrDown = !upOrDown;
//                        control = !control;
//                        count = 1;
//                        rowId++;
//                        colId++;
//                        rowMax -= 1;
//                        mark++;
//                    }
//                }
//            }
//        }
//        System.out.println();
//        return nums;
//    }
    public boolean nums_In(int[] nums, int index, int value) {
        if (index < nums.length)
            nums[index] = value;
        else return false;
        return true;
    }

    public int[] spiralOrder(int[][] matrix) {

        if (matrix.length == 0) return new int[]{};
        int rowId = 0, rowMax = matrix.length,
                colId = 0, colMax = matrix[0].length;
        int cLol = 1;
        int rRol = 1;
        // rowId ++ 是向右
        // colId ++ 是向下
//        while ()
        boolean control = true;
        int[] nums = new int[rowMax * colMax];
        int index = 0;
        while (rowMax >= 1 || colMax >= 1) {
            if (control) {
                while (colId < colMax - 1) {
                    nums_In(nums, index, matrix[rowId][colId++]);
                    index++;
                }
                while (rowId < rowMax - 1) {
                    if (!nums_In(nums, index, matrix[rowId++][colId])) {
                        break;
                    }
                    index++;
                }
                control = false;
            } else {
                while (colId >= cLol) {
                    if (!nums_In(nums, index, matrix[rowId][colId--])) {
                        break;
                    }
                    index++;
                }

                while (rowId > rRol) { //5->3 3->1
                    if (!nums_In(nums, index, matrix[rowId--][colId])) {
                        break;
                    }
                    index++;
                }
                rRol++;
                control = true;
                rowMax -= 1;
                colMax -= 1;
                cLol++;
                if (index < matrix.length * matrix[0].length)
                    nums[index++] = matrix[rowId][colId++];
                System.out.println();

            }
        }


        return nums;
    }

    public static void main(String[] args) {

        SpiralOrder spiralOrder = new SpiralOrder();
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] nums1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
//        4 -> 2
//        3->1
        int[][] nums2 = {
                {3},
                {2}
        };
        int[][] nums3 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[][] nums4 = {
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13}
        };

        int[] ints = spiralOrder.spiralOrder(nums3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
