import java.util.ArrayList;

public class Funcionario extends Vendedor {

    private int anosAntiguidade;

    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Funcionario(String nome, int anosAntiguidade){
        super(nome);
        super.nome = nome;
        super.pontosPorVenda = 5;
        this.anosAntiguidade = anosAntiguidade;
    }

        /*agrega um afiliado ao funcionario, e por sua vez soma os pontos*/
    public void addAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome + " agora e afiliado de " + super.nome);
    }

    /*implementação do método abstrato*/
    /*por cada ano de antiguidade obtem 5 pontos, por cada afiliado obtem 5*/
    @Override
    public int calcularPontos() {


        return (this.afiliados.size()*10) + (this.anosAntiguidade*5) + (this.vendas * 5);
    }





}
