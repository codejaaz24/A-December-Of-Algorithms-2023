import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println(Integer.toBinaryString(sum));
    }
}

