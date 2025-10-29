package h3;

public class H3_main {

	public static void main(String[] args) {
		int i = 140;
		int j = 150;
		int k = -10;
		
		boolean Ausdruck1 = (i > j);
		boolean Ausdruck2 = (i > 200);
		boolean Ausdruck3 = (j > 100);
		
		if (Ausdruck1 == true) {
			if (Ausdruck2 == false) {
				if (Ausdruck3 == false) {
					k = 1;
				}
			} else {
				if (Ausdruck3 == false) {
					k = 2;
				} else {
					k = 3;
				}
			}
		} else {
			if (Ausdruck2 == false) {
				if (Ausdruck3 == false) {
					k = 4;
				} else {
					k = -10;
				}
			} else {
				k = -10;
			}
		}
		System.out.println(k);

		
		

	}

}
