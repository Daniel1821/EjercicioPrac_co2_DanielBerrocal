
package config;

import domain.Rol;
import domain.Usuario;
import repository.UsuarioRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @PostConstruct
    public void init() {

        Rol admin = new Rol("ADMIN");
        Rol profesor = new Rol("PROFESOR");
        Rol estudiante = new Rol("ESTUDIANTE");

        // Guardar usuarios
        usuarioRepository.save(
                new Usuario("Admin", "admin@admin.com", encoder.encode("1234"), admin, true)
        );
    }
}
