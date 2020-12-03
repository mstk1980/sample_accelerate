package test1;




public class Color1 {

	public static void main(String[] args) {
		Color1 cl = new Color1();

		System.out.println(cl.getColor(1));
	}

	String getColor(int i) {

		if (i == 1) {
			return "赤";

		} else if (i == 2) {
			return "青";

		} else {
			return "1or2を入力して下さい";
		}
	}
}
