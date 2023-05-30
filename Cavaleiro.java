package jogo.negocio;
import javax.swing.JOptionPane;


public class Cavaleiro extends Personagem implements ComportamentoHeroico{

	public Cavaleiro(String nome) {
		super(nome);
	}
	
	@Override
	public void andar() {
		JOptionPane.showMessageDialog(null, "O cavaleiro está caminhando!"); 
	}

	@Override
	public void guardarItem() {
		JOptionPane.showMessageDialog(null, "O cavaleiro está guardando sua espada!"); 
	}

	@Override
	public void usarItem() {
		JOptionPane.showMessageDialog(null, "O cavaleiro está usando seu escudo!"); 
	}

	public void atacar() {
		JOptionPane.showMessageDialog(null, "O cavaleiro está atacando!"); 
	}

	public void defender() {
		JOptionPane.showMessageDialog(null, "O cavaleiro se defendeu!"); 
	}

	public void saltar() {
		JOptionPane.showMessageDialog(null, "O cavaleiro pulou!"); 
	}

}
 
