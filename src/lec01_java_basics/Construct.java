package lec01_java_basics;

public class Construct {
	
	public int age;
	public char sex;
	public boolean tall;
	
	
   public Construct () {
	
}
	
	public Construct(int age, char sex, boolean tall) {
		this.age = age;
		this.sex = sex;
		this.tall = tall;
		System.out.println("1 " + age);
	}
	
	
	
	public void conInfo(int age, char sex, boolean tall) {
		System.out.println("my sex: " + sex + ", am tall: " + tall + ", my age: "+ age);
		
	}
 
	public static void main(String[] args) {
		TestC test1 = new TestC();
	}

}
