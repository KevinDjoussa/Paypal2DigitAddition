import java.lang.*;
import java.io.*;
import java.util.*;

// find the smallest integer not in the list
class Solution2
{

  public static int solution2 (int A[]) {

    ArrayList<Integer> B = new ArrayList<Integer>();
    int sum = 0;

    for(int i = 0; i < A.length; i++ ) {
      if (A[i] > 0) {
        if (A[i] < 100 && A[i] > 9) {

          sum += A[i];

        }
      }//end of if

      if (A[i] < 0) {
        if (A[i] > -100 && A[i] < -9) {

          sum += A[i];

        }

      }

    }//end of for
    System.out.println(sum);
      return sum;

    }


    // write your code in Java SE 8
  //}
  public static void main (String[] args)
  {

    int A[] ={ 1, 0, 8, 9, 20, 39};

    int res = solution2(A);


  }
}
