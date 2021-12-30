package Design;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Action.HomeAction;
import Dao.Dao;
import Main.Main;
import java.awt.Font;
import java.awt.Color;

public class Home extends JFrame {
	Main main = new Main();
	private JPanel contentPane;
	private String phonefirst[] = { "010", "011", "018", "016" };
	private String gender[] = { "¿©¼º", "³²¼º"};
	private JTextField textField_name;
	private JTextField textField_id;
	private JTextField textField_phone2;
	private JPasswordField passwordField;
	private JTextField textField_phone1;
	private JComboBox comboBox;
	private JRadioButton radio_gender[] = new JRadioButton[2];

	public JTextField getTextField_name() {
		return textField_name;
	}

	public void setTextField_name(JTextField textField_name) {
		this.textField_name = textField_name;
	}

	public JTextField getTextField_id() {
		return textField_id;
	}

	public void setTextField_id(JTextField textField_id) {
		this.textField_id = textField_id;
	}

	public JTextField getTextField_phone2() {
		return textField_phone2;
	}

	public void setTextField_phone2(JTextField textField_phone2) {
		this.textField_phone2 = textField_phone2;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JTextField getTextField_phone1() {
		return textField_phone1;
	}

	public void setTextField_phone1(JTextField textField_phone1) {
		this.textField_phone1 = textField_phone1;
	}
	
	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
	
	public JRadioButton[] getRadio_gender() {
		return radio_gender;
	}

	public void setRadio_gender(JRadioButton[] radio_gender) {
		this.radio_gender = radio_gender;
	}

	public Home(Dao dao) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 328);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 20, 0, 20, 0, 20, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 5, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel title = new JLabel("È¸¿øÁ¤º¸");
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.insets = new Insets(0, 0, 5, 5);
		gbc_title.gridx = 1;
		gbc_title.gridy = 0;
		contentPane.add(title, gbc_title);
		
		JLabel Label_name = new JLabel("ÀÌ¸§ : ");
		Label_name.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_name = new GridBagConstraints();
		gbc_Label_name.insets = new Insets(0, 0, 5, 5);
		gbc_Label_name.gridx = 1;
		gbc_Label_name.gridy = 2;
		contentPane.add(Label_name, gbc_Label_name);
		
		textField_name = new JTextField();
		GridBagConstraints gbc_textField_name = new GridBagConstraints();
		gbc_textField_name.gridwidth = 3;
		gbc_textField_name.insets = new Insets(0, 0, 5, 5);
		gbc_textField_name.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_name.gridx = 3;
		gbc_textField_name.gridy = 2;
		contentPane.add(textField_name, gbc_textField_name);
		textField_name.setColumns(10);
		
		JLabel Label_id = new JLabel("¾ÆÀÌµð : ");
		Label_id.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_id = new GridBagConstraints();
		gbc_Label_id.insets = new Insets(0, 0, 5, 5);
		gbc_Label_id.gridx = 1;
		gbc_Label_id.gridy = 4;
		contentPane.add(Label_id, gbc_Label_id);
		
		textField_id = new JTextField();
		textField_id.setEditable(false);
		GridBagConstraints gbc_textField_id = new GridBagConstraints();
		gbc_textField_id.gridwidth = 3;
		gbc_textField_id.insets = new Insets(0, 0, 5, 5);
		gbc_textField_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_id.gridx = 3;
		gbc_textField_id.gridy = 4;
		contentPane.add(textField_id, gbc_textField_id);
		textField_id.setColumns(10);
		
		JLabel Label_pw = new JLabel("ºñ¹Ð¹øÈ£ : ");
		Label_pw.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_pw = new GridBagConstraints();
		gbc_Label_pw.insets = new Insets(0, 0, 5, 5);
		gbc_Label_pw.gridx = 1;
		gbc_Label_pw.gridy = 6;
		contentPane.add(Label_pw, gbc_Label_pw);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 3;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 3;
		gbc_passwordField.gridy = 6;
		contentPane.add(passwordField, gbc_passwordField);
		
		RoundedButton button_pwre = new RoundedButton("º¯°æÇÏ±â");
		GridBagConstraints gbc_button_pwre = new GridBagConstraints();
		gbc_button_pwre.insets = new Insets(0, 0, 5, 5);
		gbc_button_pwre.gridx = 8;
		gbc_button_pwre.gridy = 6;
		contentPane.add(button_pwre, gbc_button_pwre);
		
		JLabel Label_phone = new JLabel("ÀüÈ­¹øÈ£ : ");
		Label_phone.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_phone = new GridBagConstraints();
		gbc_Label_phone.insets = new Insets(0, 0, 5, 5);
		gbc_Label_phone.gridx = 1;
		gbc_Label_phone.gridy = 8;
		contentPane.add(Label_phone, gbc_Label_phone);
		
		comboBox = new JComboBox(phonefirst);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 8;
		contentPane.add(comboBox, gbc_comboBox);
		
