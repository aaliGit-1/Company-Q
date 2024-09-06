//Triplet formed and check whether the triplet is valid or not by using
//Triangle Inequality rule: sum of first two side > the third side

public class Eygds2 {
    //slice the array to form the triplet
	public static int[] triplet(int ar[],int start) {
		int triplet[]=new int[3];
		for(int i=start,t=0;i<start+3&&t<3;i++,t++) {
			triplet[t]=ar[i];
		}
		return triplet;
	}
	public static boolean validTriplet(int tri[]) {
		//using triangle inequality property
		boolean ans=false;
		int sum=tri[0]+tri[1];
		if(sum>tri[2])
			ans=true;
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {3,4,6,5};
        int checkTrip[]=new int[3];
        int count=0;
        for(int i=0;i<arr.length-1;i++) {
        	if(arr[i]<arr[i+1]&&arr.length-i>=3) {
        		checkTrip=triplet(arr,i);
        		if(validTriplet(checkTrip)==true)
        			count++;
        	}
        }
        System.out.println("Total valid triplet formed: "+count);
	}

}
