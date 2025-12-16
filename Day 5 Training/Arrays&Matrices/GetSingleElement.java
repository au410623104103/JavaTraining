public class GetSingleElement {
    
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 4, 5, 3, 4};
       int unique=0;
       for (int i = 0; i < a.length; i++)
         {
           unique = unique ^ a[i];
       } 
       System.out.println(unique);
    }
}