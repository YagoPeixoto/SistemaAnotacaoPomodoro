package dao;

import java.sql.*;

import connection.ConnectionFactory;
import model.Usuario;

public class UsuarioDao {
	
	private Connection connection;
	
	public UsuarioDao(){
		this.connection = (Connection) new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Usuario usuario){
		
		String sql = "INSERT INTO usuario " + "(idUsuario, nome,sobreNome,dataNascimento,usuarioID,"
				+ "tempoPomodoro,tempoDescanco,tempoDescancoLongo,sessoesTrabalho)" + " VALUES (?,?,?,?,?,?,?,?,?)";
		
	
		try{
			
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, usuario.getIdUsuario());
			stmt.setNString(2, usuario.getNome());
			stmt.setString(3, usuario.getSobreNome());
			stmt.setDate(4, (new Date(usuario.getDataNascimento().getTime())));
			stmt.setString(5, usuario.getUsuarioID());
			stmt.setLong(6, usuario.getTempoPomodoro());
			stmt.setLong(7, usuario.getTempoDescanco());
			stmt.setLong(8, usuario.getTempoDescancoLongo());
			stmt.setLong(9, usuario.getSessoesTrabalho());
			
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			System.out.println(e);
		}
		
	}
	

}