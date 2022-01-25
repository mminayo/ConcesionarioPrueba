package y.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import y.domain.Empleado;

/**
 * Spring Data SQL repository for the Empleado entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {}
