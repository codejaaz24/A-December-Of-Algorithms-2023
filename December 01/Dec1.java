import java.util.Scanner;

public class Dec1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum=0;
        int idx =-1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(max<arr[i]){
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(sum);
        System.out.println(idx);
    }
}
