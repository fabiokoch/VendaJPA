package beans;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import static javax.persistence.InheritanceType.JOINED;
import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Inheritance(strategy = JOINED)
public abstract class Pessoa implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "PessoaIdGen")
	@SequenceGenerator(name = "PessoaIdGen", sequenceName = "PessoaIdGen", allocationSize = 1)
	private Integer id;
	
	@Column(length = 50, nullable = true, unique = false)
	@NotEmpty(message="O nome deve ser informado!")
	@Length(min=2, max=60, message="O nome deve ter entre {min} e {max} caracteres")	
	private String nome;
	
	@ManyToOne(optional = false)
	@NotNull(message="Cidade obrigat�ria")
	private Cidade cidade;
	
	@Column(length = 80)
	@Length(max=80)
	private String endereco;
	
	@Column(length = 20)
	@Length(max=20)
	private String numero;
	
	@Column(length = 80)
	@Length(max=80)
	private String complemento;
	
	@Column(length = 50)
	@Length(max=50)
	private String bairro;
	
	@Column(length = 10)
	@Length(max=10)
	private String cep;
	
	@Column(length = 80)
	@Email(message="Informe um e-mail v�lido")
	@Length(max=80)
	private String email;
	
	@Column(length = 20)
	@Length(max=20)
	private String telefone;
	
	
	private static final long serialVersionUID = 1L;

	
	
	
	public Pessoa(Integer id, String nome, Cidade cidade, String endereco,
			String numero, String complemento, String bairro, String cep,
			String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.email = email;
		this.telefone = telefone;
	}
	public Pessoa() {
		super();
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
	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
   
}
