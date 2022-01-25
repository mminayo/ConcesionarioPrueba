package y.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import y.domain.Cliente;

/**
 * Spring Data SQL repository for the Cliente entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
