package jogo.iu;
import jogo.negocio.*;
import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		
		Jogo j = new Jogo();
		Personagem[] personagens = new Personagem[6];
		
		//lista polimorfica de personagens
		personagens[0] = new Cavaleiro("K'Sante");
		personagens[1] = new Cavaleiro("Darius");
		
		personagens[2] = new Dragao("Bolsolinda");
		personagens[3] = new Dragao("Bolsodraga");
		
		personagens[4] = new Mago("Lux");
		personagens[5] = new Mago("Zyra");
		
		for(Personagem pers:personagens) {
			if(pers instanceof Cavaleiro) {
				Cavaleiro c = (Cavaleiro) pers;
				JOptionPane.showMessageDialog(null, "O cavaleiro " + c.getNome()+ " foi invocado!");
				j.ControlarAcoesDosPersonagens(c);
			}else if(pers instanceof Dragao) {
				Dragao d = (Dragao) pers;
				JOptionPane.showMessageDialog(null, "O dragão " + d.getNome()+ " foi invocado!");
				j.ControlarAcoesDosPersonagens(d);
			}else {
				Mago m = (Mago) pers;
				JOptionPane.showMessageDialog(null, "A maga " + m.getNome()+" foi invocada!");
				j.ControlarAcoesDosPersonagens(m);
			}
		}
		Mago p = new Mago("Morgana");
		p.invisibilidade();
	}
}
