public class Plus_one {


public static void main(String[] args) {
    int[] digit={1,2,3};
    int[] returns = plusOne(digit);
    System.out.println(returns);
 }   

 public  static int[] plusOne(int[] digits) {
        
    int i = digits.length - 1;
  while (digits[i] == 9){
      if (i == 0){
          int[] res = new int[digits.length + 1];
          res[0] = 1;
          return res;
      }
      digits[i] = 0;
      i -= 1;
  }
  digits[i] += 1;
  return digits;
}
}

// int val=digits[digits.length-1]++;
// if(val>9)
// {
//     int rem=val%10;
//     int div= val/10;
//     List<Integer> arrList = new ArrayList( Arrays.asList(digits));

//        // adding a new element to the array
//        arrList.add(rem);
//        arrList.add(div); 
// int [] digit = arrList.toArray(new Integer[0]);
// }
// return digit;
//  }   
