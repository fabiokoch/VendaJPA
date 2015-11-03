package beans;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Usuarios
 *
 */
@Entity
public class Usuario implements Serializable {
	@Id
	@SequenceGenerator(name = "UsuarioId", allocationSize = 1, sequenceName = "UsuarioId")
	@GeneratedValue(generator = "UsuarioId", strategy = GenerationType.SEQUENCE)
	private Integer id;
	@NotEmpty(message = "O nome deve ser informado!")
	@Length(max = 60, min = 3, message = "O nome deve ter entre 3 e 60 caracteres!")
	@Column(length = 60, nullable = false)
	private String nome;
	@NotEmpty(message = "O login deve ser informado!")
	@Length(max = 20, min = 5, message = "O nome deve ter entre 5 e 20 caracteres!")
	@Column(length = 20, nullable = false)
	private String login;
	@NotEmpty(message = "A senha deve ser informada!")
	@Length(max = 40, min = 4, message = "O nome deve ter entre 4 e 40 caracteres!")
	@Column(length = 40, nullable = false)
	private String senha;

	public Usuario() {
	}
	

	public Usuario(Integer id, String nome, String login, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	

}
