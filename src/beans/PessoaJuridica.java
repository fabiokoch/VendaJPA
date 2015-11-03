package beans;

import beans.Pessoa;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;

/**
 * Entity implementation class for Entity: PessoaJuridica
 *
 */
@Entity
public class PessoaJuridica extends Pessoa implements Serializable {
	
	@Column(length = 20, nullable = false, unique = true)
	@NotEmpty(message="O CNPJ � obrigat�rio")
	@CNPJ(message="O CNPJ � inv�lido")
	@Length(max=20)
	private String cnpj;
	
	@Column(nullable = true, unique = true, length = 15)
	@NotEmpty(message="A IE � obrigat�ria")
	@Length(max=15)	
	private String ie;
	
	@Temporal(TemporalType.DATE)
	@NotNull(message="A data de constitui��o � obrigat�ria")
	@Past(message="A data de constitui��o deve ser no passado")
	private Date dataConstituicao;
	
	private static final long serialVersionUID = 1L;

	
	
	public PessoaJuridica(Integer id, String nome, Cidade cidade,
			String endereco, String numero, String complemento, String bairro,
			String cep, String email, String telefone, String cnpj, String ie,
			Date dataConstituicao) {
		super(id, nome, cidade, endereco, numero, complemento, bairro, cep,
				email, telefone);
		this.cnpj = cnpj;
		this.ie = ie;
		this.dataConstituicao = dataConstituicao;
	}
	
	public PessoaJuridica() {
		super();
	}   
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}   
	public String getIe() {
		return this.ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}   
	public Date getDataConstituicao() {
		return this.dataConstituicao;
	}

	public void setDataConstituicao(Date dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}
   
}
