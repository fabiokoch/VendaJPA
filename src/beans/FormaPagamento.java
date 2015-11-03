package beans;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: FormaPagamento
 *
 */
@Entity

public class FormaPagamento implements Serializable {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "FormaPagtoIdGen")
	@SequenceGenerator(name = "FormaPagtoIdGen", sequenceName = "FormaPagtoIdGen", allocationSize = 1)
	private Integer id_forma_pagto;
	@NotNull
	private String descricao;
	private static final long serialVersionUID = 1L;

	public FormaPagamento() {
		super();
	}   
	public Integer getId_forma_pagto() {
		return this.id_forma_pagto;
	}

	public void setId_forma_pagto(Integer id_forma_pagto) {
		this.id_forma_pagto = id_forma_pagto;
	}   
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
   
}
