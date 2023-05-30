package jogo.negocio;
import javax.swing.JOptionPane;

public class Mago extends Personagem implements ComportamentoMagico {
		
	public Mago(String nome){
		super(nome);
	}
	
	@Override
	public void andar() {
		JOptionPane.showMessageDialog(null, "A maga está andando!"); 
	}

	@Override
	public void guardarItem() {
		JOptionPane.showMessageDialog(null, "A maga guardou seu cajado!"); 
	}

	@Override
	public void usarItem() {
		JOptionPane.showMessageDialog(null, "A maga usou seu livro de feitiços!"); 
	}

	public void invisibilidade() {
		JOptionPane.showMessageDialog(null, "A maga Morgana ficou invisível!"); 
	}

	public void ultraRapidez() {
		JOptionPane.showMessageDialog(null, "A maga usou magia para ficar super rápido!"); 
	}
}
