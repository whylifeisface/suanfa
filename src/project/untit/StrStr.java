package project.untit;

import java.util.Arrays;

//28. 找出字符串中第一个匹配项的下标
//给你两个字符串 haystack 和 needle ，请你在 haystack
// 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）
// 。如果 needle 不是 haystack 的一部分，则返回  -1 。
//
//
public class StrStr {
    public int strStr(String haystack, String needle) {
        char[] cs = haystack.toCharArray();
        Arrays.sort(cs);
        int i = 0;
        StringBuilder s = new StringBuilder();
        char[] chars = needle.toCharArray();
        for (char aChar : chars) {
            i = Arrays.binarySearch(cs, aChar);
        }
        String s1 = s.toString();
        return i;

    }

    public static void main(String[] args) {
        StrStr strStr = new StrStr();
        int i = strStr.strStr("sadbutsad", "sad");
        System.out.println(i);
    }
}
