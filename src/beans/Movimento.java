package beans;

import beans.Caixa;
import beans.Carteirinha;
import beans.Pessoa;
import beans.Usuario;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Movimento
 *
 */
@Entity

public class Movimento implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "MovimentoIdGen")
	@SequenceGenerator(name = "MovimentoIdGen", sequenceName = "MovimentoIdGen", allocationSize = 1)
	private Integer id_movimento;
	@Length(max=1)
	@NotNull
	private String operacao;
	@NotNull
	@GeneratedValue(strategy = SEQUENCE, generator = "ReciboIdGen")
	@SequenceGenerator(name = "ReciboIdGen", sequenceName = "ReciboIdGen", allocationSize = 1)
	private Integer recibo;
	@Temporal(TemporalType.DATE)
	private Date data;
	@NotNull
	private Float valor_recebido;
	@NotNull
	private Float valor_total;
	private Float valor_troco;
	@ManyToOne
	private Caixa caixa;
	@ManyToOne
	private Pessoa cliente;
	@ManyToOne
	private Carteirinha carteirinha;
	@ManyToOne
	private Usuario usuario;
	private static final long serialVersionUID = 1L;

	public Movimento() {
		super();
	}   
	public Integer getId_movimento() {
		return this.id_movimento;
	}

	public void setId_movimento(Integer id_movimento) {
		this.id_movimento = id_movimento;
	}   
	public String getOperacao() {
		return this.operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}   
	public Integer getRecibo() {
		return this.recibo;
	}

	public void setRecibo(Integer recibo) {
		this.recibo = recibo;
	}   
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}   
	public Float getValor_recebido() {
		return this.valor_recebido;
	}

	public void setValor_recebido(Float valor_recebido) {
		this.valor_recebido = valor_recebido;
	}   
	public Float getValor_total() {
		return this.valor_total;
	}

	public void setValor_total(Float valor_total) {
		this.valor_total = valor_total;
	}   
	public Float getValor_troco() {
		return this.valor_troco;
	}

	public void setValor_troco(Float valor_troco) {
		this.valor_troco = valor_troco;
	}   
	public Caixa getCaixa() {
		return this.caixa;
	}

	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}   
	public Pessoa getCliente() {
		return this.cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}   
	public Carteirinha getCarteirinha() {
		return this.carteirinha;
	}

	public void setCarteirinha(Carteirinha carteirinha) {
		this.carteirinha = carteirinha;
	}   
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
   
}
