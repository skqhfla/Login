package Design;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Action.SignupAction;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Notice extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel Label_notice;
	private RoundedButton button_close;

	public Notice() {
		setBounds(100, 100, 205, 131);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 20, 20, 5, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 5, 0, 10, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		Label_notice = new JLabel();
		Label_notice.setBackground(Color.WHITE);
		GridBagConstraints gbc_Label_notice = new GridBagConstraints();
		gbc_Label_notice.gridwidth = 4;
		gbc_Label_notice.insets = new Insets(0, 0, 5, 0);
		gbc_Label_notice.gridx = 1;
		gbc_Label_notice.gridy = 1;
		contentPane.add(Label_notice, gbc_Label_notice);

		button_close = new RoundedButton("�ݱ�");
		GridBagConstraints gbc_button_close = new GridBagConstraints();
		gbc_button_close.gridwidth = 2;
		gbc_button_close.insets = new Insets(0, 0, 0, 5);
		gbc_button_close.gridx = 2;
		gbc_button_close.gridy = 3;
		contentPane.add(button_close, gbc_button_close);
		button_close.addActionListener(this);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

	public void NoName() {
		Label_notice.setText("�̸��� �Է����ּ���.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void IdFalse() {
		Label_notice.setText("���� ���̵��Դϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void PwFalse() {
		Label_notice.setText("��й�ȣ�� Ʋ���ϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void FalsePw() {
		Label_notice.setText("����� �� ���� ��й�ȣ �Դϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}
	
	public void FalseID() {
		Label_notice.setText("����� �� ���� ���̵� �Դϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void Signup() {
		Label_notice.setText("������ �Ϸ�Ǿ����ϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void Delete() {
		Label_notice.setText("Ż�� �Ϸ�Ǿ����ϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void Update() {
		Label_notice.setText("���� ������ �Ϸ�Ǿ����ϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void First() {
		Label_notice.setText("ù ��° ȸ���Դϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void Final() {
		Label_notice.setText("������ ȸ���Դϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void ResultID(String id) {
		Label_notice.setText("ȸ������ ���̵�� " + id + " �Դϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void ResultIDfalse() {
		Label_notice.setText("���� ȸ���Դϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	public void ResultPW(String pw) {
		Label_notice.setText("ȸ������ ��й�ȣ�� " + pw + " �Դϴ�.");
		Label_notice.setHorizontalAlignment(JLabel.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button_close) {
			dispose();
		}
	}
}
