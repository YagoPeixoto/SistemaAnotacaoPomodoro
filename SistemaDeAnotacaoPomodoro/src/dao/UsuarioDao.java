package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.Usuario;

public class UsuarioDao {
	
	private Connection connection;
	
	public UsuarioDao(){
		this.connection = (Connection) new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Usuario usuario){
		
		String sql = "INSERT INTO Anotacao " + "(idUsuario, nome,sobreNome,dataNascimento,usuarioID,"
				+ "tempoPomodoro,tempoDescanco,tempoDescancoLongo,sessoesTrabalho)" + " VALUES (?,?,?,?,?,?,?,?,?)";
		
	
		try{
			
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, usuario.getIdUsuario());
			stmt.setNString(2, usuario.getNome());
			stmt.setString(3, usuario.getSobreNome());
			stmt.setDate(4, (Date) usuario.getDataNascimento());
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