		JLabel Lable_phone1 = new JLabel("-");
		Lable_phone1.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 15));
		GridBagConstraints gbc_Lable_phone1 = new GridBagConstraints();
		gbc_Lable_phone1.anchor = GridBagConstraints.EAST;
		gbc_Lable_phone1.insets = new Insets(0, 0, 5, 5);
		gbc_Lable_phone1.gridx = 4;
		gbc_Lable_phone1.gridy = 8;
		contentPane.add(Lable_phone1, gbc_Lable_phone1);
		
		textField_phone1 = new JTextField();
		GridBagConstraints gbc_textField_phone1 = new GridBagConstraints();
		gbc_textField_phone1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_phone1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_phone1.gridx = 5;
		gbc_textField_phone1.gridy = 8;
		contentPane.add(textField_phone1, gbc_textField_phone1);
		textField_phone1.setColumns(10);
		
		JLabel Label_phone2 = new JLabel("-");
		Label_phone2.setFont(new Font("³ª´®°íµñ ExtraBold", Font.PLAIN, 15));
		GridBagConstraints gbc_Label_phone2 = new GridBagConstraints();
		gbc_Label_phone2.insets = new Insets(0, 0, 5, 5);
		gbc_Label_phone2.anchor = GridBagConstraints.EAST;
		gbc_Label_phone2.gridx = 6;
		gbc_Label_phone2.gridy = 8;
		contentPane.add(Label_phone2, gbc_Label_phone2);
		
		textField_phone2 = new JTextField();
		GridBagConstraints gbc_textField_phone2 = new GridBagConstraints();
		gbc_textField_phone2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_phone2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_phone2.gridx = 7;
		gbc_textField_phone2.gridy = 8;
		contentPane.add(textField_phone2, gbc_textField_phone2);
		textField_phone2.setColumns(10);
		
		JLabel Label_gender = new JLabel("¼ºº° : ");
		Label_gender.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_gender = new GridBagConstraints();
		gbc_Label_gender.insets = new Insets(0, 0, 5, 5);
		gbc_Label_gender.gridx = 1;
		gbc_Label_gender.gridy = 10;
		contentPane.add(Label_gender, gbc_Label_gender);
		
		radio_gender[0] = new JRadioButton(gender[0]);
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 3;
		gbc_rdbtnNewRadioButton.gridy = 10;
		contentPane.add(radio_gender[0], gbc_rdbtnNewRadioButton);
		radio_gender[0].setBackground(Color.WHITE);
		
		radio_gender[1] = new JRadioButton(gender[1]);
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 7;
		gbc_rdbtnNewRadioButton_1.gridy = 10;
		contentPane.add(radio_gender[1], gbc_rdbtnNewRadioButton_1);
		radio_gender[1].setBackground(Color.WHITE);
		
		RoundedButton button_update = new RoundedButton("Á¤º¸ ¼öÁ¤ÇÏ±â");
		GridBagConstraints gbc_button_update = new GridBagConstraints();
		gbc_button_update.insets = new Insets(0, 0, 5, 5);
		gbc_button_update.gridx = 3;
		gbc_button_update.gridy = 12;
		contentPane.add(button_update, gbc_button_update);
		
		RoundedButton button_delete = new RoundedButton("Å»ÅðÇÏ±â");
		GridBagConstraints gbc_button_delete = new GridBagConstraints();
		gbc_button_delete.insets = new Insets(0, 0, 5, 5);
		gbc_button_delete.gridx = 7;
		gbc_button_delete.gridy = 12;
		contentPane.add(button_delete, gbc_button_delete);
		
		button_update.addActionListener(new HomeAction());
		button_delete.addActionListener(new HomeAction());
		
		set(dao);
		setVisible(true);
	}
	
	void set(Dao dao) {
		System.out.println(dao.getName() + " " + dao.getId() + " " + dao.getPassword() + " " + dao.getPhone() + " " + dao.getGender());
		String phone1 = "";
		String phone2 = "";
		String phone3 = "";

		if (dao.getPhone().length() >= 11) {
			phone1 = dao.getPhone().substring(0, 2);
			phone2 = dao.getPhone().substring(3, 7);
			phone3 = dao.getPhone().substring(7, 11);
		}
		
		textField_name.setText(dao.getName());
		textField_id.setText(dao.getId());
		passwordField.setText(dao.getPassword());
		
		if(phone1.equals(phonefirst[0]))
			comboBox.setSelectedIndex(0);
		else if(phone1.equals(phonefirst[1]))
			comboBox.setSelectedIndex(1);
		else if(phone1.equals(phonefirst[2]))
			comboBox.setSelectedIndex(2);
		else if(phone1.equals(phonefirst[3]))
			comboBox.setSelectedIndex(3);
		
		textField_phone1.setText(phone2);
		textField_phone2.setText(phone3);
		
		if(dao.getGender().equals("¿©¼º")) {
			radio_gender[0].setSelected(true);
			radio_gender[1].setSelected(false);
		}else if(dao.getGender().equals("³²¼º")) {
			radio_gender[0].setSelected(false);
			radio_gender[1].setSelected(true);
		}
			
	}

}
