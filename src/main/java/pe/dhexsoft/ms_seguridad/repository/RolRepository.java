package pe.dhexsoft.ms_seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.dhexsoft.ms_seguridad.entity.Rol;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long> {

    Optional<Rol> findByNombreRol(String rol);
}
