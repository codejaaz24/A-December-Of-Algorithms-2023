import java.util.*;

public class day2 {
    public static void main(String[] args) {
//        Input 1
//                [2,2,3,4,5,6,2,4,6,7]
//        Output 1
//                [3,1,2,1,2,1]
//
//
//        Frequency of 2: 3
//        Frequency of 3: 1
//        Frequency of 4: 2
//        Frequency of 5: 1
//        Frequency of 6: 2
//        Frequency of 7: 1
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s=s.substring(1,s.length()-1);
        String[] arr = s.split(",");
        //System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        SortedMap<Integer,Integer> m=new TreeMap<>();

        for(int x:arr1){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        int[] res = new int[m.size()];
        int p=0;
        for(int k:m.keySet()){
            res[p++]=m.get(k);
        }
        System.out.println(Arrays.toString(res));
    }
}
