//How many anagrams present in an array
import java.util.*;

public class Eygds1 {
	
    public static String sortString(String s) {
    	s=s.toLowerCase();//all in small letters
    	//converting each character of a string to an array 
    	char temArr[]=s.toCharArray();
    	//sorting each character of the string
    	Arrays.sort(temArr);
    	//converting temArr to a String
    	return new String(temArr);
    }
    public static int countAnagram(List<String> arr) {
    	String anagram=sortString(arr.get(0));
    	System.out.println("ana: "+anagram);
    	int count=1;
    	for(int i=0;i<arr.size()-1;i++) {
    		for(int j=i+1;j<arr.size();j++) {
    			if(sortString(arr.get(i)).equals(sortString(arr.get(j)))) {
    				System.out.println(arr.get(i));
    				System.out.println(arr.get(j));
    				count++;
    			}
    		}
    	}
    	return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> arr=new ArrayList<String>(3);
        arr.add("bac");
        arr.add("ba");
        arr.add("abc");
        //print the ArrayList
        System.out.print("ArrayList: ");
        for(String s:arr) {
        	System.out.print(s+" ");
        }
        System.out.println();
        int c=countAnagram(arr);
        System.out.println("Number of anagrams present in the array: "+c);
	}

}
