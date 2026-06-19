package padroescriacao.abstractfactory;

public class FabricaComboInfantil implements FabricaCombo {

    @Override
    public Lanche criarLanche() {
        return new LancheInfantil();
    }

    @Override
    public Bebida criarBebida() {
        return new BebidaInfantil();
    }
}
