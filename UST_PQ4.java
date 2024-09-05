//Practice Question of UST (Minimizing String)
import java.util.Arrays;
public class UST_PQ4 {
	public static void printArr(char array[]) {
    	for(int j=0;j<array.length;j++) {
    		System.out.print(array[j]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="abaacbac";
        String out="";
        char charArr[]=s.toCharArray();
        for(int i=0,j=i+1;j<charArr.length&&i<j;i++,j++) {
        	if(charArr[i]=='b'&&charArr[j]=='a') {
        		char temp=charArr[i];
        		charArr[i]=charArr[j];
        		charArr[j]=temp;
        		System.out.println("Swap:");
        		printArr(charArr);
        	}
        	else if(charArr[i]=='c'&&charArr[j]=='b') {
        		char temp=charArr[i];
        		charArr[i]=charArr[j];
        		charArr[j]=temp;
        		System.out.println("Swap:");
        		printArr(charArr);
        	}
        }
        System.out.println("Final char arr:");
		printArr(charArr);
		out=new String(charArr);
		System.out.println("Output string: "+out);
	}

}
