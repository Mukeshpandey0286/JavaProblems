import java.util.Scanner;

public class ReverseAr {
    public static void main(String[] args){
        int size,i;
        int arr[] = new int[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Array size :- ");
        size = sc.nextInt();
        System.out.println("Enter Array elements :- ");
        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(" Array elements are :- ");
        for(i=0; i<size; i++){
            System.out.println(" " +arr[i]);
        }
        System.out.println("Array Reverse is :- ");
        for(i=size-1; i>=0; i--){
        System.out.println(arr[i]+ " ");
        }
        
    }
}
