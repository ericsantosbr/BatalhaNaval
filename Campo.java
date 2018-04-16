/*
Desenvolvido com amor e carinho por Eric Santos
Eric Santos - ericsantosbr2@gmail.com

Esse projeto tem por o objetivo a prática de programação em Java.
O uso de seu código é livre desde que sejam dados os devidos créditos ao seu criador

*/

public class Campo{
	private int maxX = 10;
	private int maxY = 10;
	private Navio[][] campo = new Navio[maxX][maxY];
	public Campo(){
		limpaNavios();
		imprimeCampo();
	}

	public void limpaNavios(){
		int i = 0, j = 0;
		for(i = 0; i < maxX; i++){
			for(j = 0; j < maxY; j++){
				campo[i][j] = new Navio("Eric", i, j, -1);
				// System.out.println("" + i + ", "+ j + " = " + campo[i][j].getNome());
			}
		}
	}

	public void imprimeCampo(){
		int i, j;
		System.out.print("  ");
		for(i = 1; i <= maxX; i++){
			System.out.print("| " + i + " ");
		}
		System.out.print("| ");
		for(i = 0; i < maxX; i++){
			System.out.print("\n" + (i + 1) + " | ");
			for(j = 0; j < maxY; j++){
				if(campo[i][j].getState() == true) System.out.print("X");
				else System.out.print("O");
				System.out.print(" | ");
			}
		}
	}
}