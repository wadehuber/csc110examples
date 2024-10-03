package classactivities;

public class MethodActivity {

	public static int fun1(int num) {
		if (num % 2 == 0) {
			return 2;
		} else {
			return (num - 1);
		}
	}

	public static int fun2(int num) {
		if (num <= 1) {
			return 1;
		}
		int result = 1;
		for (int ii = 2; ii <= num; ii++) {
			result *= ii;
		}
		return result;
	}

	public static void fun3(int rows) {
		for (int ii = 1; ii <= rows; ii++) {
			for (int jj = 1; jj <= ii; jj++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

	public static int fun4(int a, int b) {
		int ret = 0;

		if (a > b) {
			ret = a * b;
		} else if (a < b) {
			ret = a + b;
		}
		return ret;
	}

	public static String fun5(String name, int age) {
		String password = "";
		if (name.length() < 3) {
			password = name + age + "123!";
		} else {
			password = name.substring(0, 3) + age + name.length();
		}
		return password.toUpperCase();
	}

	public static void main(String[] args) {

		// fun1
		System.out.println("fun1:");
		System.out.printf("fun1(%d) = %d\n", 1, fun1(1));
		System.out.printf("fun1(%d) = %d\n", 3, fun1(5));
		System.out.printf("fun1(%d) = %d\n", 5, fun1(5));
		System.out.println();

		// fun2
		System.out.println("fun2:");
		System.out.printf("fun2(%d) = %d\n", 1, fun2(1));
		System.out.printf("fun2(%d) = %d\n", 3, fun2(3));
		System.out.printf("fun2(%d) = %d\n", 5, fun2(4));
		System.out.println();

		// fun3
		System.out.println("fun3:");
		System.out.printf("fun3(%d):\n", 1);
		fun3(1);
		System.out.printf("fun3(%d):\n", 3);
		fun3(3);
		System.out.printf("fun3(%d):\n", 5);
		fun3(5);
		System.out.println();

		// fun4
		System.out.println("fun4:");
		System.out.printf("fun4(%d,%d) = %d\n", 4, 7, fun4(4, 7));
		System.out.printf("fun4(%d,%d) = %d\n", 5, 3, fun4(5, 3));
		System.out.printf("fun4(%d,%d) = %d\n", 10, 10, fun4(10, 10));
		System.out.println();

		// fun5
		System.out.println("fun5:");
		System.out.printf("fun5(Kendra, %d) = %s\n", 14, fun5("Kendra", 14));
		System.out.printf("fun5(Neville, %d) = %s\n", 11, fun5("Neville", 11));
		System.out.printf("fun5(Anakin, 9%d) = %s\n", 9, fun5("Al", 49));

	}

}
