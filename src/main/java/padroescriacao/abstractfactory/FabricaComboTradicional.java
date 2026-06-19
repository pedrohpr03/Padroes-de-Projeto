package padroescriacao.abstractfactory;

public class FabricaComboTradicional implements FabricaCombo {

    @Override
    public Lanche criarLanche() {
        return new LancheTradicional();
    }

    @Override
    public Bebida criarBebida() {
        return new BebidaTradicional();
    }
}
