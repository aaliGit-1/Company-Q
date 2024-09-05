//Practice Question of UST (Loki's Mind Stone)
//Approach: First we will sort the array and take those series of numbers 
//by adding that numbers must be greater than the sum of the remaining numbers
import java.util.*;
public class UST_PQ2 {
	public static void printArr(int array[],int s,int e) {
    	for(int j=s;j<e;j++) {
    		System.out.print(array[j]+" ");
    	}
    	System.out.println();
    }
	public static int sumArr(int arr[],int start,int end) {
		int sum=0;
		for(int i=start;i<end;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of avengers members: ");
        int num=sc.nextInt();
        //System.out.println("Enter the power of each avenger: ");
	    int power[]= {9,3,1,2,4,2};
	    int sum=0,count=0;
	    //sort array
	    Arrays.sort(power); 
	    for(int k=power.length-1;k>=0;k--) {
	    	sum+=power[k];
	    	//System.out.println("sum: "+sum+",power[k]: "+power[k]);
	    	count++;
	    	int subArr=sumArr(power,0,k);
	    	if(sum>subArr==true) {
	    		System.out.println("SumArr: ");
	    		printArr(power,0,k);
	    		System.out.println("sumArr: "+subArr);
	    		break;
	    	}
	    }
	    System.out.println("Total number of avengers got brainwashed: "+count);
	}

}
