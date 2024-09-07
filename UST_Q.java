//UST Question
public class UST_Q {
    public static void printArr(int arr[]) {
    	for(int j=0;j<arr.length;j++) {
    		System.out.print(arr[j]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String A="23873437289";
        String B="22378897";
        int hash_arr[]=new int[10];//contains 0 to 9
        //storing the occurence of a number in String A
        for(int i=0;i<A.length();i++) {
        	int t=Character.getNumericValue(A.charAt(i));
        	//System.out.print(t+",");
        	hash_arr[t]+=1;
        }
        //System.out.println();
        System.out.println("Hash-Array after A: ");
        printArr(hash_arr);
        //subtracting the occurence of a number in String A
        for(int k=0;k<B.length();k++) {
        	int t=Character.getNumericValue(B.charAt(k));
        	//System.out.print(t+",");
        	hash_arr[t]-=1;
        }
        //System.out.println();
        System.out.println("Hash-Array after B: ");
        printArr(hash_arr);
        //initializing the variable where the output will be stored
        String output="";
        //sub is used for taking the index of the String A from which the minimized number be obtained
        //diff: difference between the length of two numbers StringA-StringB
        int sub=0,diff=A.length()-B.length();
        //comparing the String A with the hash_arr will take those values whose index value>=1
        for(int m=0;m<A.length()-1;m++) {
        	int s=Character.getNumericValue(A.charAt(m));//Numeric value of 1st character
        	int t=Character.getNumericValue(A.charAt(m+1));//Numeric value of 2nd character
        	if(diff>=2&&(hash_arr[s]>=1&&hash_arr[t]>=1)) {//if both 1st & 2nd have hash value of 1 then 
        		sub=m;//take the starting index of substring
        		break;
        	}
        }
        output=A.substring(sub,sub+diff);//taking the substring  
        System.out.println("output: "+output);
	}

}
