// Coin Flip
import java.util.Scanner;
public class Epam1 {
	public static void printArr(int ar[]) {
    	for(int i=0;i<ar.length;i++) {
    		System.out.print(ar[i]+" ");
    	}
    	System.out.println();
    }
	
	public static int coinFlip(int number) {
		int round=1;
		int coinArray[]=new int[number];
		//First round
		for(int i=0;i<number;i++) {
			coinArray[i]=1;
		}
		System.out.println("1st round: ");
		printArr(coinArray);
		round+=1;
		System.out.println("round: "+round);
		while(round!=number+1) {
			for(int j=0;j<number;j++) {
				if(j%round==round-1&&coinArray[j]==1) {
					coinArray[j]=0;
					
				}
				else if(j%round==round-1&&coinArray[j]==0) {
					coinArray[j]=1;
					
				}
			}
			System.out.println("After "+round+"-round: ");
			printArr(coinArray);
			round++;
		}
		//count heads
		int heads=0;
		for(int k=0;k<number;k++) {
			if(coinArray[k]==1)
				heads++;
		}
		return heads;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of rounds: ");
        int n=sc.nextInt();
        System.out.println("Number of heads: "+coinFlip(n));
	}

}
