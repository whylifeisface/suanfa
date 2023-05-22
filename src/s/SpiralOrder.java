package s;

//剑指 Offer 29. 顺时针打印矩阵
//        输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        int[] nums = new int[matrix.length * matrix[0].length];
        boolean control = true, leftOrRight = true, upOrDown = false;
        //leftOrRight true left  false right
        //upOrDown true up   false down
        //control  true是row打印 false col 打印
        int rowId = 0, colId = 0,  //当前行数 当前列数
                rowMax = matrix.length, colMax = matrix[0].length,
                index = 0;
        //index nums 下标
        while (rowMax >= 2 || colMax>=2) {
            if (control) {
                //row打印
                if (rowId <= rowMax) {
                    if (leftOrRight) {
                        nums[index++] = matrix[rowId][colId];
                        rowId += 1;

                    } else {
                        nums[index++] = matrix[rowId][colId];
                        rowId -= 1;

                    }
                } else {
                    //结束 控制quantities交给其他人
                    // rowmax--
                    // !leftOrRight
                    leftOrRight = !leftOrRight;
                    rowMax -= 1;
                    control = false;
                }
            } else {
                //col打印
                if (colId <= rowMax) {
                    if (upOrDown) {
                        colId += 1;
                        nums[index++] = matrix[rowId][colId];
                    } else {
                        colId -= 1;
                        nums[index++] = matrix[rowId][colId];

                    }
                } else {
                    //结束 控制quantities交给其他人
                    // rowmax--
                    // !leftOrRight
                    upOrDown = !leftOrRight;
                    colMax -= 1;
                    control = true;
                }
            }
        }
        return nums;
    }
}
