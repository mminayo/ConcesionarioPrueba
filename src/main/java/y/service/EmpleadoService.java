package y.service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import y.domain.Empleado;
import y.repository.EmpleadoRepository;
import y.service.dto.EmpleadoDTO;
import y.service.mapper.EmpleadoMapper;

/**
 * Service Implementation for managing {@link Empleado}.
 */
@Service
@Transactional
public class EmpleadoService {

    private final Logger log = LoggerFactory.getLogger(EmpleadoService.class);

    private final EmpleadoRepository empleadoRepository;

    private final EmpleadoMapper empleadoMapper;

    public EmpleadoService(EmpleadoRepository empleadoRepository, EmpleadoMapper empleadoMapper) {
        this.empleadoRepository = empleadoRepository;
        this.empleadoMapper = empleadoMapper;
    }

    /**
     * Save a empleado.
     *
     * @param empleadoDTO the entity to save.
     * @return the persisted entity.
     */
    public EmpleadoDTO save(EmpleadoDTO empleadoDTO) {
        log.debug("Request to save Empleado : {}", empleadoDTO);
        Empleado empleado = empleadoMapper.toEntity(empleadoDTO);
        empleado = empleadoRepository.save(empleado);
        return empleadoMapper.toDto(empleado);
    }

    /**
     * Partially update a empleado.
     *
     * @param empleadoDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<EmpleadoDTO> partialUpdate(EmpleadoDTO empleadoDTO) {
        log.debug("Request to partially update Empleado : {}", empleadoDTO);

        return empleadoRepository
            .findById(empleadoDTO.getId())
            .map(existingEmpleado -> {
                empleadoMapper.partialUpdate(existingEmpleado, empleadoDTO);

                return existingEmpleado;
            })
            .map(empleadoRepository::save)
            .map(empleadoMapper::toDto);
    }

    /**
     * Get all the empleados.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<EmpleadoDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Empleados");
        return empleadoRepository.findAll(pageable).map(empleadoMapper::toDto);
    }

    /**
     * Get one empleado by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<EmpleadoDTO> findOne(Long id) {
        log.debug("Request to get Empleado : {}", id);
        return empleadoRepository.findById(id).map(empleadoMapper::toDto);
    }

    /**
     * Delete the empleado by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Empleado : {}", id);
        empleadoRepository.deleteById(id);
    }
}
