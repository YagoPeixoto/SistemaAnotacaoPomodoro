package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.Anotacao;

public class AnotacaoDao {
	
	private Connection connection;
	
	public AnotacaoDao(){
		this.connection = (Connection) new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Anotacao anotacao){
		
		String sql = "INSERT INTO Anotacao " + "(idAnotacao, idUser,titulo,conteudo,lembrete,dataCriacao,ultimaModificacao,cor,idMarcacao)" + " VALUES (?,?,?,?,?,?,?,?,?)";
		
	
		try{
			
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, anotacao.getIdAnotacao());
			stmt.setLong(2, anotacao.getIdUser());
			stmt.setString(3, anotacao.getTitulo());
			stmt.setString(4, anotacao.getConteudo());
			stmt.setDate(5, (Date) anotacao.getLembrete());
			stmt.setDate(6, (Date) anotacao.getDataCricacao());
			stmt.setDate(7, (Date) anotacao.getUltimaModificacao());
			stmt.setString(8, anotacao.getCor());
			stmt.setLong(9, anotacao.getIdMarcacao());
			
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			System.out.println(e);
		}
		
	}
	

}