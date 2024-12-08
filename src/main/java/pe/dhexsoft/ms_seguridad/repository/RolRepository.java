package pe.dhexsoft.ms_seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.dhexsoft.ms_seguridad.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
