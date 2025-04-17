package aula_05;

public class Matrizes {
	public static void main(String[] args) {
		int matrizReal[][] = {{15,654,74},{38,246,68},{70,874,59}};
		Float matriz[][] = new Float[3][2];
		
		
		for(int l = 0; l< matrizReal.length; l++) {
			for(int c = 0; c < matrizReal.length; c++) {
				System.out.printf("[%d][%d] = %d - ",l,c, matrizReal[l][c]);
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
