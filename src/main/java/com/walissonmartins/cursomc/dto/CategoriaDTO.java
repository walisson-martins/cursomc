package com.walissonmartins.cursomc.dto;

import java.io.Serializable;

//Resolver esse problema do import, talvez tenha que finalizar a aual e pegar o código/ ou comparar

//import org.hibernate.validator.constraints.Length;
//import org.hibernate.validator.constraints.NotEmpty;

import com.walissonmartins.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

//	@NotEmpty(message = "Preenchimento obrigatório")
//	@Length(min = 5, max = 80, message = "Tamanho deve ser entre 5 e 80 caracteres")

//	@NotEmpty(message = "Preenchimento obrigatório")
//	@Length(min = 5, max = 80, message = "O tamanho deve ser entre 5 e 80 caracteres")
	private String nome;

	public CategoriaDTO() {

	}

	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
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
}
