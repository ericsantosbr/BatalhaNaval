/*
Desenvolvido com amor e carinho por Eric Santos
Eric Santos - ericsantosbr2@gmail.com

Esse projeto tem por o objetivo a prática de programação em Java.
O uso de seu código é livre desde que sejam dados os devidos créditos ao seu criador

*/

public class Campo{
	private Navio[][] campo = new Navio[20][20];
	public Campo(){
		limpaNavios();
	}

	public void limpaNavios(){
		int i = 0, j = 0;
		for(i = 0; i < 20; i++){
			for(j = 0; j < 20; j++){
				campo[i][j] = new Navio("Eric", i, j, -1);
				System.out.println("" + i + ", "+ j + " = " + campo[i][j].getNome());
			}
		}
	}

	public void imprimeCampo(){

	}
}