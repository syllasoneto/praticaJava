package classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaBD {

	private String usuario;
	private String senha;
	
	public Connection conectar() throws Exception {
		
		this.setUsuario("root");
		this.setSenha("admin");
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost/empresax";
		java.sql.Connection conn = DriverManager.getConnection(url, this.getUsuario(), this.getSenha());
		
		return conn;
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
