import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//NORMAL��� Play Screen

public class FIGHT extends JFrame implements ActionListener, Starter {

// ��ų����Ʈ, ��������Ʈ
	ImageIcon sk1, sk2, sk3, sk4, po;

// �÷��̾� �� ���� ���ݹ�����, �ƹ��͵����Ҷ�, �����Ҷ�
	ImageIcon p_attacked, p, p_attacking;
	ImageIcon m_attacked, m, m_attacking;

	public static void main(String[] args) {
		FIGHT f = new FIGHT();
		f.setVisible(true);
	}

	public FIGHT() {

		setting();

		ImageIcon back;
		back = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\fight.png");

		JPanel screen = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		screen.setLayout(null);


		sk1 = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		sk2 = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		sk3 = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		sk4 = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		po = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		p_attacked = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		p = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		p_attacking = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		m_attacked = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		m = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		m_attacking = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\prac.png");
		
//��ų��ư
		JPanel BtnPanel = new JPanel();
		BtnPanel.setLayout(new GridLayout(1, 4));

		JButton skill1 = new JButton();
		skill1.addActionListener(this);
		skill1.setActionCommand("skill1");
		// skill1.setBorderPainted(false);
		// skill1.setContentAreaFilled(false);
		// skill1.setFocusPainted(false);
		skill1.setIcon(sk1);

		JButton skill2 = new JButton();
		skill2.addActionListener(this);
		skill2.setActionCommand("skill2");
		// skill2.setBorderPainted(false);
		// skill2.setContentAreaFilled(false);
		// skill2.setFocusPainted(false);
		skill2.setIcon(sk2);

		JButton skill3 = new JButton();
		skill3.addActionListener(this);
		skill3.setActionCommand("skill3");
		// skill3.setBorderPainted(false);
		// skill3.setContentAreaFilled(false);
		// skill3.setFocusPainted(false);
		skill3.setIcon(sk3);

		JButton skill4 = new JButton();
		skill4.addActionListener(this);
		skill4.setActionCommand("skill4");
		// skill4.setBorderPainted(false);
		// skill4.setContentAreaFilled(false);
		// skill4.setFocusPainted(false);
		skill4.setIcon(sk4);

		BtnPanel.add(skill1);
		BtnPanel.add(skill2);
		BtnPanel.add(skill3);
		BtnPanel.add(skill4);

		BtnPanel.setBounds(800, 520, 400, 100);
		screen.add(BtnPanel);

//���� ��ư		
		JButton potion = new JButton();
		potion.addActionListener(this);
		potion.setActionCommand("potion");
		// potion.setBorderPainted(false);
		// potion.setContentAreaFilled(false);
		// potion.setFocusPainted(false);
		potion.setBounds(1070, 380, 125, 125);
		potion.setIcon(po);
		screen.add(potion);

//���ΰ�
		JLabel player = new JLabel();
		player.setIcon(p); //�⺻��
		player.setBounds(50, 420, 200, 200);
		screen.add(player);
//����		
		JLabel monster = new JLabel();
		monster.setIcon(m); //�⺻��
		monster.setBounds(500, 200, 200, 200);
		screen.add(monster);

		add(screen);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String ac = e.getActionCommand();
		if (ac.equals("skill1")) {

		} else if (ac.equals("skill2")) {

		} else if (ac.equals("skill3")) {

		} else if (ac.equals("skill4")) {

		} else if (ac.equals("potion")) {

		} else {
			System.err.println("��ư ���� ����");
		}
	}

	@Override
	public void setting() {
		// TODO Auto-generated method stub
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle("<NORMAL> �ο���. �̰ܶ�");
	}

}
