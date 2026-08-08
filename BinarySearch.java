import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int N= sc.nextInt();
        int arr[]  = new int[N];
        
        for(int i=0;i<N;i++){
        System.out.println("Enter the value at index "+i+":");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the Key to find");
        int key = sc.nextInt();
        
        Arrays.sort(arr);//BinarySearch always Works on Sorted Arrays
        
        int p=0;
        int q=arr.length-1;
        int mid = (p+q)/2;
        int pass=0;
        
        
        System.out.println("==========**********==========**********==========");
        System.out.println("P   Q   Mid");
        
        while(p<=q){
            pass++;
            System.out.println("Pass: "+pass);
            
            System.out.println(p+"  "+q+"   "+mid);
            
            if(key ==arr[mid]){
                System.out.println("Key found at index: "+mid);
                break;
            }
            if(key<arr[mid]){
                q=mid-1;
                mid = (p+q)/2;
            }
            if(key>arr[mid]){
                p=mid+1;
                mid = (p+q)/2;
            }
            
        }
        System.out.println("==========**********==========**********==========");
    }
}