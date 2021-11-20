/* . Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P: 
 The given array is :
  1 2 
  3 4 
 The reverse of the array is :
  4 3 
  2 1  */


public class Array2D {
    public static void main(String[] args) {
        if(args.length != 4) System.out.println("Please enter 4 integer numbers.");
        else
        {   int[][] arr = new int[2][2];
            int k=0;
            for(int i=0;i<2;i++)
                for (int j=0;j<2;j++)
                {
                    arr[i][j] = Integer.parseInt(args[k]);
                    k++;
                }

            for (int i=0;i<2;i++) {
                for (int j = 0; j < 2; j++)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }


            for (int i=1;i>=0;i--) {
                for (int j = 1; j >= 0; j--)
                    System.out.print(arr[i][j] + " ");
                System.out.println();
            }
        }

    }
}
