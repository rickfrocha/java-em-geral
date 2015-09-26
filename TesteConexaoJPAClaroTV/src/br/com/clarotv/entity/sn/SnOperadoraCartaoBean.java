/**
 * 
 */
package br.com.clarotv.entity.sn;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Ricardo Rocha
 * @since  08/09/2015
 *  
 */
@Entity
@Table(name="SN_OPERADORA_CARTAO")
@NamedQuery(name="listaOperadorasAtivas",
		    query="Select operadoraCartao from SnOperadoraCartaoBean operadoraCartao where operadoraCartao.flagInterface = 'S'")
	
public class SnOperadoraCartaoBean {

	@Id
	@Column(name="ID_OPERADORA_CARTAO")
	private long idOperadoraCartao;

	private String descricao;

	@Column(name="AUTORIZACAO_COMPRA")
	private Integer autorizacaoCompra;

	@Column(name="FLAG_INTERFACE")
	private String flagInterface;
	
	@Column(name="ID_OPERADORA_RETORNO")
	private Integer idOperadoraRetorno;

	
	@Column(name="ID_OPERADORA_ESITEF")
	private Integer idOperadoraESitef;
	
	@Column(name = "VLR_SIMULA_PGTO")
	private BigDecimal vlrSimulaPgto;


	public SnOperadoraCartaoBean() {
		super();
	}

	public long getIdOperadoraCartao() {
		return this.idOperadoraCartao;
	}

	public void setIdOperadoraCartao(long idOperadoraCartao) {
		this.idOperadoraCartao = idOperadoraCartao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getAutorizacaoCompra() {
		return this.autorizacaoCompra;
	}

	public void setAutorizacaoCompra(Integer autorizacaoCompra) {
		this.autorizacaoCompra = autorizacaoCompra;
	}

	public String getFlagInterface() {
		return this.flagInterface;
	}

	public void setFlagInterface(String flagInterface) {
		this.flagInterface = flagInterface;
	}

	
	public void setIdOperadoraRetorno(Integer idOperadoraRetorno) {
		this.idOperadoraRetorno = idOperadoraRetorno;
	}
	
	public Integer getIdOperadoraRetorno() {
		return idOperadoraRetorno;
	}
	
	public Integer getIdOperadoraESitef() {
		return idOperadoraESitef;
	}

	public void setIdOperadoraESitef(Integer idOperadoraESitef) {
		this.idOperadoraESitef = idOperadoraESitef;
	}

	public BigDecimal getVlrSimulaPgto() {
		if(vlrSimulaPgto == null){
			vlrSimulaPgto = BigDecimal.ZERO;
		}
		return vlrSimulaPgto;
	}

	public void setVlrSimulaPgto(BigDecimal vlrSimulaPgto) {
		this.vlrSimulaPgto = vlrSimulaPgto;
	}
	

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (int) (idOperadoraCartao ^ (idOperadoraCartao >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SnOperadoraCartaoBean other = (SnOperadoraCartaoBean) obj;
		if (idOperadoraCartao != other.idOperadoraCartao)
			return false;
		return true;
	}


}
