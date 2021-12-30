package Check;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DataBase.DBA;

public class Check {
	DBA base = new DBA();
	
	public String pwCheck(JPasswordField passwordField) {
		String pw = "";

		char[] secret_pw = passwordField.getPassword();
		for (char cha : secret_pw) {
			Character.toString(cha);
			pw += (pw.equals("")) ? "" + cha + "" : "" + cha + "";
		}

		boolean num = false;
		boolean eng_big = false;
		boolean eng_small = false;
		boolean sp = !pw.matches("[0-9|a-z|A-Z|¤¡-¤¾|¤¿-¤Ó|°¡-Èþ]*");

		System.out.println(pw + " " + num + " " + eng_big + " " + eng_small + " " + sp);

		if (pw.length() >= 8 && pw.length() <= 16) {
			System.out.println("length");
			for (int i = 0; i < pw.length(); i++) {
				if (Character.isDigit(pw.charAt(i)))
					num = true;
				else if (pw.charAt(i) >= 'a' && pw.charAt(i) <= 'z')
					eng_small = true;
				else if (pw.charAt(i) >= 'A' && pw.charAt(i) <= 'Z')
					eng_big = true;
				System.out.println(pw + " " + num + " " + eng_big + " " + eng_small + " " + sp);
			}
		} else {
			return "";
		}

		if (num == true && eng_big == true && eng_small == true && sp == true) {
			return pw;
		}

		return "";
	}
	
	public boolean idCheck(JTextField textField_id) {
		String id = textField_id.getText();
		if (base.checkId(id) == true) {
			return true;
		} else {
			return false;
		}
	}
}
