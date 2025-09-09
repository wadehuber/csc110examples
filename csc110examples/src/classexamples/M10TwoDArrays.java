package classexamples;

public class M10TwoDArrays {

	public static void main(String[] args) {
		int[][] code = new int[8][10];
		int num = 1;
		
		for(int ii=0;ii<code.length;ii++) {
			for(int jj=0;jj<code[ii].length;jj++) {
				code[ii][jj] = num;
				num++;
			}
		}

		for(int ii=0;ii<code.length;ii++) {
			for(int jj=0;jj<code[ii].length;jj++) {
				System.out.printf("%4d", code[ii][jj]);
			}
			System.out.println();
		}

		
		System.out.println();
		num=1;
		for(int jj=0;jj<code[0].length;jj++) {
			for(int ii=0;ii<code.length;ii++) {
				code[ii][jj] = num;
				num++;
			}
		}

		for(int ii=0;ii<code.length;ii++) {
			for(int jj=0;jj<code[ii].length;jj++) {
				System.out.printf("%4d", code[ii][jj]);
			}
			System.out.println();
		}
	}

}
