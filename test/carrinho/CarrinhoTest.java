package carrinho;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;

class CarrinhoTest {
	Carrinho carrinho;
	Produto produto;
	
	@BeforeEach
	public void inicializa() {
		carrinho = new Carrinho();
		produto = new Produto("Pamonha", 50);
	}
	
	@DisplayName("Testing addItem() and getQtdeItems()")
	@Test
	void testeQtdDeItens() {
		carrinho.addItem(produto);
		carrinho.addItem(produto);
		carrinho.addItem(produto);
		Assertions.assertEquals(carrinho.getQtdeItems(), 3);
	}
	
	@DisplayName("Testing addItem() and getQtdeItems()")
	@Test
	void testeEsvazia() {
		carrinho.addItem(produto);
		carrinho.addItem(produto);
		carrinho.addItem(produto);
		carrinho.esvazia();
		Assertions.assertEquals(carrinho.getQtdeItems(), 0);
	}
	
	
	@DisplayName("Testing getValorTotal()")
	@Test
	void testeValorTotal() {
		carrinho.addItem(produto);
		carrinho.addItem(produto);
		carrinho.addItem(produto);
		Assertions.assertEquals(carrinho.getValorTotal(), 150);
	}
	
	
	@DisplayName("Testing removeItem()")
	@Test
	void testeRemoveItem() throws ProdutoNaoEncontradoException {
		carrinho.addItem(produto);
		carrinho.removeItem(produto);
		Assertions.assertEquals(carrinho.getQtdeItems(), 0);
	}

}
