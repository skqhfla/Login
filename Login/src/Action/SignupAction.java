package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Check.Check;
import Dao.Dao;
import DataBase.DBA;
import Design.Notice;
import Main.Main;

public class SignupAction implements ActionListener {
	Main main = new Main();
	Notice complete = new Notice();
	DBA base = new DBA();
	Check check = new Check();

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("중복확인")) {
			String id = main.getWindow3().getTextField_id().getText();
			if (base.checkId(id) == true) {
				main.getWindow3().IdCheckpass();
			} else {
				main.getWindow3().IdCheckfalse();
			}
		} else if (e.getActionCommand().equals("가입하기")) {
			String name = main.getWindow3().getTextField_name().getText();
			String id = main.getWindow3().getTextField_id().getText();
			System.out.println("id = " + main.getWindow3().getTextField_id().getText());
			boolean idcheck = false;
			if (id.length() >= 1)
				idcheck = check.idCheck(main.getWindow3().getTextField_id());
			String pw = check.pwCheck(main.getWindow3().getTextField_pw());
			String phone = main.getWindow3().getComboBox_phone().getSelectedItem().toString()
					+ main.getWindow3().getTextField_phone1().getText()
					+ main.getWindow3().getTextField_phone2().getText();

			String gender = "";
			if (main.getWindow3().getRadio_gender()[0].isSelected())
				gender = main.getWindow3().getRadio_gender()[0].getText();
			else if (main.getWindow3().getRadio_gender()[1].isSelected())
				gender = main.getWindow3().getRadio_gender()[1].getText();

			if (name.length() >= 1) {
				System.out.println("asdfa");
				if (idcheck == true) {
					System.out.println("asdfasdfasda");
					if (pw.length() >= 8) {
						System.out.println("pw = " + pw);

						Dao di = new Dao(name, id, pw, phone, gender);

						if (base.insertDao(di) == 1) {
							main.startLogin();
							main.getWindow3().setVisible(false);
							complete.Signup();
							complete.setVisible(true);
						} else {
							System.out.println("false");
						}

					} else {
						complete.FalsePw();
						complete.setVisible(true);
					}

				} else {
					complete.FalseID();
					complete.setVisible(true);
				}
			} else {
				complete.NoName();
				complete.setVisible(true);
			}

		}

	}
}
