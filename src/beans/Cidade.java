package beans;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;


import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Cidade
 *
 */
@Entity
public class Cidade implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "CidadeIdGen")
	@SequenceGenerator(name = "CidadeIdGen", sequenceName = "CidadeIdGen", allocationSize = 1)
	private Integer id;

	@Column(length = 60, nullable = false)
	@NotEmpty(message="O nome deve ser informado")
	@Length(min=2, max=60, message="O nome deve ter entre {min} e {max} caracteres")
	private String nome;
	
	@Column(length = 2, nullable = false)
	@NotEmpty(message="A uf deve ser informada")
	@Length(min=2, max=2, message="O uf deve ter entre {min} e {max} caracteres")
	private String uf;
	
	private static final long serialVersionUID = 1L;

	@PrePersist
	@PreUpdate
	private void antesPersistir() throws Exception{
		// validar a uf para ficar em mai�culo
		if ((uf != null) && (!uf.equals(uf.toUpperCase()))){
			throw new Exception("A UF deve ser em mai�sculo");
		}
		// converter o nome automaticamente para mai�sculo
		if (nome != null)
		   nome = nome.toUpperCase();
	}
	
	
	
	public Cidade(Integer id, String nome, String uf) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
	}



	public Cidade() {
		super();
		uf = "RS";
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
