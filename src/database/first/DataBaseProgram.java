package database.first;

import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;
import java.sql.DriverManager;

public class DataBaseProgram {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://10.1.8.20/sakila?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
					"ogrenci", "1234");

//			SelectMethod(con);
			InsertActor(con);
			SelectMethod(con);

			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void InsertActor(Connection con) throws SQLException {
		Actor newActor=GetActor();
		Statement stmt = con.createStatement();
		String query=String.format("INSERT INTO sakila.actor (first_name, last_name) VALUES ({0}, {1})",newActor.first_name, newActor.last_name);
		stmt.executeUpdate(query);
		
		
	}

	private static Actor GetActor() {
		Scanner scanner=new Scanner(System.in);
 		Actor newActor=new Actor();
 		System.out.println("Aktör adýný giriniz.");
 		newActor.first_name= scanner.next();
 		System.out.println("Aktör soyadýný giriniz.");
 		newActor.last_name=scanner.next();
 		Date date=Calendar.getInstance().getTime();
 		newActor.last_update=date;
 		return newActor;
	}

	private static void SelectMethod(Connection con) throws SQLException {
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("Select * from sakila.actor ");
		while (rs.next()) {
			System.out.println(rs.getString(2) +" "+ rs.getString(3));
		}
	}

}
