package cod3r.Calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import cod3r.Calc.Modelo.Memoria;
import cod3r.Calc.Modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	
	private JLabel label ;
	
	public Display() {
		Memoria.getInstacia().adicionarObservador(this);
		
		setBackground(new Color(46,49,50));
		label = new JLabel(Memoria.getInstacia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier",Font.PLAIN,30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10,15));
		
		add(label);
		}
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
		
	}

}
