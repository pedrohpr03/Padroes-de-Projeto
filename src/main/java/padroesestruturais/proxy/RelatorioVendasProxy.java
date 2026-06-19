package padroesestruturais.proxy;

public class RelatorioVendasProxy implements RelatorioVendas {

    private final Funcionario funcionario;
    private RelatorioVendasReal relatorioReal;

    public RelatorioVendasProxy(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public double consultarTotalVendas() {
        if (!temPermissao()) {
            throw new SecurityException("Acesso negado ao relatório de vendas");
        }
        if (relatorioReal == null) {
            relatorioReal = new RelatorioVendasReal();
        }
        return relatorioReal.consultarTotalVendas();
    }

    private boolean temPermissao() {
        String cargo = funcionario.getCargo().toLowerCase();
        return cargo.equals("gerente") || cargo.equals("dono");
    }
}
