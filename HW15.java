import java.util.Scanner;

public class HW15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String  a = scn.next();
        int b = Integer.valueOf(a,16);
        System.out.println((char)b);
    }
    }
