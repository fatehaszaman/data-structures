import java.io.*;

public class Tester123 {
    public static void main(String[] args)
    {
        String s = "abcdabd";
        String temp = "" + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (!temp.contains(
                    String.valueOf(s.charAt(i))))
                temp = temp + s.charAt(i);
        }
        System.out.println(temp);
    }
}
