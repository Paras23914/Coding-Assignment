import java.util.Arrays;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1st Word");
        String first=scanner.nextLine();
        System.out.println("2nd Word");
        String second=scanner.nextLine();

        System.out.println(check(first,second));
        scanner.close();
    }

    public static boolean check(String s1,String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }

        char[] v1=s1.toLowerCase().toCharArray();
        char[] v2=s2.toLowerCase().toCharArray();
        Arrays.sort(v1);
        Arrays.sort(v2);

        return Arrays.equals(v1, v2);
    }
}