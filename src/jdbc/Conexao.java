package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
		public static Connection createConnection() throws SQLException {
			
			String usuario = "postgres";
			String stringConexao = "jdbc:postgresql://localhost:5432/jdbc";
			String senha = "l30@postgresql";
			
			Connection conexao = null;
			conexao = DriverManager.getConnection(stringConexao, usuario, senha);
			
			return conexao;
		}
	
}
