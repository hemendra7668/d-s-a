import java.util.Arrays;
import java.util.Random;
public class Stream_api {
    public static void main(String[] args) {
       
        int ar[]={12,10,23,45,56};
//  using the  stream api, finding the max element from the unsorted array

    // int max = Arrays.stream(ar).max().getAsInt();
    // System.out.print("the max element is "+max);


//now finding the average of the arr
    double avg = Arrays.stream(ar).average().getAsDouble();
     System.out.print("the avg for array element is "+avg);

// use of random function
int[]arr =new int[20];
    Random r = new Random();
    for (int i = 0; i < arr.length; i++) {
        arr[i]= r.nextInt(10,100);
    }
  System.out.println(Arrays.toString(arr));
  
// finding the even numbers from the array
int[]ev=Arrays.stream(arr).filter(num -> num%2==0).toArray();
System.out.println(Arrays.toString(ev));

int[]val=Arrays.stream(arr).filter(value ->value>56 ).toArray();
System.out.println(Arrays.toString(val));

  
// some sort of the string operations usng the stream api
 String []sr ={"hello friends","my friend", "no-one", "nobody"};
Object [] str=  Arrays.stream(sr).filter(t -> t.startsWith("no")).toArray();
System.out.println(Arrays.toString(str));

//use of maps for solving the problems (stream and the maps have a basic difference , map always return the whole arrray even when it has noo elements but in casee of stream it returns the resultant values after performing the operation)


int aray[]= new int[56];
aray= Arrays.stream(arr).filter(num -> num>66).map(operand -> operand ).toArray();
System.out.println(Arrays.toString(aray));








    }
}
