import java.util.Scanner;

public class Java_codejaaz_day1 {
    public static void main(String[] args) {
//        CRICMETRIC
//        Problem Statement
//        In a cricket match, each batsman has a unique identifier, and their corresponding runs scored are stored in an array. Your task is to analyze the cricket match data and determine the following:
//        Input:
//        5
//        20 35 40 15 25
//
//        Output:
//        135
//        2
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int idx = -1;
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(arr[i]>min){
                min = arr[i];
                idx = i;
            }
        }
        System.out.println(sum);
        System.out.println(idx);
    }
}
