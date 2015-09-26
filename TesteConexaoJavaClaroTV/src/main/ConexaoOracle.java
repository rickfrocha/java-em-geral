/**
 * 
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Ricardo Rocha
 * @since  08/09/2015
 *  
 */
public class ConexaoOracle {

	private String usuario; 
	private String senha; 
	private String host; 
	private String porta; 
	private String base;
	
	public ConexaoOracle(String usuario, String senha, String host, String porta, String base) {
		this.usuario = usuario;
		this.senha = senha;
		this.host = host;
		this.porta = porta;
		this.base = base;
	}
	
	public ConexaoOracle(Properties prop){
		this.usuario = prop.getProperty("usuario");
		this.senha   = prop.getProperty("senha");
		this.host    = prop.getProperty("host");
		this.porta   = prop.getProperty("porta");
		this.base    = prop.getProperty("base");			
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		String url =  String.format("jdbc:oracle:thin:@%s:%s:%s",this.host,this.porta,this.base);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(url, this.usuario, this.senha);
	}

}
