package jogo.negocio;
import javax.swing.JOptionPane;


public class Dragao extends Personagem implements ComportamentoFeroz {
	
	
	public Dragao(String nome) {
		super(nome);
	}

	@Override
	public void andar() {
		JOptionPane.showMessageDialog(null, "O dragão está se movendo!"); 
	}

	@Override
	public void guardarItem() {
		JOptionPane.showMessageDialog(null, "O dragão guardou seu ovo!"); 
	}

	@Override
	public void usarItem() {
		JOptionPane.showMessageDialog(null, "O dragão usou sua armadura!"); 
	}
	
	public void voar() {
		JOptionPane.showMessageDialog(null, "O dragão está voando!"); 
	}
	
	public void atirarFogo() {
		JOptionPane.showMessageDialog(null, "O dragão começou a cuspir fogo!"); 
	}
	
	public void morder() {
		JOptionPane.showMessageDialog(null, "O dragão está mordendo!"); 
	}
}
