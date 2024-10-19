/* Problem Statement: 
 Ritik wants a magic board, which displays a character for a corresponding number for his science project. 
 Help him to develop such an application. Assume the number of inputs should be always 4.
 Sample Input: 65, 66, 67, 68
 Sample Output: 65-A, 66-B, 67-C, 68-D
 */
import java.util.Scanner;
public class PS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        char arr[]=new char[4];
        int num[]=new int[4];
        for(int i=0;i<4;i++){
            System.out.println("Enter num "+(i+1)+":");
            num[i]=sc.nextInt();
            arr[i]=(char)num[i];
            //System.out.println("Character: "+c);
        }
        //print Array value
        for(int j=0;j<arr.length;j++){
            System.out.println(num[j]+":"+arr[j]);
        }
	}

}
