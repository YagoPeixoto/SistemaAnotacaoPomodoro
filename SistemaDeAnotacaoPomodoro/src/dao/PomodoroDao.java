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
		
		String sql = "INSERT INTO Marcador " + "(idPomodoro, idUsuario, idAnotacao, dataInicio, dataFim)" + " VALUES (?,?,?,?,?)";
		 
	
		try{
			
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, pomodoro.getIdPomodoro());
			stmt.setLong(2, pomodoro.getIdUsuario());
			stmt.setDate(3, (Date) pomodoro.getDataInicio());
			stmt.setDate(4, (Date) pomodoro.getDataFim());
		
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			System.out.println(e);
		}
		
	}
	

}