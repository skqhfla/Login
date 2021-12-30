package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dao.Dao;

public class DBA {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/member?allowPublicKeyRetrieval=true";
	static final String USERNAME = "root";
	static final String PASSWORD = "!clvud58665854";

	static Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement ps = null;

	public static void main(String[] args) {
		System.out.print("User Table 접속 : ");
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

			if (conn != null) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exection");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e.getMessage());
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}

	public ArrayList<Dao> getMemberList() {
		ArrayList<Dao> list = new ArrayList<>();

		try {
			conn = getConn();
			String sql = "select * from member";
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();

			if (rs.next()) {
				do {
					Dao dto = new Dao();
					dto.setId(rs.getString("id"));
					dto.setPassword(rs.getString("password"));
					dto.setName(rs.getString("name"));
					dto.setPhone(rs.getString("phone"));
					dto.setGender(rs.getString("gender"));
					System.out.println("id = " + rs.getString("id"));
					list.add(dto);
				} while (rs.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("size = " + list.size());
		return list;
	}
	
	public Dao findID(String name) {
		Dao dto = new Dao();

		try {
			conn = getConn();
			String sql = "select * from member where name=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);

			rs = ps.executeQuery();

			if (rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPassword(rs.getString("password"));
				dto.setName(rs.getString("name"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setManeger(rs.getInt("maneger"));
				System.out.println("maneger = " + rs.getInt("maneger"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dto;
	}

	public Dao getMember(String id) {
		Dao dto = new Dao();

		try {
			conn = getConn();
			String sql = "select * from member where id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			rs = ps.executeQuery();

			if (rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPassword(rs.getString("password"));
				dto.setName(rs.getString("name"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setManeger(rs.getInt("maneger"));
				System.out.println("maneger = " + rs.getInt("maneger"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dto;
	}

	public boolean checkId(String id) {
		try {
			conn = getConn();
			String sql = "SELECT * FROM member WHERE id LIKE ?;";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			rs = ps.executeQuery();
			System.out.println("rs = " + rs);
			if (rs.next()) {
				System.out.println("id = " + rs.getString("id"));
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	public int insertDao(Dao dao) {
		int result = 0;
		try {
			conn = getConn();
			String sql = "insert into member (name, id, password, phone, gender) values (?, ?, ?, ?, ?);";
			ps = conn.prepareStatement(sql);
			ps.setString(1, dao.getName());
			ps.setString(2, dao.getId());
			ps.setString(3, dao.getPassword());
			ps.setString(4, dao.getPhone());
			ps.setString(5, dao.getGender());

			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public int deletetDao(String id) {
		int result = 0;
		try {
			conn = getConn();
			String sql = "DELETE FROM member WHERE id = ?;";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public int updateDao(Dao dao) {
		int result = 0;
		try {
			conn = getConn();
			String sql = "UPDATE member SET name= ? , password= ? , phone= ? , gender = ? WHERE id=?;";
			ps = conn.prepareStatement(sql);
			ps.setString(1, dao.getName());
			ps.setString(2, dao.getPassword());
			ps.setString(3, dao.getPhone());
			ps.setString(4, dao.getGender());
			ps.setString(5, dao.getId());

			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}