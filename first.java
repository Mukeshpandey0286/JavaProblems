import java.util.*;

class first {
        public static void main (String[] args){
            int i , num;
            System.out.println("Enter the number :- ");
           Scanner sc = new Scanner(System.in);
           num = Integer.parseInt(sc.next());
           for (i = 1; i < num; i++) {
                for(int j = 1; j < i; j++) {
            System.out.print(j+ " ");
           }
           System.out.println(i+ " ");
        }
        }
}