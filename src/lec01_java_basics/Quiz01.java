package lec01_java_basics;

public class Quiz01 {
	public static void p() {
		System.out.print("A");
		p();

	}

	public static void main(String[] args) {
		System.out.print("B");
		p();
		System.out.println("C");

	}

}
