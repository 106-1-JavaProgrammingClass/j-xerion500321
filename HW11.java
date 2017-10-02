import java.util.Scanner;

public class HW11 {

    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int a = scn.nextInt();
     int b = scn.nextInt();
     int c = scn.nextInt();
        System.out.println(Math.max(c,Math.max(a,b)));
        System.out.println(Math.min(c,Math.min(a,b)));
    }
}