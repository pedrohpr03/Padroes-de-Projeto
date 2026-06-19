package padroescriacao.factorymethod;

public class ItemCardapioFactory {

    public static ItemCardapio criar(String tipo, String nome, double preco) {
        switch (tipo.toLowerCase()) {
            case "lanche":
                return new Lanche(nome, preco);
            case "bebida":
                return new Bebida(nome, preco);
            case "sobremesa":
                return new Sobremesa(nome, preco);
            default:
                throw new IllegalArgumentException("Item de cardápio inexistente");
        }
    }
}
