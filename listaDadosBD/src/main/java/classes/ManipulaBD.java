package classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ManipulaBD {

	public Departamento retornaDepartamento() {
		
		Departamento d = new Departamento();
		
		try {
		
			ConectaBD cdb = new ConectaBD();
			Connection c = cdb.conectar();
			String sql = "select codigo, nome, localizacao, "
					+ "codigoFuncionarioGerente "
					+ "from departamento where codigo = 1";
			
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			rs.next();			
			d.setCodigo(rs.getInt("codigo"));
			d.setNome(rs.getString("nome"));
			d.setLocalizacao(rs.getString("localizacao"));
			d.setCodigoFuncionarioGerente(rs.getInt("codigoFuncionarioGerente"));
			
			rs.close();
			st.close();
			
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return d;
		
	}
	
}
