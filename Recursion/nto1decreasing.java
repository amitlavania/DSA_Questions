// print number from n to 1 in decreasing order 
public class nto1decreasing {
    public static void printdec (int n){
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n+"");
        printdec(n-1);
        
    }
    public static void main(String[] args) {
        int n =10;
        printdec(n);
    }

    
}
