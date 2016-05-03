package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.Pomodoro;

public class PomodoroDao {
	
	private Connection connection;
	
	public PomodoroDao(){
		this.connection = (Connection) new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Pomodoro pomodoro){
		
		String sql = "INSERT INTO pomodoro " + "(idPomodoro, idUsuario, idAnotacao, dataInicio, dataFim)" + " VALUES (?,?,?,?,?)";
		 
	
		try{
			
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, pomodoro.getIdPomodoro());
			stmt.setLong(2, pomodoro.getIdUsuario());
			stmt.setLong(3, pomodoro.getIdAnotacao());
			stmt.setDate(4, new Date (pomodoro.getDataInicio().getTime()));
			stmt.setDate(5, new Date (pomodoro.getDataFim().getTime()));
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			System.out.println(e);
		}
		
	}
	

}