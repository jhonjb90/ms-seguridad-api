package pe.dhexsoft.ms_seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.dhexsoft.ms_seguridad.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
