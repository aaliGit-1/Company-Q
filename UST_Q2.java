//UST Question 
//Given a nested list and an array find the median of each sub-array as given in the list and return the total median
import java.util.*;
public class UST_Q2 {
    public static void printArr(int arr[],int start,int end) {
    	for(int i=start;i<end;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        List<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(3);
		List<List<Integer>> list=new ArrayList<>();
        list.add(l1);
        list.add(l2);
        System.out.println("List of list: "+list);
        int size=list.size();//given nested list
        System.out.println("Size of list of list: "+size);
        int array[]= {1,2,2};//given array
        int median=0,output=0;//variables to store median and output
        for(int i=0;i<size;i++) {
        	int start=list.get(i).get(0);//1st element of inner list
        	int end=list.get(i).get(1);//2nd element of inner list
        	System.out.println("Print sub-array: ");
        	printArr(array,start-1,end);
        	if(end==2) {
        		median=(int)(array[0]+array[1])/2;
        		output+=median;
        		System.out.println("median:"+median+",output:"+output);
        	}
        	else if(end>2&&end%2!=0) {
        		int mid=(int)end/2;
        		median=array[mid];
        		output+=median;
        		System.out.println("median:"+median+",output:"+output);
        	}
        	else if(end>2&&end%2==0) {
        		int mid=(int)end/2;
        		median=(int)(array[mid]+array[mid-1])/2;
        		output+=median;
        		System.out.println("median:"+median+",output:"+output);
        	}
        }
        System.out.println("Total median: "+output);
	}

}
