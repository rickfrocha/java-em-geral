/**
 * 
 */
package br.com.clarotv.principal;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.clarotv.entity.sn.SnOperadoraCartaoBean;

/**
 * @author Ricardo Rocha
 * @since  08/09/2015
 *  
 */
public class Executor {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PROD_JD_PU");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createNamedQuery("listaOperadorasAtivas",SnOperadoraCartaoBean.class);
		@SuppressWarnings("unchecked")
		List<SnOperadoraCartaoBean> operadoras = query.getResultList();
		
		for(SnOperadoraCartaoBean operadora: operadoras){
			System.out.println("Operadora: "+ String.format("%s / %.2f", operadora.getDescricao(),
																	  operadora.getVlrSimulaPgto().doubleValue())) ;
		}
		
        em.close();
	}

}
