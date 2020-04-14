import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("|**********字符串的处理*********|");
        String str = "Hello";
        String s = str.substring(0, 3);
        System.out.println("str的值是:" + str);
        System.out.println("substring方法");
        System.out.println("str.substring(0,3)的值是:" + s);
        System.out.println("repeat");
        System.out.println("str.repeat(3)的值是:" + str.repeat(3));

        String str1 = "hello";
        String str2 = "hello";
        System.out.println("检测字段是否相等");
        System.out.printf("str1的值是%s, str2的值是%s, 他们的值是否相等：%b", str1, str2, str1.equals(str2));
    }
}
