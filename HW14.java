import java.util.Scanner;

public class HW14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char word = scn.next().charAt(0);
        System.out.println((Integer.toHexString(word)));
    }
}
