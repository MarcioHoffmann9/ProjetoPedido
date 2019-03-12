package br.senai.sc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
