import java.util.*;
public class TestString {
    public static void main(String args[]) {
        String str = "欢迎来到JAVA世界";
        System.out.println(str.length());
        System.out.println(str);
        String newStr = "1,2,3,4,5";
        String[] StrList = newStr.split(",", 4);
        for(int i = 0; i < StrList.length; i ++) {
            System.out.print(StrList[i] + " ");
        }
        System.out.println();
    }

}