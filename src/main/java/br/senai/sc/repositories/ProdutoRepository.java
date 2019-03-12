package br.senai.sc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
