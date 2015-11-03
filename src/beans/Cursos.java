package beans;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Cursos
 *
 */
@Entity

public class Cursos implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "CursoIdGen")
	@SequenceGenerator(name = "CursoIdGen", sequenceName = "CursoIdGen", allocationSize = 1)
	private Integer id_cursos;
	@Column(length = 60, nullable = false)
	private String descricao;
	@Column(length = 60)
	private String nivel;
	private static final long serialVersionUID = 1L;

	public Cursos() {
		super();
	}   
	public Integer getId_cursos() {
		return this.id_cursos;
	}

	public void setId_cursos(Integer id_cursos) {
		this.id_cursos = id_cursos;
	}   
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}   
	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
   
}
