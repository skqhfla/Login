package Design;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Action.HomeAction;

public class DeleteFinal extends JFrame {

	private JPanel contentPane;

	public DeleteFinal() {
		setBounds(100, 100, 318, 193);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 10, 0, 10, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel Lable_title = new JLabel("Á¤¸» Å»ÅðÇÏ½Ã°Ú½À´Ï±î?");
		Lable_title.setFont(new Font("³ª´®°íµñ ExtraBold", Font.BOLD, 15));
		GridBagConstraints gbc_Lable_title = new GridBagConstraints();
		gbc_Lable_title.gridwidth = 5;
		gbc_Lable_title.insets = new Insets(0, 0, 5, 5);
		gbc_Lable_title.gridx = 2;
		gbc_Lable_title.gridy = 1;
		contentPane.add(Lable_title, gbc_Lable_title);

		RoundedButton button_ok = new RoundedButton("È®ÀÎ");
		GridBagConstraints gbc_button_ok = new GridBagConstraints();
		gbc_button_ok.insets = new Insets(0, 0, 0, 5);
		gbc_button_ok.gridx = 3;
		gbc_button_ok.gridy = 4;
		contentPane.add(button_ok, gbc_button_ok);

		RoundedButton button_cancel = new RoundedButton("Ãë¼Ò");
		GridBagConstraints gbc_button_cancel = new GridBagConstraints();
		gbc_button_cancel.insets = new Insets(0, 0, 0, 5);
		gbc_button_cancel.gridx = 6;
		gbc_button_cancel.gridy = 4;
		contentPane.add(button_cancel, gbc_button_cancel);

		button_ok.addActionListener(new HomeAction());
		button_ok.addActionListener(new HomeAction());

		setVisible(true);
	}
}
