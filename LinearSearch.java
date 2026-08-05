import java.util.*;
public class LinearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:-");
        int N =sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            System.out.println("Enter the value at index "+i);
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key to find: ");
        int Key =sc.nextInt();

        for(int i=0;i<N;i++){
            if(arr[i]==Key){
                System.out.println(i);
               return;
            }
        }
        System.out.println("Key Not found ");


    }

}