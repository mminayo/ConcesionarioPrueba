package y.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.testcontainers.shaded.com.google.common.util.concurrent.Service.Listener;
import y.domain.Coche;

/**
 * Spring Data SQL repository for the Coche entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {
    List<Coche> findByColorIgnoreCase(String color);
    List<Coche> findAllByColor(String color);
    List<Coche> findByColorStartingWith(String color);

    @Query("SELECT c FROM Coche c where c.modelo like :modelo%")
    Page<Coche> cochesPaginadosPorModelo(@Param("modelo") String modelo, Pageable pageable);
}
