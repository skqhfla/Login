package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Dao.Dao;
import DataBase.DBA;
import Design.Notice;
import Main.Main;

public class FindActon implements ActionListener {
	Main main = new Main();
	Notice complete = new Notice();
	DBA base = new DBA();

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("아이디 찾기")) {
			String name = main.getWindow5().getTextField_name().getText();
			Dao dao = base.findID(name);
			if (dao.getId() != null) {
				main.getWindow5().setVisible(false);
				complete.ResultID(dao.getId());
				complete.setVisible(true);
			} else {
				main.getWindow5().setVisible(false);
				complete.ResultIDfalse();
				complete.setVisible(true);
			}

		} else if (e.getActionCommand().equals("비밀번호 찾기")) {
			String id = main.getWindow6().getTextField_id().getText();
			Dao dao = base.getMember(id);
			main.getWindow6().setVisible(false);
			if (dao.getId() != null) {
				complete.ResultPW(dao.getPassword());
				complete.setVisible(true);
			} else {
				complete.IdFalse();
				complete.setVisible(true);
			}

		}
	}

}
