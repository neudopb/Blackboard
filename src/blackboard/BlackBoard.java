package blackboard;

import blackboard.repositorio.Repositorio;
import java.util.Scanner;

/**
 *
 * @author Neudinho Paulino
 */
public class BlackBoard {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        Repositorio rep = new Repositorio();
        String nome;
        Float preco;
        int n;

        do {
            menu();
            n = tec.nextInt();

            switch (n) {
                case 1: //adicionar
                    System.out.print("NOME: ");
                    nome = tec.next();
                    System.out.print("PREÇO: ");
                    preco = tec.nextFloat();
                    rep.adicionar(nome.toUpperCase(), preco);
                    break;
                case 2: //remover
                    System.out.print("NOME: ");
                    nome = tec.next();
                    rep.remover(nome.toUpperCase());
                    break;
                case 3: //alterar
                    System.out.print("NOME: ");
                    nome = tec.next();
                    System.out.print("PREÇO: ");
                    preco = tec.nextFloat();
                    rep.alterar(nome.toUpperCase(), preco);
                    break;
                case 4: //listar
                    System.out.println(rep.listar());
                    break;
            }

        } while (n != 0);

    }

    public static void menu() {
        System.out.print("\n*******************"
                + "\n\tMENU"
                + "\n1. Inserir Produto"
                + "\n2. Remover Produto"
                + "\n3. Alterar Preço"
                + "\n4. Listar Produtos"
                + "\n0. Sair"
                + "\n*******************"
                + "\n: ");
    }

}
