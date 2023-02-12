public class factorialofn {
    public static int fact(int n )
    {
        if(n==0)
        {
            return 1;
        }
        int fnm1=fact(n-1);
        int fnm2=n*fnm1;
        return fnm2;
    }
    public static void main(String[] args) {
        int n=5;
        fact(5);
        System.out.println(fact(n));
        
    }
    
}
