package s;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
// java 考试题

public class Factorial{
    public static void main (String args[ ]){
        sum();
        // 将结果重定向到C:\\2301111111111111\\编程题\\RESULT.DAT文件
        try {
            FileOutputStream ps = new FileOutputStream("result.dat");
            System.setOut(new PrintStream(ps));
            sum();
            ps.close();
        } catch (FileNotFoundException fError) {
            fError.printStackTrace();
            return;
        } catch (IOException ioError) {
            ioError.printStackTrace();
            return;
        }
        System.exit(0);
    }

    static void sum(){
        //开始
        int s = 1;
        int sum = 0;
        for(int i =1;i<10;i++){
            s = 1;
            for(int index = 1; index<=i;index++){

                s *= index;
            }

            sum += s;
        }
        System.out.println("sum="+sum);
        //结束  
    }
}