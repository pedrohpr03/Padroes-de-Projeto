package padroesestruturais.bridge;

public class PromocaoComboDoDia extends Promocao {

    public PromocaoComboDoDia(Desconto desconto) {
        super(desconto);
    }

    @Override
    public String getNome() {
        return "Combo do Dia";
    }
}
