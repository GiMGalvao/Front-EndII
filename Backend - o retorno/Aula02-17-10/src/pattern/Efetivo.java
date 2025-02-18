package pattern;

public class Efetivo extends Funcionario{

    private double salarioBase;
    private double descontos;
    private double bonificacao;

    public Efetivo(String nome, String sobrenome, String numeroConta, String localDeposito, double salarioBase, double descontos, double bonificacao) {
        super(nome, sobrenome, numeroConta, localDeposito);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase+bonificacao-descontos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }


}
