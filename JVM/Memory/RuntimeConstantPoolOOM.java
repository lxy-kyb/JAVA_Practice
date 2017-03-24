import java.util.*;

/**
 * RuntimeConstantPoolOOM
 * VM Args : -XX:PermSize=10m -XX:MaxPermSize=10m
 * Java Hotspot ignoring option PermSize=10m; support was removed in 8.0
 * New VM Args: -XX:MetaspaceSize=8m -XX:MaxMetaspaceSize=8m
 */
public class RuntimeConstantPoolOOM {
    static String  base = "string";
    public static void main(String[] args) {
        // List<String> list = new ArrayList<String>();
        // for (int i=0;i< Integer.MAX_VALUE;i++){
        //     String str = base + base;
        //     base = str;
        //     list.add(str.intern());
        // }
        String str2 = new StringBuilder("jaEEEEEEEE").append("vaEEEEE").toString();
        System.out.println(base.intern() == new StringBuilder("string").toString());
        String str1 = new StringBuilder("Computer").append("software").toString();
        System.out.println(str1.intern() == str1);
       

    }   

}