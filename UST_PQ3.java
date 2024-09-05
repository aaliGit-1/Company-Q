//Practice Question of UST(Airport Authority)
public class UST_PQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int luggage=4;//number of luggage
        int weight_lugg[]= {1,2,3,4};//weight of the luggage
        int threshold=3;//threshold weight
        int base_p=1;//base price of fine
        int amount=0;
        for(int i=0;i<weight_lugg.length;i++) {
        	if(weight_lugg[i]<=threshold)
        		amount++;
        	else
        		amount+=base_p*2;
        }
        System.out.println("Total amount to be paid: "+amount);
	}

}
