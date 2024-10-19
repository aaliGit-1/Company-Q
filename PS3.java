/*Problem Statement: 
  At a fun fair, a street vendor is selling different colors of balloons. He sells N number of different colors of balloons.
  The task is to find the odd color of the balloon which is present odd number of times in the bunch of balloons.
  Note: If there is more than one color which is odd in number, then the first color in the array which is present odd number 
  of times is displayed. The colors of the balloons can all be either upper case or lower case in the array. If all the inputs
  are even in number, display the message "All are even".
 */
import java.util.Scanner;
public class PS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter number of balloons:");
	        int n=sc.nextInt();
	        char balloon[]=new char[n];
	        char hashArr[]=new char[26];
	        System.out.println("Enter 1st letter of color of balloons: ");
	        for(int i=0;i<n;i++){
	            balloon[i]=sc.next().charAt(0);
	            hashArr[balloon[i]-'a']+=1;
	        }
	        System.out.println("Any odd color balloon ? ");
	        int countEven=0;
	        for(int j=0;j<n;j++){
	            if(hashArr[balloon[j]-'a']%2!=0){
	                System.out.println(balloon[j]);
	            }
	            else{
	                countEven++;
	            }
	        }
	        if(countEven==n){
	            System.out.println("All are even.");
	        }
	}

}
