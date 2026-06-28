package String_Questions;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the string : ");
        String str = sc.next();
        System.out.println("The current entered string is : " + str);
        System.out.println("The reversed string is : " + reverseString(str));
        sc.close();
    }

    public static String reverseString(String str) {
        int i = 0, j = str.length() - 1;
        char[] arr = str.toCharArray();
        while (i < j) {
            char ch = arr[i];
            arr[i] = arr[j];
            arr[j] = ch;
            i++;
            j--;
        }
        return new String(arr);
    }
}