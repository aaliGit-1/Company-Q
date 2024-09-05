//Practice Question of UST (Nearest smaller tower) 
import java.util.*;
public class UST_PQ {
    public static void printArr(int array[]) {
    	for(int j=0;j<array.length;j++) {
    		System.out.print(array[j]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {4,8,3,5,3};
        System.out.println("Original Array: ");
        printArr(arr);
        int small_num=0;
        int out_arr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
        	if(i==0) {//1st element of array
        		small_num=arr[i]<arr[i+1]?arr[i]:arr[i+1];//compare with 2nd element
        		small_num=small_num<arr[arr.length-1]?small_num:arr[arr.length-1];//compare with last element
        		if(small_num==arr[i])//if the element is same as the current element
        			out_arr[i]=-1;
        		else 
        			//index value of the smallest element
        			out_arr[i]=Arrays.binarySearch(arr,small_num);
        	}
        	else if(i==arr.length-1) {//last element of an array
        		small_num=arr[i]<arr[i-1]?arr[i]:arr[i-1];//compare with 2nd last element
        		small_num=small_num<arr[0]?small_num:arr[0];
        		if(small_num==arr[i])
        			out_arr[i]=-1;
        		else 
        			out_arr[i]=Arrays.binarySearch(arr,small_num);
        	}
        	else {//rest of the element
        		small_num=arr[i]<arr[i-1]?arr[i]:arr[i-1];//comparing with the LHS
        		small_num=small_num<arr[i+1]?small_num:arr[i+1];//comparing with RHS
        		if(small_num==arr[i])
        			out_arr[i]=-1;
        		else 
        			out_arr[i]=Arrays.binarySearch(arr,small_num);
        	}
        	/*System.out.println("small_num: "+small_num);
        	System.out.println("arr[i]: "+arr[i]);
        	System.out.println("out_arr: "+out_arr[i]);*/
        }
        System.out.println("Output Array: ");
        printArr(out_arr);
	}

}
