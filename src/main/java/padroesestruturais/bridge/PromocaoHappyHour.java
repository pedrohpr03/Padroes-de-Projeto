package padroesestruturais.bridge;

public class PromocaoHappyHour extends Promocao {

    public PromocaoHappyHour(Desconto desconto) {
        super(desconto);
    }

    @Override
    public String getNome() {
        return "Happy Hour";
    }
}
