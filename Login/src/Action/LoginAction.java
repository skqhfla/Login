package Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DataBase.DBA;
import Design.Home;
import Design.Notice;
import Main.Main;

public class LoginAction implements ActionListener {
	Main main = new Main();
	DBA base = new DBA();
	Notice complete = new Notice();

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("로그인")) {
			String id = main.getWindow1().getText_id().getText();
			String pw = "";

			String id_test = base.getMember(id).getId();
			String pw_test = base.getMember(id).getPassword();

			char[] secret_pw = main.getWindow1().getText_pw().getPassword();
			for (char cha : secret_pw) {
				Character.toString(cha);
				pw += (pw.equals("")) ? "" + cha + "" : "" + cha + "";
			}

			if (id_test == null) {
				complete.IdFalse();
				complete.setVisible(true);
			} else if (!pw.equals(pw_test)) {
				complete.PwFalse();
				complete.setVisible(true);
			} else if (base.getMember(id).getManeger() == 1) {
				main.startManeger(base.getMemberList());
				main.getWindow1().setVisible(false);
			} else {
				main.startHome(base.getMember(id));
				main.getWindow1().setVisible(false);
			}

		} else if (e.getActionCommand().equals("회원가입")) {
			main.getWindow1().setVisible(false);
			main.startSignup();
		} else if (e.getActionCommand().equals("아이디 찾기")) {
			main.startFindId();
		} else if (e.getActionCommand().equals("비밀번호 찾기")) {
			main.startFindPw();
		}

	}

}
