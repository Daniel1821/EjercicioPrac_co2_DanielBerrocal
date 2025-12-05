
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
