package beans;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: VendaItem
 *
 */
@Entity

public class VendaItem implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "VendaItemIdGen")
	@SequenceGenerator(name = "VendaItemIdGen", sequenceName = "VendaItemIdGen", allocationSize = 1)
	private Integer id_item;
	@Min(value=0)
	@NotNull(message="Deve ter quantidade")
	private Double quantidade = 0.0;
	@Min(value=0)
	@NotNull(message="Deve ter custo unitário")
	private Double custoUnitario = 0.0;
	@Min(value=0)
	@NotNull(message="Deve ter total")
	private Double total = 0.0;
	@ManyToOne(optional=false)
	@NotNull(message="Deve ter uma venda")
	private Venda venda;
	@ManyToOne(optional=false)
	private TipoPasse tipoPasse;
	private static final long serialVersionUID = 1L;

	public VendaItem() {
		super();
	}   
	public Integer getId_item() {
		return this.id_item;
	}

	public void setId_item(Integer id_item) {
		this.id_item = id_item;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public Double getCustoUnitario() {
		return custoUnitario;
	}
	public void setCustoUnitario(Double custoUnitario) {
		this.custoUnitario = custoUnitario;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public TipoPasse getTipoPasse() {
		return tipoPasse;
	}
	public void setTipoPasse(TipoPasse tipoPasse) {
		this.tipoPasse = tipoPasse;
	}
	
   
	
}
