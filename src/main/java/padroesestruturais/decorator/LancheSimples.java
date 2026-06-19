package padroesestruturais.decorator;


public class LancheSimples implements Lanche {

    @Override
    public double getPreco() {
        return 18.0;
    }

    @Override
    public String getDescricao() {
        return "Hambúrguer";
    }
}
