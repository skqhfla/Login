package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Check.Check;
import Dao.Dao;
import DataBase.DBA;
import Design.DeleteFinal;
import Design.Notice;
import Main.Main;

public class ManegerAction implements ActionListener {
	Main main = new Main();
	Notice complete = new Notice();
	DBA base = new DBA();
	Check check = new Check();
	DeleteFinal delete = new DeleteFinal();

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("수정하기")) {
			String name = main.getWindow4().getTextField_name().getText();
			String id = main.getWindow4().getTextField_id().getText();
			String pw = check.pwCheck(main.getWindow4().getPasswordField());
			String phone = "";
			if (main.getWindow4().getComboBox() != null) {
				phone += main.getWindow4().getComboBox().getSelectedItem().toString();
				System.out.println("phone = " + phone);
				if (main.getWindow4().getTextField_phone1().getText() != null) {
					phone += main.getWindow4().getTextField_phone1().getText();
					System.out.println("phone = " + phone);
					if (main.getWindow4().getTextField_phone2().getText() != null) {
						phone += main.getWindow4().getTextField_phone2().getText();
						System.out.println("phone = " + phone);
					}		
				}
			}
			
			System.out.println("phone = " + phone);
			String gender = "";
			if (main.getWindow4().getRadio_gender()[0].isSelected())
				gender = main.getWindow4().getRadio_gender()[0].getText();
			else if (main.getWindow4().getRadio_gender()[1].isSelected())
				gender = main.getWindow4().getRadio_gender()[1].getText();

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
			
			main.getWindow4().setVisible(false);
			main.startManeger(base.getMemberList());
		} else if (e.getActionCommand().equals("강퇴하기")) {
			main.startDeleteFinal();
		} else if (e.getActionCommand().equals("이전")) {
			int number = main.getWindow4().getIndex();
			if (number == 0) {
				complete.First();
				complete.setVisible(true);
			} else {
				main.getWindow4().setIndex(number - 1);
				System.out.println("list size = " + main.getWindow4().getList().size());
				main.getWindow4().set(main.getWindow4().getList().get(--number));
			}

		} else if (e.getActionCommand().equals("다음")) {
			int number = main.getWindow4().getIndex();
			System.out.println("number = " + number + " size = " + main.getWindow4().getList().size());
			if (number + 1 >= main.getWindow4().getList().size()) {
				complete.Final();
				complete.setVisible(true);
			} else {
				main.getWindow4().setIndex(number + 1);
				System.out.println("list size = " + main.getWindow4().getList().size());
				main.getWindow4().set(main.getWindow4().getList().get(++number));
			}
		}
	}
}
