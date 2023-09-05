import java.util.*;

public class SqaurePattern {
    public static void main(String[] args){
        int i,j,n,m,num1,num2;
        System.out.println("Enter pattern no1 :-");
        Scanner sc = new Scanner(System.in);
        num1 = Integer.parseInt(sc.next());
         System.out.println("Enter pattern no2 :-");
         num2 = Integer.parseInt(sc.next());
         for(i=0;i<num1;i++){
            for(j=0;j<num2;j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
}
