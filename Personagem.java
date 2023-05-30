package jogo.negocio;

public abstract class Personagem implements ComportamentoNormal {
	private String nome;
	
	public Personagem() {};
	
	//metodo construtor recebe como parametro o nome
	public Personagem(String nome) {
		this.nome = nome;
	}	
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//implementar métodos em subclasses 
	@Override
	public abstract void andar();
	
	@Override
	public abstract void guardarItem();

	@Override
	public abstract void usarItem();
	
}