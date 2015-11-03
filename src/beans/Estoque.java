package beans;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Estoque
 *
 */
@Entity

public class Estoque implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "EstoqueIdGen")
	@SequenceGenerator(name = "EstoqueIdGen", sequenceName = "EstoqueIdGen", allocationSize = 1)
	private Integer id_estoque;
	@NotNull
	private String operacao;
	@Temporal(TemporalType.DATE)
	private Date data;
	@ManyToOne
	@NotNull
	private Usuario usuario;
	@ManyToOne
	@NotNull
	private Caixa caixa;
	@ManyToOne
	private Movimento movimento;
	private static final long serialVersionUID = 1L;

	public Estoque() {
		super();
	}   
	public Integer getId_estoque() {
		return this.id_estoque;
	}

	public void setId_estoque(Integer id_estoque) {
		this.id_estoque = id_estoque;
	}   
	public String getOperacao() {
		return this.operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}   
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	public Estoque(Usuario usuario) {
		super();
		this.usuario = usuario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Estoque(Caixa caixa) {
		super();
		this.caixa = caixa;
	}
	public Caixa getCaixa() {
		return caixa;
	}
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	public Estoque(Movimento movimento) {
		super();
		this.movimento = movimento;
	}
	public Movimento getMovimento() {
		return movimento;
	}
	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}
	
	
   
}
