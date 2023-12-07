import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int i=0,j=s.length()-1;
        String res ="";
        while (i<j){
            //System.out.println(s.substring(i,j+1));
            if(s.substring(i,j+1).equals(rev(s.substring(i,j+1)))){
                res = s.substring(i,j+1);
            }
            i++;
            j--;
        }
        res=res.length()<1 ?"Error":res;
        System.out.println(res);
    }
    public static String rev(String s){
        StringBuilder sb =  new StringBuilder(s);
        return sb.reverse().toString();
    }
}

