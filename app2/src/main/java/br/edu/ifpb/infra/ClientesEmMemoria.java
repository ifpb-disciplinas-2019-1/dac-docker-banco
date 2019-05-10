package br.edu.ifpb.infra;

import br.edu.ifpb.domain.Clientes;
import br.edu.ifpb.domain.Cliente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 08/05/2019, 10:33:23
 */
public class ClientesEmMemoria implements Clientes {

    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void novo(Cliente cliente) {
        this.clientes.add(cliente);
    }

    @Override
    public List<Cliente> todos() {
        return Collections
            .unmodifiableList(
                this.clientes
            );
    }
}
