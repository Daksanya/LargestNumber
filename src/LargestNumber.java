import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println(largestNum(array,n));

    }
    public static String largestNum(int[] array,int n)
    {
        String[] string=new String[n];
        for(int i=0;i<n;i++){
            string[i]=String.valueOf(array[i]);
        }
        Arrays.sort(string,(s1,s2)->(s2+s1).compareTo(s1+s2));
        if(string[0].charAt(0)=='0'){
            return "0";
        }
        StringBuilder answer=new StringBuilder();
        for(String s:string){
            answer.append(s);
        }
        return answer.toString();
    }
}