
package Banco;

import java.util.ArrayList;
import modelo.Cliente;


public class BancoCliente {
    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static int ID = 1;
    
    static {

        clientes.add(new Cliente(
                ID++,
                "",
                "",
                ""
            )
        );
        
        clientes.add(new Cliente(
                ID++,
                "",
                "",
                ""
            )
        );
        clientes.add(new Cliente(
                ID++,
                "",
                "",
                ""
            )
        );       
    }
}
