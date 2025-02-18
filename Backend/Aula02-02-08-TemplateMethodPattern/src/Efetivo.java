public class Efetivo extends Funcionario {

   private double salarioBase;
   private double descontos;
   private double bonificacoes;

    public Efetivo(String nome, String sobrenome, String numConta, double salarioBase, double descontos, double bonificacoes) {
        super(nome, sobrenome, numConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;
    }

    @Override
    public double calcularSaldo() {
        return salarioBase + bonificacoes - descontos;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerado um recibo papel - valor: " + quantia);
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Depositado = " + quantia + "na conta de " + super.getNome());
    }
}
