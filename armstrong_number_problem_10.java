public class armstrong_number_problem_10{
      public static void main(String args[]){
           
                  int hardcoded_range = 407;
                  int total_sum = 0;
                  
                  System.out.print("List of Armstrong numbers: ");

                  // loops from 1 to hardcoded range
                  for (int i = 1; i <= hardcoded_range; i++) {
                  
                  // temporary variable for while loop      
                  int num = i;
                  // variable for sum
                  int sum = 0;
                  int digits = String.valueOf(num).length(); // number of digits of current number
                  
                  while (num > 0) {
                        int last_digit = num % 10;           // extract last digit
                        sum += Math.pow(last_digit, digits); // raise to power of digits and add to sum
                        num = num / 10;                      // remove last digit
                  }
                  
                  if (sum == i) {
                        System.out.print(i + " ");
                        total_sum += i;
                  }
            } 
                  System.out.println();
                  System.out.print("Sum of all Armstrong numbers found is " + total_sum);
      }   
}
