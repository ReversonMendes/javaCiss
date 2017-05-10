package br.com.ciss.banco;

import java.sql.DriverManager;
import java.util.Properties;

public class TestaProperties {

	public static void main(String[] args) {
		Properties config = new Properties();
		config.setProperty("database.login", "scott");
		config.setProperty("database.password", "tiger");
		config.setProperty("database.url","jdbc:mysql:/localhost/teste");
		
		// muitas linhas depois...

		String login = config.getProperty("database.login");
		String password = config.getProperty("database.password");
		String url = config.getProperty("database.url");
		
		
		//DriverManager.getConnection(url, login, password);
		System.out.println("login - > "+login);
		System.out.println("Senha - > "+password);
		System.out.println("url - > "+url);
	}

}
