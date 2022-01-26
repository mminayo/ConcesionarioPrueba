package y.repository;

import java.util.List;
import java.util.Optional;
import org.ehcache.shadow.org.terracotta.offheapstore.paging.Page;
import org.springframework.data.jpa.repository.*;
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
}
