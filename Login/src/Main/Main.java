package Main;

import java.util.ArrayList;

import Dao.Dao;
import Design.DeleteFinal;
import Design.FindId;
import Design.FindPw;
import Design.Home;
import Design.Login;
import Design.Maneger;
import Design.Signup;

public class Main {
	static Login window1 = null;
	static Home window2 = null;
	static Signup window3 = null;
	static Maneger window4 = null;
	static FindId window5 = null;
	static FindPw window6 = null;
	static DeleteFinal window7 = null;

	public static Login getWindow1() {
		return window1;
	}

	public static Home getWindow2() {
		return window2;
	}

	public Signup getWindow3() {
		return window3;
	}

	public static Maneger getWindow4() {
		return window4;
	}
	
	public static FindId getWindow5() {
		return window5;
	}
	
	public static FindPw getWindow6() {
		return window6;
	}
	
	public static DeleteFinal getWindow7() {
		return window7;
	}

	public static void startLogin() {
		window1 = new Login();
	}

	public static void startHome(Dao dao) {
		window2 = new Home(dao);
	}

	public static void startSignup() {
		window3 = new Signup();
	}

	public static void startManeger(ArrayList<Dao> dao) {
		window4 = new Maneger(dao);
	}
	
	public static void startFindId() {
		window5 = new FindId();
	}
	
	public static void startFindPw() {
		window6 = new FindPw();
	}
	
	public static void startDeleteFinal() {
		window7 = new DeleteFinal();
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.startLogin();
	}
}