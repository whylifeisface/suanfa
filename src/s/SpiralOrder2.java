package s;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder2 {
    int index = 0;
    public int status(){
        this.index++;
        // 0向下
        if (this.index % 3 == 1) return 0;
        // 2 3 向 右
        return 1;
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
        int colId = 0, rowId = 0,
                rowMax = matrix[0].length, colMax = matrix.length;
        boolean topAndRight = true;
        list.add(matrix[rowId][colId++]);
        while (rowId < rowMax || colId < colMax) {
            if (topAndRight) {
                while (rowId >= 1)
                    list.add(matrix[rowId--][colId++]);
                topAndRight = false;
                if (status() == 0)//可省
                    rowId++;
            } else {
                while (rowId >= rowMax - 1)
                    list.add(matrix[rowId++][colId--]);
                topAndRight = true;
                if (status() == 1)//可省

                    colId++;
            }
        }
        return list;
    }
}
