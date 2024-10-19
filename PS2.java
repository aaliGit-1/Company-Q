/*Problem Statement: 
  Given an integer array of size N. The task is to find the count of elements whose value is greater than all of its prior
  elements. Note: 1st element of the array should be considered in the count of the result.
  Sample Input: 
  Array: {7,4,8,2,9}
  Output: 3
 */
import java.util.Scanner;
public class PS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int count=0;
        int num[]={3,4,5,6,9};
        for(int i=0,j=i+1;i<num.length-1;i++,j++){
            if(num[i]<num[j]){
                count++;
            }
        }
        System.out.println("Elements greater than prior elements in array: "+(count+1));
        //count+1 as 1st number is also considered
	}

}
