package br.senai.sc;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.domain.Categoria;
import br.senai.sc.domain.Cidade;
import br.senai.sc.domain.Estado;
import br.senai.sc.domain.Produto;
import br.senai.sc.repositories.CategoriaRepository;
import br.senai.sc.repositories.CidadeRepository;
import br.senai.sc.repositories.EstadoRepository;
import br.senai.sc.repositories.ProdutoRepository;


@SpringBootApplication
public class ProjetoPedidoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPedidoApplication.class, args);
	}
	@Autowired
	public CategoriaRepository caterepo;
	
	@Autowired
	public ProdutoRepository prodrepo;
	
	@Autowired
	public EstadoRepository estarepo;
	
	@Autowired
	public CidadeRepository cityrepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria a = new Categoria(null, "Informatica");
		Categoria b = new Categoria(null, "Informatica");
		
		Produto c = new Produto(null, "computador", 2000.00);
		
		Estado d = new Estado(null, "são José");
		
		Cidade e = new Cidade(null, "Santa Cataria"); 
		
		caterepo.save(a);
		caterepo.save(b);
		prodrepo.save(c);
		estarepo.save(d);
		cityrepo.save(e);
	}

}
