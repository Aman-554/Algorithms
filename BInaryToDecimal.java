import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a binary No:-");
        String num = sc.nextLine();
        
        int count = num.length()-1;
        int ans =0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='1'){
                ans+=Math.pow(2,count);

            }
            count--;
        }
        System.out.println(ans);
    }
}