package blackboard.repositorio;

import java.util.HashMap;

/**
 *
 * @author Neudinho Paulino
 */
public class Repositorio {

    private Armazenamento armazenamento;

    public Repositorio() {
        armazenamento = new Armazenamento();
    }

    public void adicionar(String nome, Float preco) {
        if (!armazenamento.produtos.containsKey(nome)) {
            armazenamento.produtos.put(nome, preco);
        }
    }

    public void remover(String nome) {
        if (armazenamento.produtos.containsKey(nome)) {
            armazenamento.produtos.remove(nome);
        }
    }

    public void alterar(String nome, Float preco) {
        if (armazenamento.produtos.containsKey(nome)) {
            armazenamento.produtos.put(nome, preco);
        }
    }

    public HashMap<String, Float> listar() {
        return armazenamento.getProdutos();
    }
}
