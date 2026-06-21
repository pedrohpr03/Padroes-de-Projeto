package padroescomportamentais.templatemethod;

public class PreparoXBurguer extends PreparoLanche {

    @Override
    protected String adicionarRecheio() {
        return "Hambúrguer + queijo";
    }
}
