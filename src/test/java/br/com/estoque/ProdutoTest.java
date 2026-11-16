
package br.com.estoque;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void testarEntrada() {
        Produto p = new Produto("Camiseta", 10);
        p.adicionar(5);
        assertEquals(15, p.consultarSaldo());
    }

    @Test
    void testarSaida() {
        Produto p = new Produto("Camiseta", 10);
        assertTrue(p.retirar(4));
        assertEquals(6, p.consultarSaldo());
    }

    @Test
    void testarSaldoInsuficiente() {
        Produto p = new Produto("Camiseta", 10);
        assertFalse(p.retirar(20));
        assertEquals(10, p.consultarSaldo());
    }
}
