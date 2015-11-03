package beans;

import beans.Cursos;
import beans.Escola;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

/**
 * Entity implementation class for Entity: Carteirinha
 *
 */
@Entity

public class Carteirinha implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "CarteirinhaIdGen")
	@SequenceGenerator(name = "CarteirinhaIdGen", sequenceName = "CarterinhaIdGen", allocationSize = 1)
	private Integer id_carteirinha;
	@NotNull
	private Integer ano;
	@Temporal(TemporalType.DATE)
	@NotNull(message="A data de validade é obrigatória")
	@Past(message="A data de validade deve ser no passado")
	private Date data_validade;
	@ManyToOne(optional=false)
	@NotNull(message="O curso é obrigatorio")
	private Cursos cursos;
	@ManyToOne(optional=false)
	@NotNull(message="A escola é obrigatória")
	private Escola escola;
	@ManyToOne(optional=false)
	@NotNull(message="O cliente é obrigatório")
	private Pessoa cliente;
	private static final long serialVersionUID = 1L;

	public Carteirinha() {
		super();
	}   
	public Integer getId_carteirinha() {
		return this.id_carteirinha;
	}

	public void setId_carteirinha(Integer id_carteirinha) {
		this.id_carteirinha = id_carteirinha;
	}   
	public Integer getAno() {
		return this.ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}   
	public Date getData_validade() {
		return this.data_validade;
	}

	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	}   
	public Cursos getCursos() {
		return this.cursos;
	}

	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}   
	public Escola getEscola() {
		return this.escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	public Carteirinha(Pessoa cliente) {
		super();
		this.cliente = cliente;
	}
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
   
}
