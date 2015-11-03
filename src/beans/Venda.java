package beans;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Venda
 *
 */
@Entity

public class Venda implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "VendaIdGen")
	@SequenceGenerator(name = "VendaIdGen", sequenceName = "VendaIdGen", allocationSize = 1)
	private Integer id;
	@GeneratedValue(strategy = SEQUENCE, generator = "ReciboIdGen")
	@SequenceGenerator(name = "ReciboIdGen", sequenceName = "ReciboIdGen", allocationSize = 1)
	private Integer recibo;
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	@Min(value=0)
	private Double valorProdutos = 0.0;
	@Min(value=0)
	private Double valorTotal = 0.0;
	@ManyToOne(optional=false)
	@NotNull(message="O cliente é obrigatorio")
	private Pessoa cliente;
	@ManyToOne
	private Caixa caixa;
	@ManyToOne
	private Carteirinha carteirinha;
	@ManyToOne
	@NotNull(message="O usuário é obrigatorio")
	private Usuario usuario;
	@OneToMany(mappedBy = "venda", orphanRemoval = true, cascade = ALL)
	private List<VendaItem> itens;
	
	private static final long serialVersionUID = 1L;

	public Venda() {
		super();
		itens = new ArrayList<VendaItem>();
		
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRecibo() {
		return recibo;
	}
	public void setRecibo(Integer recibo) {
		this.recibo = recibo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorProdutos() {
		return valorProdutos;
	}
	public void setValorProdutos(Double valorProdutos) {
		this.valorProdutos = valorProdutos;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	public List<VendaItem> getItens() {
		return itens;
	}
	public void setItens(List<VendaItem> itens) {
		this.itens = itens;
	}
	public Caixa getCaixa() {
		return caixa;
	}
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	public Carteirinha getCarteirinha() {
		return carteirinha;
	}
	public void setCarteirinha(Carteirinha carteirinha) {
		this.carteirinha = carteirinha;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
   
}
