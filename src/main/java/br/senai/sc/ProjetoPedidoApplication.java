package br.senai.sc;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.domain.Categoria;
import br.senai.sc.domain.Produto;
import br.senai.sc.repositories.CategoriaRepository;
import br.senai.sc.repositories.ProdutoRepository;


@SpringBootApplication
public class ProjetoPedidoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPedidoApplication.class, args);
	}
	@Autowired
	public CategoriaRepository repo;
	
	@Autowired
	public ProdutoRepository repos;
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria a = new Categoria(null, "Informatica");
		Categoria b = new Categoria(null, "Informatica");
		
		Produto c = new Produto(null, "computador", 2000.00);
		
		repo.save(a);
		repo.save(b);
		repos.save(c);
	}

}
