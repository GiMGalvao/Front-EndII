import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Funcionario func1, func2;
    Afiliado afi1, afi2, afi3;

    @BeforeEach
    public void doBefore() {
        func1 = new Funcionario("Pedro", 2);
        func1.vender(2);

        func2 = new Funcionario("Maria",1);
        func2.vender(1);

        afi1 = new Afiliado("Ramon", 5);
        afi1.vender(4);

        afi2 = new Afiliado("Paulo", 5);
        afi2.vender(1);

        afi3 = new Afiliado("José", 4);

        func1.addAfiliado(afi1);
    }

    @Test
    public void mostrarVendedores() {
        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());
        System.out.println(afi3.mostrarCategoria());
    }

}