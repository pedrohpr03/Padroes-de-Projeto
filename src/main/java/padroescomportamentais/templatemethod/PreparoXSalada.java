package padroescomportamentais.templatemethod;

public class PreparoXSalada extends PreparoLanche {

    @Override
    protected String adicionarRecheio() {
        return "Hambúrguer + alface + tomate";
    }
}
