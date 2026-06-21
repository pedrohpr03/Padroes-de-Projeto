package padroescomportamentais.templatemethod;

public abstract class PreparoLanche {

    public final String preparar() {
        return montarBase() + " > " + adicionarRecheio() + " > " + finalizar();
    }

    protected String montarBase() {
        return "Pão";
    }

    protected abstract String adicionarRecheio();

    protected String finalizar() {
        return "Embalar";
    }
}
