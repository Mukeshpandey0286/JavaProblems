import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size;
        System.out.println("Enter 2D Arrays  size :-");
        size = Integer.parseInt(sc.next());
        
        int ar1[][] = new int[size][size];
        int ar2[][] = new int[size][size];
        int c[][] = new int[size][size];
        int i,j,k;

        // Getting first array here..
        System.out.println("Enter 2D Array1 elements :- ");
        for(i=0; i<size;i++){
            for(j=0;j<size;j++){
                ar1[i][j] = sc.nextInt();
                // ar1[i][j]= (i + 1) * (j + 1);
            }
        }
        System.out.println("2D Array1 elements are :-");

        for(i=0; i<size;i++){
            for(j=0;j<size;j++){
             System.out.print(" " +ar1[i][j]);
            }
            System.out.println("");
        }

        // Getting second matrix..

    //       System.out.println("Enter 2D Array2 Row size :-");
    //     size = Integer.parseInt(sc.next());
        
    //     System.out.println("Enter 2D Array2 Col size :-");
    // size = Integer.parseInt(sc.next());
    System.out.println("Enter 2D Array2 Elements  :-");

        for(i=0; i<size;i++){
            for(j=0;j<size;j++){
                ar2[i][j] = sc.nextInt();
                // ar1[i][j]= (i + 1) * (j + 1);
            }
        }

        System.out.println("2D Array2 elements are :-");

        for(i=0; i<size;i++){
            for(j=0;j<size;j++){
             System.out.print(" " +ar2[i][j]);
            }
            System.out.println("");
        }

        // Matrix multiplication section...

        System.out.println("The Matrix Product is :-");

          for(i=0; i<size;i++){
            for(j=0;j<size;j++){
                for( k=0; k<size; k++){
                    c[i][j] +=  ar1[i][k] * ar2[k][j];
                }
            //  System.out.print(" " +c[i][j]);
            }
            // System.out.println("");
        }

        // product of matrix printing..
        
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                System.out.print(" " +c[i][j]);
            }
            System.out.println();
        }
        
    }
}

