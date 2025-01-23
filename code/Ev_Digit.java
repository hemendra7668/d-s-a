

public class Ev_Digit {
    
    public static void main(String[] args) {
        // int[]nums={12,4586,4,369};
        int[]nums={12,345,2,6,7896};
     Solutionn sol= new Solutionn();
     
       int ew=sol.findNumbers(nums);   
    System.out.println(ew );
    }
}
class Solutionn {
    public int findNumbers(int[] nums) {
        int dig=0;
        int count=0;
        for(int i : nums)
        {
         while(i>0)
         {
             dig++;
             i=i/10;
         }
        
        if(dig%2==0)
        {
            count++;

        }
        dig=0;
        }
        return count;
    }
}