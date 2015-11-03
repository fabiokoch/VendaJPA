package beans;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: TipoPasse
 *
 */
@Entity

public class TipoPasse implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "TipoPasseIdGen")
	@SequenceGenerator(name = "TipoPasseIdGen", sequenceName = "TipoPasseIdGen", allocationSize = 1)
	private Integer id_tipo_passe;
	@NotNull(message="A descricao deve ser informada")
	private String descricao;
	private static final long serialVersionUID = 1L;

	public TipoPasse() {
		super();
	}   
	public Integer getId_tipo_passe() {
		return this.id_tipo_passe;
	}

	public void setId_tipo_passe(Integer id_tipo_passe) {
		this.id_tipo_passe = id_tipo_passe;
	}   
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
   
}
