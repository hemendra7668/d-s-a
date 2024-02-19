 
 import java.util.Scanner;

 class Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        double result =0;
        
         result = power(base, exponent);
// if(exponent<0)
// {
// result=1/result;
// }
 System.out.println(result);
          
    }

    // public static int power(int base, int exponent) {
    //     if (exponent == 0)
    //         return 1;
    //     else if(exponent<0)
    //     {
    //         return base*power(base,exponent + 1);
    //     }
    //     else
    //         return base * power(base, exponent - 1);
    // }
    public static double power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else if(exponent<0)
        {
            return 1.0/base*power(base,exponent + 1);
        }
        else
            return base * power(base, exponent - 1);
    }
}

// if we change the value of exponent to positive and then similar 