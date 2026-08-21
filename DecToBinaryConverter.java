import java.util.*;
public class DecToBinaryConverter {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a no : ");
        int N = sc.nextInt();
        int count=0;
        ArrayList<Integer> list =  new ArrayList<>();
        while(N >0){
         int num = N%2;
         list.add(num);
         N/=2;
         count++;

        }
        for(int i=count-1;i>=0;i--){
            System.out.print(list.get(i));
        }


    }
}
