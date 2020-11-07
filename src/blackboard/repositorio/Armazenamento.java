package blackboard.repositorio;

import java.util.HashMap;

/**
 *
 * @author Neudinho Paulino
 */
public class Armazenamento {

    public HashMap<String, Float> produtos;

    public Armazenamento() {
        produtos = new HashMap<String, Float>();
    }

    public HashMap<String, Float> getProdutos() {
        return produtos;
    }

    public void setProdutos(HashMap<String, Float> produtos) {
        this.produtos = produtos;
    }

}
