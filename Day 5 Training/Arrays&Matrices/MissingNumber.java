public class MissingNumber {
    
    public static void main(String[] args) {
        int N=5;
        int a[] = {0, 1, 2, 3, 5};
        int sum=N*(N+1)/2;
        int sum1=0;
        for(int i=0;i<a.length;i++)
        {
            sum1+=a[i];
        }
        System.out.println(sum-sum1);
    }
}
