package Design;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Action.LoginAction;
import java.awt.Font;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField text_id;
	private JPasswordField text_pw;

	public JTextField getText_id() {
		return text_id;
	}

	public JPasswordField getText_pw() {
		return text_pw;
	}

	public Login() {
		setTitle("Login");
		setSize(200,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 369);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 10, 0, 0, 20, 10, 0 };
		gbl_contentPane.rowHeights = new int[] { 10, 0, 3, 0, 5, 0, 10, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel Label_id = new JLabel("아이디");
		Label_id.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_id = new GridBagConstraints();
		gbc_Label_id.insets = new Insets(0, 0, 5, 5);
		gbc_Label_id.gridx = 1;
		gbc_Label_id.gridy = 1;
		contentPane.add(Label_id, gbc_Label_id);

		text_id = new JTextField();
		GridBagConstraints gbc_text_id = new GridBagConstraints();
		gbc_text_id.insets = new Insets(0, 0, 5, 5);
		gbc_text_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_id.gridx = 3;
		gbc_text_id.gridy = 1;
		contentPane.add(getText_id(), gbc_text_id);
		getText_id().setColumns(10);

		JLabel Label_password = new JLabel("비밀번호");
		Label_password.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_password = new GridBagConstraints();
		gbc_Label_password.insets = new Insets(0, 0, 5, 5);
		gbc_Label_password.gridx = 1;
		gbc_Label_password.gridy = 3;
		contentPane.add(Label_password, gbc_Label_password);
		
		text_pw = new JPasswordField();
		GridBagConstraints gbc_text_pw = new GridBagConstraints();
		gbc_text_pw.insets = new Insets(0, 0, 5, 5);
		gbc_text_pw.fill = GridBagConstraints.HORIZONTAL;
		gbc_text_pw.gridx = 3;
		gbc_text_pw.gridy = 3;
		contentPane.add(text_pw, gbc_text_pw);

		RoundedButton button_login = new RoundedButton("로그인");
		GridBagConstraints gbc_button_login = new GridBagConstraints();
		gbc_button_login.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_login.gridwidth = 2;
		gbc_button_login.insets = new Insets(0, 0, 5, 5);
		gbc_button_login.gridx = 1;
		gbc_button_login.gridy = 5;
		contentPane.add(button_login, gbc_button_login);

		RoundedButton button_signup = new RoundedButton("회원가입");
		GridBagConstraints gbc_button_signup = new GridBagConstraints();
		gbc_button_signup.insets = new Insets(0, 0, 5, 5);
		gbc_button_signup.gridx = 3;
		gbc_button_signup.gridy = 5;
		contentPane.add(button_signup, gbc_button_signup);
		
		RoundedButton button_findid = new RoundedButton("아이디 찾기");
		GridBagConstraints gbc_button_findid = new GridBagConstraints();
		gbc_button_findid.insets = new Insets(0, 0, 0, 5);
		gbc_button_findid.gridx = 1;
		gbc_button_findid.gridy = 7;
		contentPane.add(button_findid, gbc_button_findid);
		
		RoundedButton button_findpw = new RoundedButton("비밀번호 찾기");
		GridBagConstraints gbc_button_findpw = new GridBagConstraints();
		gbc_button_findpw.insets = new Insets(0, 0, 0, 5);
		gbc_button_findpw.gridx = 3;
		gbc_button_findpw.gridy = 7;
		contentPane.add(button_findpw, gbc_button_findpw);
		
		setVisible(true);

		button_login.addActionListener(new LoginAction());
		button_signup.addActionListener(new LoginAction());
		button_findid.addActionListener(new LoginAction());
		button_findpw.addActionListener(new LoginAction());
	}

}
