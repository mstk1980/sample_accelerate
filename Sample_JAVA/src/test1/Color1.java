package test1;




public class Color1 {

	public static void main(String[] args) {
		Color1 cl = new Color1();

		System.out.println(cl.getColor(1));
	}

	String getColor(int i) {

		if (i == 1) {
			return "red";

		} else if (i == 2) {
			return "Blue";

		} else {
			return "Please enter 1or2";
		}
	}
}
