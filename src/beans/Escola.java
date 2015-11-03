package beans;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Escola
 *
 */
@Entity

public class Escola implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "EscolaIdGen")
	@SequenceGenerator(name = "EscolaIdGen", sequenceName = "EscolaIdGen", allocationSize = 1)
	private Integer id_escola;
	@Column(length = 60, nullable = false)
	@NotEmpty(message="O nome deve ser informado")
	private String nome;
	private static final long serialVersionUID = 1L;

	public Escola() {
		super();
	}   
	
	public Escola(Integer id_escola, String nome) {
		super();
		this.id_escola = id_escola;
		this.nome = nome;
	}

	public Integer getId_escola() {
		return this.id_escola;
	}

	public void setId_escola(Integer id_escola) {
		this.id_escola = id_escola;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   
}
