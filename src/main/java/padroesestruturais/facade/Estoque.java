package padroesestruturais.facade;

public class Estoque {

    public boolean possuiIngredientes(String lanche) {
        return lanche != null && !lanche.isEmpty();
    }
}
