import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class NormalWorldMap extends JFrame implements ActionListener, Starter{
	
	private JLabel worldMapTitle;
	public static final int WORLDMAPSIZE = 3;
	private NormalWorldMap nor = this;
	
	
	public static void main(String[] args) {
		NormalWorldMap HW = new NormalWorldMap();
		HW.setVisible(true);
		HW.setResizable(false);
	}
	
	
	public NormalWorldMap() {
		setting();
		worldMapTitle = new JLabel("Select worldmap!");
		Font f = new Font("Monospaced", Font.BOLD|Font.ITALIC, 30);
		worldMapTitle.setForeground(Color.BLACK);
		worldMapTitle.setFont(f);
		
		worldMapTitle.setBackground(Color.YELLOW);
		worldMapTitle.setBounds(500, 30, 900, 30);
		add(worldMapTitle);
		
		JButton world1 = new JButton("C++");
		world1.setBackground(Color.BLUE);
		world1.addActionListener(this);
		world1.setBounds(40, 90, 400, 500);
		String world1FileName = "prac.png";
		String world1IconFilePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/C-normal.png";
		ImageIcon world1Icon = new ImageIcon(world1IconFilePath);
		world1.setIcon(world1Icon);
		add(world1);
		
		JButton world2 = new JButton("JAVA");
		world2.setBackground(Color.RED);
		world2.addActionListener(this);
		world2.setBounds(440, 90, 400, 500);
		String world2FileName = "prac.png";
		String world2IconFilePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/java-normal.png";
		ImageIcon world2Icon = new ImageIcon(world2IconFilePath);
		world2.setIcon(world2Icon);
		add(world2);
		
		JButton world3 = new JButton("PYTHON");
		world3.setBackground(Color.CYAN);
		world3.addActionListener(this);
		world3.setBounds(840, 90, 400, 500);
		String world3FileName = "prac.png";
		String world3IconFilePath = "/Users/silver/Documents/knu_term_0201/Java Programming/eclipse-workspace/Project/py-normal.png";
		ImageIcon world3Icon = new ImageIcon(world3IconFilePath);
		world3.setIcon(world3Icon);
		add(world3);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCmd = e.getActionCommand();
		if(actionCmd.equals("C++")) { //여기선 각각의 클래스로 이동만 시켜주고 데미지 등의 구현사항은 이동한 클래스에서 구현
			new MovingtoFIGHT();
			nor.setVisible(false);
		}else if(actionCmd.equals("JAVA")) {
			new MovingtoFIGHT();
			nor.setVisible(false);
		}else if(actionCmd.equals("PYTHON")){
			new MovingtoFIGHT();
			nor.setVisible(false);
		}
	}
	
	public void setting() {
		// TODO Auto-generated method stub
		setTitle("<NORMAL> Choose WorldMap!");
		setBackground(Color.CYAN);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLayout(null);
	}
}