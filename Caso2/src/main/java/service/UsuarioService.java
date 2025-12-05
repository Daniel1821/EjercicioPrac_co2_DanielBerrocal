
package service;

import domain.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listarTodos();
    Optional<Usuario> buscarPorId(Long id);
    Usuario crear(Usuario usuario);
    Usuario actualizar(Usuario usuario);
    void eliminar(Long id);
}
