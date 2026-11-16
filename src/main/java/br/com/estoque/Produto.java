
package br.com.estoque;

public class Produto {

    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }

        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int consultarSaldo() {
        return quantidade;
    }

    public void adicionar(int unidades) {
        if (unidades <= 0) {
            throw new IllegalArgumentException("Entrada inválida");
        }

        quantidade += unidades;
    }

    public boolean retirar(int unidades) {
        if (unidades <= 0) {
            return false;
        }

        if (unidades > quantidade) {
            return false;
        }

        quantidade -= unidades;
        return true;
    }
}
