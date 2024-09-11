//Find the combination of paints
//Calculate  how many paint combination can be made
import java.util.Scanner;
public class GyanSys {
    public static int combiPaint(int i1,int i2) {
    	int i3=i1-i2;
    	int res=i2>1?i1:0;
    	int mul1=1,mul2=1,mul3=1;//storing the factorial of i1 & i2
    	while(i1>=1) {//factorial of i1
    		mul1=mul1*i1;
    		i1--;
    	}
    	while(i2>=1) {//factorial of i2
    		mul2=mul2*i2;
    		i2--;
    	}
    	while(i3>=1) {//factorial of i3
    		mul3=mul3*i3;
    		i3--;
    	}
    	//System.out.println("mul1:"+mul1+",mul2:"+mul2+",mul3:"+mul3);
    	res+=mul1/(mul2*mul3);
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter input1: ");
        int input1=sc.nextInt();
        System.out.println("Enter input2: ");
        int input2=sc.nextInt();
        //calling the function
        System.out.println("Combination of paint: "+combiPaint(input1,input2));
	}

}
