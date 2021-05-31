import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameDemoGUI extends JFrame implements ActionListener, Starter {

	public JTextField name;
	public JPanel Difficulty;
	GameDemoGUI gamemain = this;
	int result = 0;
	// public ArrayList<User> users = new ArrayList<User>();

	public static void main(String[] args) {
//      new GameDemoGUI();
		GameDemoGUI fight = new GameDemoGUI();
		fight.setVisible(true);
//      fight.setResizable(false);
		/*
		 * String inputId = "";
		 * 
		 * try { ObjectInputStream inputStream = null; try { inputStream = new
		 * ObjectInputStream (new FileInputStream("data.dat")); }catch(IOException e) {
		 * e.printStackTrace(); System.exit(0); } try { while(true) {
		 * 
		 * } }
		 * 
		 * inputStream.close(); }catch(FileNotFoundException e) { e.printStackTrace();
		 * }catch(IOException e) { System.err.println("Problem with file input."); }
		 */

	}

	public GameDemoGUI() {

		setting();
		JPanel main = new JPanel();
		ImageIcon back = new ImageIcon(
				"C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\start_background.png");

		JPanel screen = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(back.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		screen.setLayout(null);

		name = new JTextField(90);
		name.setBackground(Color.white);
		name.setBounds(495, 393, 350, 50);
		screen.add(name);

		JButton start = new JButton();
		start.addActionListener(this);
		start.setActionCommand("start");
		// start.setBorderPainted(false);
		start.setContentAreaFilled(false);
		// start.setFocusPainted(false);
		start.setBounds(470, 460, 150, 107);
		ImageIcon startBtn = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\startBtn.png");
		start.setIcon(startBtn);
		screen.add(start);

		JButton help = new JButton();
		help.addActionListener(this);
		help.setActionCommand("help");
		help.setBorderPainted(false);
		help.setContentAreaFilled(false);
		// help.setFocusPainted(false);
		help.setBounds(640, 460, 150, 107);
		ImageIcon helpBtn = new ImageIcon("C:\\Users\\������\\eclipse-workspace\\FinalTeamProject\\src\\help.png");
		help.setIcon(helpBtn);
		screen.add(help);

		add(screen);

		setVisible(true);
		// ��������� screen panel�Դϴ�~ ���

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		continued(e);
	}

	public void continued(ActionEvent e) {
		String actionCmd = e.getActionCommand();
		String input = name.getText();
		double userScore = 3.5; // ���Ͽ� ������ Score
		String userId = ""; // ���Ͽ� ������ ID
		//ArrayList<User> readUser = new ArrayList<User>(); // ���Ͽ��� ������ User ������

		// ��������� �κ� (�Է�)
		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream("data.dat"));
			try {
				User readOne = (User) inputStream.readObject();
				//((User)inputStream.readObject()).setScore(userScore);
				User newUser = new User(userScore, input);
				// = new User(); //���� �ȿ� �ִ� ��ü �ϳ��� �ϳ��� ������ readUser�� �����ϱ� ���� ����
				while (readOne != null) { // ���̳ʸ� ���ϳ� �˻��ϴ� ��� ����?
					readUser.add(readOne);
					readOne = (User) inputStream.readObject();
					System.out.println(readOne);
				}
			} catch (ClassNotFoundException e2) {
				System.out.println("Problems with file input. (ClassNotFoundException)");
			}
			inputStream.close();
		} catch (FileNotFoundException e2) {
			e2.printStackTrace();
			System.err.println("���� �������� ����");
		} catch (IOException e2) {
			e2.printStackTrace();
			System.err.println("Problem with file input. (IOException)");
		}

//���Ͽ� ����ڰ� �Է��� id(input)�� �����ϴ���      
		int i = 0;
		boolean exist = false;
		while (i < readUser.size()) {
			if (readUser.get(i) != null) {
				if ((readUser.get(i).getId()).equals(input)) {
					exist = true;
					userScore = readUser.get(i).getScore();
					userId = readUser.get(i).getId();
					break;
				}
			}
			i++;
		}

		if (actionCmd.equals("start")) {

			if (exist) {
				User newUser = new User(userScore, input);
				readUser.add(newUser);
				// ��������� �κ� (���)
				ObjectOutputStream outputStream = null;
				try {
					outputStream = new ObjectOutputStream(new FileOutputStream("data.dat"));
					outputStream.writeObject(newUser);
					// for (int k = 0; k < readUser.size(); k++) {
					// outputStream.writeObject(readUser.get(i));
					// }
					outputStream.writeObject(null);
					outputStream.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				int result = JOptionPane.showConfirmDialog(null, "�Է��� ���̵�� �̾ ������ �����մϴ�.", "�ȳ��޼���",
						JOptionPane.OK_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					// ���� �Ѱ��ִ� �κ� �����ؾ���
					new SelectSkillPortion();
					setVisible(false);
				}
			} else {
				User newUser = new User(userScore, input);
				readUser.add(newUser);
				// ��������� �κ� (���)
				ObjectOutputStream outputStream = null;
				try {
					outputStream = new ObjectOutputStream(new FileOutputStream("data.dat"));
					// outputStream.writeObject(newUser);
					for (int k = 0; k < readUser.size(); k++) {
						outputStream.writeObject(readUser.get(i));
					}
					outputStream.writeObject(null);
					outputStream.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				int result = JOptionPane.showConfirmDialog(null, "����� �����Ͱ� �����Ƿ� ���� �����մϴ�.", "�ȳ��޼���",
						JOptionPane.OK_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					new SelectSkillPortion();
					setVisible(false);
				} 
			}
		} else if (actionCmd.equals("help")) {
			Help helpwindow = new Help();
			helpwindow.setVisible(true);
		}
	}

	@Override
	public void setting() {
		// TODO Auto-generated method stub
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle("�ڹ� ���!!");
	}
}