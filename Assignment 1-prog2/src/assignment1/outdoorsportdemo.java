package assignment1;

public class outdoorsportdemo {

	public static void main(String[] args) {
		participant pt=new participant("Loan","mayn","French");
		String G= "Water Bottles, Backpack, Rain wear, Survival kit";
		hiking hk=new hiking("Hiking",G,300.0,pt.toString(),"Mountain");
		
		System.out.println(hk);//Uses toString()
		

	}

}
