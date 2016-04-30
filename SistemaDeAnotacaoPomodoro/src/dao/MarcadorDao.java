package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.Marcador;

public class MarcadorDao {
	
	private Connection connection;
	
	public MarcadorDao(){
		this.connection = (Connection) new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Marcador marcador){
		
		String sql = "INSERT INTO Marcador " + "(idMarcador, nome,cor)" + " VALUES (?,?,?)";
		
	
		try{
			
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, marcador.getIdMarcador());
			stmt.setString(2, marcador.getNome());
			stmt.setString(3, marcador.getCor());
		
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			System.out.println(e);
		}
		
	}
	

}