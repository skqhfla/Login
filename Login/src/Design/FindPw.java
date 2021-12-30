package Design;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Action.FindActon;

public class FindPw extends JFrame {

	private JPanel contentPane;
	private JTextField textField_id;

	public JTextField getTextField_id() {
		return textField_id;
	}
	
	public FindPw() {
		setBounds(100, 100, 400, 195);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel Lable_title = new JLabel("비밀번호 찾기");
		Lable_title.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 20));
		GridBagConstraints gbc_Lable_title = new GridBagConstraints();
		gbc_Lable_title.anchor = GridBagConstraints.BASELINE;
		gbc_Lable_title.insets = new Insets(0, 0, 5, 5);
		gbc_Lable_title.gridx = 1;
		gbc_Lable_title.gridy = 1;
		contentPane.add(Lable_title, gbc_Lable_title);
		
		JLabel Label_alert = new JLabel("아이디를 입력 해주세요.");
		Label_alert.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Label_alert = new GridBagConstraints();
		gbc_Label_alert.insets = new Insets(0, 0, 5, 5);
		gbc_Label_alert.gridx = 1;
		gbc_Label_alert.gridy = 3;
		contentPane.add(Label_alert, gbc_Label_alert);
		
		textField_id = new JTextField();
		GridBagConstraints gbc_textField_id = new GridBagConstraints();
		gbc_textField_id.insets = new Insets(0, 0, 5, 5);
		gbc_textField_id.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_id.gridx = 1;
		gbc_textField_id.gridy = 5;
		contentPane.add(textField_id, gbc_textField_id);
		textField_id.setColumns(10);
		
		RoundedButton button_result = new RoundedButton("비밀번호 찾기");
		GridBagConstraints gbc_button_result = new GridBagConstraints();
		gbc_button_result.insets = new Insets(0, 0, 0, 5);
		gbc_button_result.gridx = 1;
		gbc_button_result.gridy = 7;
		contentPane.add(button_result, gbc_button_result);
		
		setVisible(true);
		
		button_result.addActionListener(new FindActon());
	}

}
