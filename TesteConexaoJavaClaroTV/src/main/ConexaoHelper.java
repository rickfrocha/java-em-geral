/**
 * 
 */
package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Ricardo Rocha
 * @since  08/09/2015
 *  
 */
public class ConexaoHelper {
	
	static Map<String,String> propertiesDB = new HashMap<String,String>();
	
	static {
		propertiesDB.put("PR", "../config/DadosConexao_PR.properties");
		propertiesDB.put("TS", "../config/DadosConexao_TS.properties");
	}
	
   static Connection getConexaoOracle(String dbPropertiesSufix) throws IOException, ClassNotFoundException, SQLException{
	   Properties prop = new Properties();
   	   prop.load( Executor.class.getResourceAsStream(propertiesDB.get(dbPropertiesSufix)) );
	   ConexaoOracle con = new ConexaoOracle(prop);
	   return con.getConnection();
   }


}
