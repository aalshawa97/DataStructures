package DataStructures;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] data = new int[3][3];
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=5;
		data[1][0]=5;
		data[1][1]=8;
		data[1][1]=12;
		data[2][0]=0;
		data[2][1]=0;
		data[2][2]=0;
		System.out.println("Printing diagonal values");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i==j) {
					System.out.println(data[i][j]+"\t");
				}
			}
			System.out.println("\n");
		}
	}
}
