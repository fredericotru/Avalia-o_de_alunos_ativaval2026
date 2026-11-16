
package br.com.estoque.bdd;

import br.com.estoque.Produto;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueSteps {

    private Produto produto;

    @Dado("que tenho {int} unidades no estoque")
    public void criarEstoque(int quantidade) {
        produto = new Produto("Camiseta", quantidade);
    }

    @Quando("adiciono {int} unidades")
    public void adicionar(int quantidade) {
        produto.adicionar(quantidade);
    }

    @Quando("retiro {int} unidades")
    public void retirar(int quantidade) {
        produto.retirar(quantidade);
    }

    @Entao("o estoque deve ter {int} unidades")
    public void verificarEstoque(int quantidade) {
        assertEquals(quantidade, produto.consultarSaldo());
    }
}
