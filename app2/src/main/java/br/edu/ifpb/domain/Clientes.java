package br.edu.ifpb.domain;

import br.edu.ifpb.domain.Cliente;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 08/05/2019, 11:29:06
 */
public interface Clientes {

    void novo(Cliente cliente);

    List<Cliente> todos();

}
