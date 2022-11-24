package org.apache.commons.text;

public class StringBuilderTest {
    public static void main(String[] args) {
        TextStringBuilder test1 = new TextStringBuilder();
        test1.append("jUint Test");
        TextStringBuilder test2 = new TextStringBuilder();
        test2.append("JUint Test");
        String str1 = test1.toString();
        String str2 = test2.toString();
        char ch1 = 'j';
        char ch2 = 'J';
        boolean flag = test2.equals(test1);
        int FirstIndex = test1.indexOf(ch1,0);
        int LastIndex = test1.lastIndexOf(ch2, test1.length());

        if(FirstIndex != -1) System.out.println("字符"+ch1+"的位置为"+ FirstIndex);
        else System.out.println("字符串"+ test1.toString()+"中不含字符"+ch1);
        if(LastIndex != -1) System.out.println("字符"+ch2+"的最后一个位置为"+ LastIndex);
        else System.out.println("字符串"+ test2.toString()+"中不含字符"+ch2);
        if (flag) System.out.println("字符串"+str1+"和字符串"+str2+"相等");
        else System.out.println("字符串"+str1+"和字符串"+str2+"不相等");
    }
}
