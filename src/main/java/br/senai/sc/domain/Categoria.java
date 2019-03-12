package br.senai.sc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Cria a tabela no banco.
public class Categoria {

	@Id // usado para identificar o Id da tabela, sera o atributo que estiver abaixo da anotação.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // diz que o Id é o gerador e "AUTO INCREMENT".
	private Integer id;
	private String nome;
	
	
	public Categoria () {
		
	}
	
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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


