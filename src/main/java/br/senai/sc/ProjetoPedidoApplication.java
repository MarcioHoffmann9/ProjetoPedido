package br.senai.sc;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.domain.Categoria;
import br.senai.sc.repositories.CategoriaRepository;


@SpringBootApplication
public class ProjetoPedidoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPedidoApplication.class, args);
	}
	@Autowired
	public CategoriaRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria a = new Categoria(null, "Informatica");
		Categoria b = new Categoria(null, "Informatica");
		
		repo.save(a);
		repo.save(b);
	}

}
