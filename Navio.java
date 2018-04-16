/*
Desenvolvido com amor e carinho por Eric Santos
Eric Santos - ericsantosbr2@gmail.com

Esse projeto tem por o objetivo a prática de programação em Java.
O uso de seu código é livre desde que sejam dados os devidos créditos ao seu criador

*/

public class Navio{
	private String nome;
	private int x, y, tipo;
	private Boolean hit = false;
	public Navio(String nome, int x, int y, int tipo){
		// System.out.println("Adicionado");
		this.nome = nome;
		this.x = x;
		this.y = y;
		this.tipo = tipo;
	}
	// Métodos getter
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getTipo(){
		return tipo;
	}
	public String getNome(){
		return nome;
	}
	public Boolean getState(){
		return hit;
	}

	// Métodos setter
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setTipo(int tipo){
		this.tipo = tipo;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setHit(Boolean hit){
		this.hit = hit;
	}
}