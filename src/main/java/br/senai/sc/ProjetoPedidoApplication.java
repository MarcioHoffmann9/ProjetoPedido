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
	private CategoriaRepository categoriarepo;
	
	@Autowired
	private ProdutoRepository produtorepo;
	
	//@Autowired
	//private EstadoRepository estadorepo;
	
	//@Autowired
	//private CidadeRepository citaderepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		
		
		Produto p1 = new Produto(null, "computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		p1.getCategorias().add(cat1);
		cat1.getProdutos().add(p1);
		
		p2.getCategorias().add(cat1);
		cat1.getProdutos().add(p2);
		
		p2.getCategorias().add(cat2);
		cat2.getProdutos().add(p2);
		
		p3.getCategorias().add(cat1);
		cat1.getProdutos().add(p3);
		
		categoriarepo.save(cat1);
		categoriarepo.save(cat2);
		
		produtorepo.save(p1);
		produtorepo.save(p2);
		produtorepo.save(p3);
		
		
		
		
		
	
	
	}

}
