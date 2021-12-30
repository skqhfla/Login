package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Check.Check;
import Dao.Dao;
import DataBase.DBA;
import Design.DeleteFinal;
import Design.Notice;
import Main.Main;

public class HomeAction implements ActionListener {
	Main main = new Main();
	Notice complete = new Notice();
	DBA base = new DBA();
	Check check = new Check();

	boolean idcheck;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("정보 수정하기") || e.getActionCommand().equals("변경하기")) {
			String name = main.getWindow2().getTextField_name().getText();
			String id = main.getWindow2().getTextField_id().getText();
			String pw = check.pwCheck(main.getWindow2().getPasswordField());
			String phone = "";
			if (main.getWindow4().getComboBox() != null) {
				phone += main.getWindow2().getComboBox().getSelectedItem().toString();
				if (main.getWindow2().getTextField_phone1().getText() != null) {
					phone += main.getWindow2().getTextField_phone1().getText();
					if (main.getWindow2().getTextField_phone2().getText() != null)
						phone += main.getWindow4().getTextField_phone2().getText();
				}
			}

			String gender = "";
			if (main.getWindow2().getRadio_gender()[0].isSelected())
				gender = main.getWindow2().getRadio_gender()[0].getText();
			else if (main.getWindow2().getRadio_gender()[1].isSelected())
				gender = main.getWindow2().getRadio_gender()[1].getText();

			System.out.println("before id");
			if (pw != null) {
				System.out.println("before pw");
				if (name != null) {
					Dao di = new Dao(name, id, pw, phone, gender);
					System.out.println("before update");
					if (base.updateDao(di) == 1) {
						complete.Update();
						complete.setVisible(true);
					} else {
						System.out.println("false");
					}
				}
			}
		} else if (e.getActionCommand().equals("탈퇴하기")) {
			main.startDeleteFinal();
		} else if (e.getActionCommand().equals("확인")) {
			String id = null;

			if (main.getWindow2() != null)
				id = main.getWindow2().getTextField_id().getText();
			else if (main.getWindow4() != null)
				id = main.getWindow4().getTextField_id().getText();

			if (base.deletetDao(id) == 1) {
				main.startLogin();
				complete.Delete();
				complete.setVisible(true);
				if (main.getWindow2() != null)
					main.getWindow2().setVisible(false);
				else if (main.getWindow4() != null)
					main.getWindow4().setVisible(false);
			}
		} else if (e.getActionCommand().equals("취소")) {
			main.getWindow7().setVisible(false);
		}
	}
}
