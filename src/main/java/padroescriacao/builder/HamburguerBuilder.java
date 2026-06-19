package padroescriacao.builder;


public class HamburguerBuilder {

    private final Hamburguer hamburguer;

    public HamburguerBuilder() {
        this.hamburguer = new Hamburguer();
    }

    public Hamburguer build() {
        if (hamburguer.getPao().equals("")) {
            throw new IllegalArgumentException("Pão inválido");
        }
        if (hamburguer.getQuantidadeCarne() == 0) {
            throw new IllegalArgumentException("Hambúrguer precisa de ao menos uma carne");
        }
        return hamburguer;
    }

    public HamburguerBuilder comPao(String pao) {
        hamburguer.setPao(pao);
        return this;
    }

    public HamburguerBuilder comCarne(String tipoCarne, int quantidade) {
        hamburguer.setTipoCarne(tipoCarne);
        hamburguer.setQuantidadeCarne(quantidade);
        return this;
    }

    public HamburguerBuilder comQueijo() {
        hamburguer.setQueijo(true);
        return this;
    }

    public HamburguerBuilder comBacon() {
        hamburguer.setBacon(true);
        return this;
    }

    public HamburguerBuilder comSalada() {
        hamburguer.setSalada(true);
        return this;
    }

    public HamburguerBuilder comMolho(String molho) {
        hamburguer.setMolho(molho);
        return this;
    }
}
