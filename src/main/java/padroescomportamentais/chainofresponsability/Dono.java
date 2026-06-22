package padroescomportamentais.chainofresponsability;

public class Dono extends Aprovador {

    @Override
    protected double getLimite() {
        return 50.0;
    }

    @Override
    protected String getCargo() {
        return "Dono";
    }
}
