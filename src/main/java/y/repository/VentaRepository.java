package y.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import y.domain.Venta;

/**
 * Spring Data SQL repository for the Venta entity.
 */
@SuppressWarnings("unused")
@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {}
