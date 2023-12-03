import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
//        Input 1
//        N = 4
//        H[] = {2, 3, 4, 5}
//        Output 1
//        4

//        Input 2
//        N = 5
//        H[] = {7, 4, 8, 2, 9}
//        Output 2
//        3

//        As 7 is the first element, it can see the sunrise. 4 can't see the sunrise as 7 is hiding it.
//        8 can see. 2 can't see the sunrise. 9 also can see the sunrise.
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int maxi=arr[0],res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxi){
                res++;
                arr[i]=maxi;
            }
        }
        System.out.println(res);
    }
}

