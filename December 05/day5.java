import java.util.Arrays;
import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String s = in.nextLine();
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        int[] array = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
            sum+=array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
        int s2=0;
        for(int x:array){
            if(x>=sum/ array.length){
                s2+=x;
            }
        }
        System.out.println(s2);
    }
}

