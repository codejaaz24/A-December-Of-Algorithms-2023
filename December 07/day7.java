import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(rectangleInCircle(5, 9, 5));
    }

    private static boolean rectangleInCircle(int l, int b, int r) {
        double diag = Math.sqrt((double) Math.pow(l,2)+(double) Math.pow(b,2));
        double diam = r*2;
        return diag<=diam?true:false;
    }
}

