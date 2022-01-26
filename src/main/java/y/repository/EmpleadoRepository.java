package y.repository;

import java.util.List;
import net.bytebuddy.build.Plugin.Engine.Listener;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import y.domain.Empleado;

/**
 * Spring Data SQL repository for the Empleado entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findAllByActivoTrue();
    List<Empleado> findAllByActivoFalse();
}
