import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String  str = scn.next();
        char ou = scn.next().charAt(0);
        System.out.println(str.replace(ou ,'\n'));
    }
}