package lec01_java_basics;

public class ADF {

	public static void main(String[] args) {
		Add adf1 = new Add();
		adf1.power();
		
		System.out.println("\n-----------------------\n");
		
		Construct adf2 = new Construct(28, 'M', true);
		adf2.conInfo(38, 'F', false);
		
		
		
	}

}
