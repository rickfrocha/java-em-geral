/**
 * 
 */

/**
 * @author Ricardo Rocha
 * @since  02/09/2015
 *  
 */
public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	
	/**
	 * 
	 */
	public Pessoa(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nome ;
	}


	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Pessoa pessoa) {
		
		return this.nome.compareTo(pessoa.getNome()); 
	}
	
	

}
