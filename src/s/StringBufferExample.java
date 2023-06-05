package s;
// java 考试题
class StringBufferExample {
    public static void main(String args[ ]) {
        StringBuffer str=new StringBuffer("ABCDEFG");
        //**********Found**********向str尾加“123456789”
        str.append("123456789");
        System.out.println(str);
        //**********Found**********将str中的字符 'B'替换为 'b'
        str.replace(str.indexOf("B"),str.indexOf("B")+1,"b");
        System.out.println(str);
        //**********Found********** 获取str中首次出现“1”的位置
        int index=str.indexOf("1");
        System.out.println(index);
    }
}
