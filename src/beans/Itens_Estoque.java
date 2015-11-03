package beans;

import beans.TipoPasse;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * Entity implementation class for Entity: Itens_Estoque
 *
 */
@Entity

public class Itens_Estoque implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "ItensEstoqueIdGen")
	@SequenceGenerator(name = "ItensEstoqueIdGen", sequenceName = "ItensEstoqueIdGen", allocationSize = 1)
	private Integer id_itens_estoque;
	@NotNull
	private Integer quantidade;
	@NotNull
	private Float valor_venda;
	@NotNull
	@Length(max=1)
	private String operacao;
	@ManyToOne(optional=false)
	private TipoPasse tipoPasse;
	@ManyToOne(optional=false)
	private Estoque estoque;
	private static final long serialVersionUID = 1L;

	public Itens_Estoque() {
		super();
	}   
	public Integer getId_itens_estoque() {
		return this.id_itens_estoque;
	}

	public void setId_itens_estoque(Integer id_itens_estoque) {
		this.id_itens_estoque = id_itens_estoque;
	}   
	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}   
	public Float getValor_venda() {
		return this.valor_venda;
	}

	public void setValor_venda(Float valor_venda) {
		this.valor_venda = valor_venda;
	}   
	public String getOperacao() {
		return this.operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}   
	public TipoPasse getTipoPasse() {
		return this.tipoPasse;
	}

	public void setTipoPasse(TipoPasse tipoPasse) {
		this.tipoPasse = tipoPasse;
	}
	public Itens_Estoque(Estoque estoque) {
		super();
		this.estoque = estoque;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
   
}
