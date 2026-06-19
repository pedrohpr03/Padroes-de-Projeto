package padroescriacao.factorymethod;

public class Sobremesa implements ItemCardapio {

    private final String nome;
    private final double preco;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getCategoria() {
        return "Sobremesa";
    }
}
