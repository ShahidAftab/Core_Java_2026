package PatternPrograms;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 2 * n - 1; j++) {

				if ((i == 0 && (j == 1 || j == 2 || j == 6 || j == 7)) ||

						(i == 1 && (j == 0 || j == 3 || j == 5 || j == 8)) ||

						(i == 2 && (j == 0 || j == 4 || j == 8)) ||

						(i == 3 && (j == 1 || j == 7)) ||

						(i == 4 && (j == 2 || j == 6))) {

					System.out.print("* ");

				} else {

					System.out.print("  ");
				}
			}

			System.out.println();
		}

	}

}
