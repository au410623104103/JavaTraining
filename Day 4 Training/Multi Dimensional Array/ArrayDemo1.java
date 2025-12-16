import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[][] a={
            {1,2,3},
            {4,5,},
            {6,7,8,9}
        };  
    for(int i=0; i<a.length; i++)
    {
        for(int j=0; j<a[i].length; j++)
        {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
      int[][] arr= new int[3][4];
      arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[5];
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<arr.length; i++)
    {
        for(int j=0; j<arr[i].length; j++)
        {
            arr[i][j] = sc.nextInt();
        }
    }
    sc.close();
for(int i=0; i<arr.length; i++)
{
    for(int j=0; j<arr[i].length; j++)
    {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
    }
}