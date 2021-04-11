package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Funko Pop! Avengers Endgame: I Am Iron Man");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/61v3YDAM2kL._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Funko-Avengers-Endgame-Glow-Dark/dp/B083YS9R43/ref=sr_1_2?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=22N5UNNQNFW7M&dchild=1&keywords=funko+pop&qid=1618096272&s=toys&sprefix=fun%2Ctoys%2C369&sr=1-2");
		pedido.setDescricao("uma descrição qualquer para esse pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home"; 
	}
}
