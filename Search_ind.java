import java.util.Scanner;
public class Search_ind {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   
    int arr[]={1,4,5,9,-2,40,10};
    int target=s.nextInt();

    Search_ind se = new Search_ind();
    int res= se.find_ind(arr,target);
    System.out.println("the index is "+ res);
  }  


  int find_ind(int arr[], int target)
  {
    int re=0;
    int a[]=arr;
    for(int i = 0; i<a.length; i++)
    {
        int ar=a[i];
        // System.out.print(target==ar);
        if(target == ar)
        {
            re = i;
            break;
        }
        else
        {
           
            re = 0;
        }
    }
    return re;
  }
}
