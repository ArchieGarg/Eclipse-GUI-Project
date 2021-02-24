import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class JRE_GUI extends JFrame{

	private static final long serialVersionUID = -8749940340786630595L;

	public JRE_GUI() {
		
		setTitle("JRE_GUI");
		try {
			setIconImage(ImageIO.read(new File("icon.png")));
		} catch (IOException e) {
			System.err.println("Can't find icon file!");
		}
		setSize(new Dimension(512, 512));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JRE_GUI();
	}
}
