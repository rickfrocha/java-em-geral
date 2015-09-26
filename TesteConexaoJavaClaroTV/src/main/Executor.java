/**
 * 
 */
package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Ricardo Rocha
 * @since  08/09/2015
 *  
 */
public class Executor {
	
	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		
		System.out.println(">>> Inicializando conexao");       
		
		Connection con = ConexaoHelper.getConexaoOracle("PR");		
		
		System.out.println(">>> Conectado");
		
		System.out.println(">>> Executando SQL");
		
		PreparedStatement ps = con.prepareStatement("Select * from SN_OPERADORA_CARTAO where id_operadora_cartao = 2");
		ResultSet rs = ps.executeQuery();
		
		System.out.println(">>> Imprimindo valores");
		while(rs.next()){
			System.out.println( rs.getDouble("VLR_SIMULA_PGTO") );
			System.out.println( rs.getString("DESCRICAO") );
		}
		rs.close();
		con.close();

	}

}
