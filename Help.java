import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//�����ڵ忡 �̰� �߰�
//Help helpWindow = new Help();
//helpWindow.setVisible(true);

public class Help extends JFrame
implements ActionListener{
	public Help() {
		super("Help!");
		setSize(800, 450);
		getContentPane().setBackground(Color.white);
		setLayout(new BorderLayout());
		
		String helpString = "<html>���� ���ӿ� ����� ID�� �Է����ּ���. <br><br>�̹� �Է��� ID�� ������ ������ ����� ���� ��쿣 �ش� ID�� ������ �̾ ������ �� �ֽ��ϴ�. <br><br>"
				+ "�׷��� ���� ��쿣, �ش� ID�� ó������ ������ ������ �� �ֽ��ϴ�. <br><br> ������ �����ϸ�, �ڽ��� ĳ���Ͱ� ����� ��ų�� ������ �����մϴ�. <br><br>"
				+ "�� ��, ������ ���̵��� �����մϴ�. (Normal|Hard)<br><br>"
				+ "(���) ���� ������ ȹ���Ͽ� ĳ���͸� �����Ű�� ������ Hard ��带 �ϼ��ϱ⿡ ������� ���� �� �ֽ��ϴ�!<br><br>"
				+ "(���� 3.7 �޼� �� -> ����� ���׷��̵�, ���� 4.0 �޼� �� -> ����� ���׷��̵� <br><br>"
				+ "����� ���ϴ�! <br></html>";
		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(Color.white);
		JButton homeBtn = new JButton("HOME!");
		homeBtn.setBackground(Color.WHITE);
		homeBtn.addActionListener(this);
		btnPanel.add(homeBtn);
		add(btnPanel, BorderLayout.SOUTH);
		
		JPanel helpPanel = new JPanel();
		JLabel helpLabel = new JLabel(helpString);
		Font f = new Font("Monospaced", Font.PLAIN, 15);
		helpLabel.setForeground(Color.BLACK);
		helpLabel.setFont(f);
		helpPanel.add(helpLabel);
		add(helpPanel, BorderLayout.CENTER);
		
		
	}
	public static void main(String[] args) {
		Help helpWindow = new Help();
		helpWindow.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String btnStr = e.getActionCommand();
		
		if(btnStr.equals("HOME!")) {
			dispose();
		}else {
			System.err.println("Unexpected error.");
		}
			
	}

}