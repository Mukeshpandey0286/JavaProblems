import java.util.Scanner;

public class HghtestValArray {
    public static void main(String[] args){
        int size;
        int max = 0;
        int ar[] = new int[10];
        System.out.println("Enter Array size :-");
        Scanner sc= new Scanner(System.in);
        size = Integer.parseInt(sc.next());
          System.out.println("Enter Array elements :-");
        for(int i=0; i < size; i++){
            ar[i] =  sc.nextInt();
        }
        System.out.println("Array elements are:- ");
        for(int i=0; i<size; i++){
            System.out.println(ar[i]);
        }
        for(int i=0; i<size; i++){
            // System.out.println(ar[i]);
            if(ar[i] > max){
                max = ar[i];
        
            }
        }
        System.out.println("This is the largest no " + max  );

}
}
