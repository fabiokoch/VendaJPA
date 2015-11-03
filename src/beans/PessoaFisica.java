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

/**
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity
public class PessoaFisica extends Pessoa implements Serializable {

	@Column(length = 15, nullable = false, unique = true )
	@NotEmpty(message="O CPF deve ser informado")
	@Length(max=15, message="O CPF deve ter no m�ximo {max} caracteres")
	private String cpf;
	
	@Column(length = 15, nullable = false, unique = true )
	@NotEmpty(message="O RG deve ser informado")
	@Length(max=15, message="O RG deve ter no m�ximo {max} caracteres")	
	private String rg;
	
	@Temporal(TemporalType.DATE)
	@NotNull(message="A data de nascimento � obrigat�ria")
	@Past(message="A data de nascimento deve ser no passado")
	private Date dataNascimento;
	
	private static final long serialVersionUID = 1L;

	public PessoaFisica() {
		super();
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}   
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
   
}
