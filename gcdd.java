class Gcd{


 public static int gc(int a, int b)
 {

    int c = b;
while(c>0)
{
    if(a%c==0)
    {
        break;
    }
    c--;
}

 }


    public static void main(String[]args)
    {


int res= gc(a,b);
System.out.println();
    }

}