package Design;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Action.ManegerAction;
import Dao.Dao;
import java.awt.Font;

public class Maneger extends JFrame {

	private JPanel contentPane;
	private String phonefirst[] = { "010", "011", "018", "016" };
	private String gender[] = { "¿©¼º", "³²¼º" };
	private ArrayList<Dao> list;
	private JTextField textField_name;
	private JTextField textField_id;
	private JPasswordField passwordField;
	private JTextField textField_phone1;
	private JTextField textField_phone2;
	private JComboBox comboBox;
	private JRadioButton radio_gender[] = new JRadioButton[2];
	private int index = 0;
	private JLabel Label_number;

	public void setLabel_number(JLabel label_number) {
		Label_number = label_number;
	}

	public ArrayList<Dao> getList() {
		return list;
	}

	public void setList(ArrayList<Dao> list) {
		this.list = list;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String[] getPhonefirst() {
		return phonefirst;
	}

	public String[] getGender() {
		return gender;
	}

	public JTextField getTextField_name() {
		return textField_name;
	}

	public JTextField getTextField_id() {
		return textField_id;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JTextField getTextField_phone1() {
		return textField_phone1;
	}

	public JTextField getTextField_phone2() {
		return textField_phone2;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public JRadioButton[] getRadio_gender() {
		return radio_gender;
	}

	public Maneger(ArrayList<Dao> dao) {
		setList(dao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0,
				1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel Label_title = new JLabel("È¸¿øÁ¤º¸");
		Label_title.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 20));
		GridBagConstraints gbc_Label_title = new GridBagConstraints();
		gbc_Label_title.insets = new Insets(0, 0, 5, 5);
		gbc_Label_title.gridx = 7;
		gbc_Label_title.gridy = 0;
		contentPane.add(Label_title, gbc_Label_title);

		Label_number = new JLabel();
		Label_number.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_number = new GridBagConstraints();
		gbc_Label_number.insets = new Insets(0, 0, 5, 5);
		gbc_Label_number.gridx = 1;
		gbc_Label_number.gridy = 2;
		contentPane.add(Label_number, gbc_Label_number);

		JLabel Label_name = new JLabel("ÀÌ¸§ : ");
		Label_name.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_name = new GridBagConstraints();
		gbc_Label_name.insets = new Insets(0, 0, 5, 5);
		gbc_Label_name.gridx = 3;
		gbc_Label_name.gridy = 2;
		contentPane.add(Label_name, gbc_Label_name);

		textField_name = new JTextField();
		GridBagConstraints gbc_textField_name = new GridBagConstraints();
		gbc_textField_name.insets = new Insets(0, 0, 5, 5);
		gbc_textField_name.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_name.gridx = 5;
		gbc_textField_name.gridy = 2;
		contentPane.add(textField_name, gbc_textField_name);
		textField_name.setColumns(10);

		JLabel Label_id = new JLabel("¾ÆÀÌµð : ");
		Label_id.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_id = new GridBagConstraints();
		gbc_Label_id.insets = new Insets(0, 0, 5, 5);
		gbc_Label_id.anchor = GridBagConstraints.EAST;
		gbc_Label_id.gridx = 7;
		gbc_Label_id.gridy = 2;
		contentPane.add(Label_id, gbc_Label_id);

		textField_id = new JTextField();
		textField_id.setEditable(false);
		GridBagConstraints gbc_textField_id = new GridBagConstraints();
		gbc_textField_id.insets = new Insets(0, 0, 5, 5);
		gbc_textField_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_id.gridx = 9;
		gbc_textField_id.gridy = 2;
		contentPane.add(textField_id, gbc_textField_id);
		textField_id.setColumns(10);

		JLabel Label_pw = new JLabel("ºñ¹Ð¹øÈ£ : ");
		Label_pw.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_pw = new GridBagConstraints();
		gbc_Label_pw.insets = new Insets(0, 0, 5, 5);
		gbc_Label_pw.gridx = 11;
		gbc_Label_pw.gridy = 2;
		contentPane.add(Label_pw, gbc_Label_pw);

		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 13;
		gbc_passwordField.gridy = 2;
		contentPane.add(passwordField, gbc_passwordField);

		JLabel Label_phone = new JLabel("ÀüÈ­¹øÈ£ : ");
		Label_phone.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_phone = new GridBagConstraints();
		gbc_Label_phone.insets = new Insets(0, 0, 5, 5);
		gbc_Label_phone.gridx = 15;
		gbc_Label_phone.gridy = 2;
		contentPane.add(Label_phone, gbc_Label_phone);

		JComboBox comboBox = new JComboBox(phonefirst);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 17;
		gbc_comboBox.gridy = 2;
		contentPane.add(comboBox, gbc_comboBox);

		JLabel Label_phone1 = new JLabel("-");
		Label_phone1.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_phone1 = new GridBagConstraints();
		gbc_Label_phone1.anchor = GridBagConstraints.EAST;
		gbc_Label_phone1.insets = new Insets(0, 0, 5, 5);
		gbc_Label_phone1.gridx = 18;
		gbc_Label_phone1.gridy = 2;
		contentPane.add(Label_phone1, gbc_Label_phone1);

		textField_phone1 = new JTextField();
		GridBagConstraints gbc_textField_phone1 = new GridBagConstraints();
		gbc_textField_phone1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_phone1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_phone1.gridx = 19;
		gbc_textField_phone1.gridy = 2;
		contentPane.add(textField_phone1, gbc_textField_phone1);
		textField_phone1.setColumns(10);

		JLabel Label_phone2 = new JLabel("-");
		Label_phone2.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_phone2 = new GridBagConstraints();
		gbc_Label_phone2.anchor = GridBagConstraints.EAST;
		gbc_Label_phone2.insets = new Insets(0, 0, 5, 5);
		gbc_Label_phone2.gridx = 20;
		gbc_Label_phone2.gridy = 2;
		contentPane.add(Label_phone2, gbc_Label_phone2);

		textField_phone2 = new JTextField();
		GridBagConstraints gbc_textField_phone2 = new GridBagConstraints();
		gbc_textField_phone2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_phone2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_phone2.gridx = 21;
		gbc_textField_phone2.gridy = 2;
		contentPane.add(textField_phone2, gbc_textField_phone2);
		textField_phone2.setColumns(10);

		JLabel Label_gender = new JLabel("¼ºº° : ");
		Label_gender.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_gender = new GridBagConstraints();
		gbc_Label_gender.insets = new Insets(0, 0, 5, 5);
		gbc_Label_gender.gridx = 23;
		gbc_Label_gender.gridy = 2;
		contentPane.add(Label_gender, gbc_Label_gender);

		radio_gender[0] = new JRadioButton("¿©¼º");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 24;
		gbc_rdbtnNewRadioButton.gridy = 2;
		contentPane.add(radio_gender[0], gbc_rdbtnNewRadioButton);
		radio_gender[0].setBackground(Color.WHITE);

		radio_gender[1] = new JRadioButton("³²¼º");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 25;
		gbc_rdbtnNewRadioButton_1.gridy = 2;
		contentPane.add(radio_gender[1], gbc_rdbtnNewRadioButton_1);
		radio_gender[1].setBackground(Color.WHITE);

		RoundedButton button_before = new RoundedButton("ÀÌÀü");
		GridBagConstraints gbc_button_before = new GridBagConstraints();
		gbc_button_before.insets = new Insets(0, 0, 0, 5);
		gbc_button_before.gridx = 7;
		gbc_button_before.gridy = 5;
		contentPane.add(button_before, gbc_button_before);

		RoundedButton button_next = new RoundedButton("´ÙÀ½");
		GridBagConstraints gbc_button_next = new GridBagConstraints();
		gbc_button_next.insets = new Insets(0, 0, 0, 5);
		gbc_button_next.gridx = 11;
		gbc_button_next.gridy = 5;
		contentPane.add(button_next, gbc_button_next);

		RoundedButton button_update = new RoundedButton("¼öÁ¤ÇÏ±â");
		GridBagConstraints gbc_button_update = new GridBagConstraints();
		gbc_button_update.insets = new Insets(0, 0, 0, 5);
		gbc_button_update.gridx = 15;
		gbc_button_update.gridy = 5;
		contentPane.add(button_update, gbc_button_update);

		RoundedButton button_delete = new RoundedButton("°­ÅðÇÏ±â");
		GridBagConstraints gbc_button_delete = new GridBagConstraints();
		gbc_button_delete.insets = new Insets(0, 0, 0, 5);
		gbc_button_delete.gridx = 26;
		gbc_button_delete.gridy = 5;
		contentPane.add(button_delete, gbc_button_delete);

		button_before.addActionListener(new ManegerAction());
		button_next.addActionListener(new ManegerAction());
		button_update.addActionListener(new ManegerAction());
		button_delete.addActionListener(new ManegerAction());

		set(list.get(index));

		setVisible(true);
	}

	public void set(Dao dao) {
		System.out.println(dao.getName() + " " + dao.getId() + " " + dao.getPassword() + " " + dao.getPhone() + " "
				+ dao.getGender());
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

		if (phone1.equals(phonefirst[0]))
			comboBox.setSelectedIndex(0);
		else if (phone1.equals(phonefirst[1]))
			comboBox.setSelectedIndex(1);
		else if (phone1.equals(phonefirst[2]))
			comboBox.setSelectedIndex(2);
		else if (phone1.equals(phonefirst[3]))
			comboBox.setSelectedIndex(3);

		textField_phone1.setText(phone2);
		textField_phone2.setText(phone3);

		if (dao.getGender().equals("¿©¼º")) {
			radio_gender[0].setSelected(true);
			radio_gender[1].setSelected(false);
		} else if (dao.getGender().equals("³²¼º")) {
			radio_gender[0].setSelected(false);
			radio_gender[1].setSelected(true);
		}
		
		Label_number.setText(Integer.toString(index + 1));

	}

}
