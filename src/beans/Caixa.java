package beans;

import beans.Usuario;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Caixa
 *
 */
@Entity

public class Caixa implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "CaixaIdGen")
	@SequenceGenerator(name = "CaixaIdGen", sequenceName = "CaixaIdGen", allocationSize = 1)
	private Integer id_caixa;
	@Temporal(TemporalType.DATE)
	private Date data_abertura;
	@Temporal(TemporalType.DATE)
	private Date data_fechamento;// new java.sql.Date(System.currentTimeMillis());
	@NotNull
	private Float caixa_inicial;
	private Float caixa_final;
	private Float valor_diferenca;
	@ManyToOne(optional=false)
	private Usuario usuario;
	private static final long serialVersionUID = 1L;

	public Caixa() {
		super();
	}   
	public Integer getId_caixa() {
		return this.id_caixa;
	}

	public void setId_caixa(Integer id_caixa) {
		this.id_caixa = id_caixa;
	}   
	public Date getData_abertura() {
		return this.data_abertura;
	}

	public void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}   
	public Date getData_fechamento() {
		return this.data_fechamento;
	}

	public void setData_fechamento(Date data_fechamento) {
		this.data_fechamento = data_fechamento;
	}   
	public Float getCaixa_inicial() {
		return this.caixa_inicial;
	}

	public void setCaixa_inicial(Float caixa_inicial) {
		this.caixa_inicial = caixa_inicial;
	}   
	public Float getCaixa_final() {
		return this.caixa_final;
	}

	public void setCaixa_final(Float caixa_final) {
		this.caixa_final = caixa_final;
	}   
	public Float getValor_diferenca() {
		return this.valor_diferenca;
	}

	public void setValor_diferenca(Float valor_diferenca) {
		this.valor_diferenca = valor_diferenca;
	}   
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
   
}
