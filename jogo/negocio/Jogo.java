package jogo.negocio;

public class Jogo {
	//Polimorfismo de sobrescrita
	public void ControlarAcoesDosPersonagens(Personagem personagem){
		personagem.andar();
		personagem.guardarItem();
		personagem.usarItem();
	}
}
