package Design;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Action.SignupAction;
import Main.Main;

public class Signup extends JFrame implements ActionListener {
	Main main = new Main();

	private String phonefirst[] = { "010", "011", "018", "016" };
	private String gender[] = { "여성", "남성" };
	private JPanel contentPane;
	private JTextField textField_name;
	private JTextField textField_id;
	private JTextField textField_phone1;
	private JTextField textField_phone2;
	private JPasswordField textField_pw;
	private JLabel Label_idresult;
	private JLabel Label_passwordresult;
	private JComboBox comboBox_phone;
	private JRadioButton radio_gender[] = new JRadioButton[2];

	public JRadioButton[] getRadio_gender() {
		return radio_gender;
	}

	public JTextField getTextField_name() {
		return textField_name;
	}

	public JTextField getTextField_phone2() {
		return textField_phone2;
	}

	public JTextField getTextField_phone1() {
		return textField_phone1;
	}

	public JComboBox getComboBox_phone() {
		return comboBox_phone;
	}

	public JLabel getLabel_passwordresult() {
		return Label_passwordresult;
	}

	public JTextField getTextField_id() {
		return textField_id;
	}

	public JPasswordField getTextField_pw() {
		return textField_pw;
	}

	KeyListener listener = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {
			String pw = "";

			char[] secret_pw = textField_pw.getPassword();
			for (char cha : secret_pw) {
				Character.toString(cha);
				pw += (pw.equals("")) ? "" + cha + "" : "" + cha + "";
			}

			boolean num = false;
			boolean eng_big = false;
			boolean eng_small = false;
			boolean sp = !pw.matches("[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힝]*");

			if (pw.length() >= 8 && pw.length() <= 16) {
				for (int i = 0; i < pw.length(); i++) {
					if (Character.isDigit(pw.charAt(i)))
						num = true;
					else if (pw.charAt(i) >= 'a' && pw.charAt(i) <= 'z')
						eng_small = true;
					else if (pw.charAt(i) >= 'A' && pw.charAt(i) <= 'Z')
						eng_big = true;
				}
			} else {
				PWCheckfalse();
			}

			if (num == true && eng_big == true && eng_small == true && sp == true) {
				PWCheckpass();
			}

		}
	};

	public Signup() {
		setTitle("회원가입");
		setBounds(100, 100, 646, 435);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 4, 0, 4, 33, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel Label_name = new JLabel("*이름 : ");
		Label_name.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_name = new GridBagConstraints();
		gbc_Label_name.insets = new Insets(0, 0, 5, 5);
		gbc_Label_name.gridx = 2;
		gbc_Label_name.gridy = 1;
		contentPane.add(Label_name, gbc_Label_name);

		textField_name = new JTextField();
		GridBagConstraints gbc_textField_name = new GridBagConstraints();
		gbc_textField_name.gridwidth = 3;
		gbc_textField_name.insets = new Insets(0, 0, 5, 5);
		gbc_textField_name.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_name.gridx = 5;
		gbc_textField_name.gridy = 1;
		contentPane.add(textField_name, gbc_textField_name);
		textField_name.setColumns(10);

		JLabel Label_id = new JLabel("*아이디 : ");
		Label_id.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_id = new GridBagConstraints();
		gbc_Label_id.insets = new Insets(0, 0, 5, 5);
		gbc_Label_id.gridx = 2;
		gbc_Label_id.gridy = 3;
		contentPane.add(Label_id, gbc_Label_id);

		textField_id = new JTextField();
		GridBagConstraints gbc_textField_id = new GridBagConstraints();
		gbc_textField_id.gridwidth = 3;
		gbc_textField_id.insets = new Insets(0, 0, 5, 5);
		gbc_textField_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_id.gridx = 5;
		gbc_textField_id.gridy = 3;
		contentPane.add(textField_id, gbc_textField_id);
		textField_id.setColumns(10);

		RoundedButton button_idcheck = new RoundedButton("중복확인");
		GridBagConstraints gbc_button_idcheck = new GridBagConstraints();
		gbc_button_idcheck.insets = new Insets(0, 0, 5, 5);
		gbc_button_idcheck.gridx = 9;
		gbc_button_idcheck.gridy = 3;
		contentPane.add(button_idcheck, gbc_button_idcheck);

		Label_idresult = new JLabel("중복확인을 해주세요.");
		Label_idresult.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 13));
		GridBagConstraints gbc_Label_idresult = new GridBagConstraints();
		gbc_Label_idresult.gridwidth = 5;
		gbc_Label_idresult.insets = new Insets(0, 0, 5, 5);
		gbc_Label_idresult.gridx = 4;
		gbc_Label_idresult.gridy = 4;
		contentPane.add(Label_idresult, gbc_Label_idresult);

		JLabel Label_password = new JLabel("*비밀번호 : ");
		Label_password.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_password = new GridBagConstraints();
		gbc_Label_password.insets = new Insets(0, 0, 5, 5);
		gbc_Label_password.gridx = 2;
		gbc_Label_password.gridy = 6;
		contentPane.add(Label_password, gbc_Label_password);

		textField_pw = new JPasswordField();
		GridBagConstraints gbc_textField_pw = new GridBagConstraints();
		gbc_textField_pw.gridwidth = 3;
		gbc_textField_pw.insets = new Insets(0, 0, 5, 5);
		gbc_textField_pw.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_pw.gridx = 5;
		gbc_textField_pw.gridy = 6;
		contentPane.add(textField_pw, gbc_textField_pw);
		textField_pw.addKeyListener(listener);

		Label_passwordresult = new JLabel("8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.");
		Label_passwordresult.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 13));
		GridBagConstraints gbc_Label_passwordresult = new GridBagConstraints();
		gbc_Label_passwordresult.anchor = GridBagConstraints.EAST;
		gbc_Label_passwordresult.gridwidth = 6;
		gbc_Label_passwordresult.insets = new Insets(0, 0, 5, 5);
		gbc_Label_passwordresult.gridx = 4;
		gbc_Label_passwordresult.gridy = 7;
		contentPane.add(Label_passwordresult, gbc_Label_passwordresult);

		JLabel Label_phone = new JLabel("\uC804\uD654\uBC88\uD638 : ");
		Label_phone.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_phone = new GridBagConstraints();
		gbc_Label_phone.insets = new Insets(0, 0, 5, 5);
		gbc_Label_phone.gridx = 2;
		gbc_Label_phone.gridy = 9;
		contentPane.add(Label_phone, gbc_Label_phone);

		comboBox_phone = new JComboBox(phonefirst);
		GridBagConstraints gbc_comboBox_phone = new GridBagConstraints();
		gbc_comboBox_phone.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_phone.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_phone.gridx = 5;
		gbc_comboBox_phone.gridy = 9;
		contentPane.add(comboBox_phone, gbc_comboBox_phone);

		JLabel Label_1 = new JLabel("-");
		Label_1.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_1 = new GridBagConstraints();
		gbc_Label_1.insets = new Insets(0, 0, 5, 5);
		gbc_Label_1.anchor = GridBagConstraints.EAST;
		gbc_Label_1.gridx = 6;
		gbc_Label_1.gridy = 9;
		contentPane.add(Label_1, gbc_Label_1);

		textField_phone1 = new JTextField();
		GridBagConstraints gbc_textField_phone1 = new GridBagConstraints();
		gbc_textField_phone1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_phone1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_phone1.gridx = 7;
		gbc_textField_phone1.gridy = 9;
		contentPane.add(textField_phone1, gbc_textField_phone1);
		textField_phone1.setColumns(10);

		JLabel Label_2 = new JLabel("-");
		Label_2.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_2 = new GridBagConstraints();
		gbc_Label_2.anchor = GridBagConstraints.WEST;
		gbc_Label_2.insets = new Insets(0, 0, 5, 5);
		gbc_Label_2.gridx = 8;
		gbc_Label_2.gridy = 9;
		contentPane.add(Label_2, gbc_Label_2);

		textField_phone2 = new JTextField();
		GridBagConstraints gbc_textField_phone2 = new GridBagConstraints();
		gbc_textField_phone2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_phone2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_phone2.gridx = 9;
		gbc_textField_phone2.gridy = 9;
		contentPane.add(textField_phone2, gbc_textField_phone2);
		textField_phone2.setColumns(10);

		JLabel Label_gender = new JLabel("\uC131\uBCC4 : ");
		Label_gender.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_gender = new GridBagConstraints();
		gbc_Label_gender.insets = new Insets(0, 0, 5, 5);
		gbc_Label_gender.gridx = 2;
		gbc_Label_gender.gridy = 11;
		contentPane.add(Label_gender, gbc_Label_gender);

		radio_gender[0] = new JRadioButton(gender[0]);
		GridBagConstraints gbc_radio_female = new GridBagConstraints();
		gbc_radio_female.insets = new Insets(0, 0, 5, 5);
		gbc_radio_female.gridx = 5;
		gbc_radio_female.gridy = 11;
		contentPane.add(radio_gender[0], gbc_radio_female);
		radio_gender[0].setBackground(Color.WHITE);

		radio_gender[1] = new JRadioButton(gender[1]);
		GridBagConstraints gbc_radio_men = new GridBagConstraints();
		gbc_radio_men.insets = new Insets(0, 0, 5, 5);
		gbc_radio_men.gridx = 7;
		gbc_radio_men.gridy = 11;
		contentPane.add(radio_gender[1], gbc_radio_men);
		radio_gender[1].setBackground(Color.WHITE);

		RoundedButton button_final = new RoundedButton("가입하기");
		GridBagConstraints gbc_button_final = new GridBagConstraints();
		gbc_button_final.gridwidth = 2;
		gbc_button_final.insets = new Insets(0, 0, 0, 5);
		gbc_button_final.gridx = 4;
		gbc_button_final.gridy = 13;
		contentPane.add(button_final, gbc_button_final);

		button_idcheck.addActionListener(new SignupAction());
		button_final.addActionListener(new SignupAction());
		radio_gender[0].addActionListener(this);
		radio_gender[1].addActionListener(this);

		setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}

	public void IdCheckpass() {
		Label_idresult.setText("사용 가능한 아이디입니다.");
	}

	public void IdCheckfalse() {
		Label_idresult.setText("사용 불가능한 아이디입니다.");
	}

	public void PWCheckpass() {
		Label_passwordresult.setText("사용 가능한 비밀번호입니다.");
	}

	public void PWCheckfalse() {
		Label_passwordresult.setText("사용 불가능한 비밀번호입니다.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == radio_gender[0]) {
			radio_gender[0].setSelected(true);
			radio_gender[1].setSelected(false);
		} else if (e.getSource() == radio_gender[1]) {
			radio_gender[0].setSelected(false);
			radio_gender[1].setSelected(true);
		}
	}
}
