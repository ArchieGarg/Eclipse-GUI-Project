import javax.swing.JFrame;
import java.awt.*;

public class JRE_GUI extends JFrame{

	private static final long serialVersionUID = -8749940340786630595L;

	public JRE_GUI() {
		
		setTitle("JRE_GUI");
		setSize(new Dimension(512, 512));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JRE_GUI();
	}
}
