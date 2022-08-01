package lec01_java_basics;

public class loops {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i = i + 1) {
			for (int j = 1; j <= 2; j = j + 1) {
			if (i==2 || j==2) {
				continue;
				}

			System.out.print(i + " " + j + " ");
			}
		}

	}
}
