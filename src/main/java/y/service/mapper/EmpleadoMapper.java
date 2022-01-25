package y.service.mapper;

import org.mapstruct.*;
import y.domain.Empleado;
import y.service.dto.EmpleadoDTO;

/**
 * Mapper for the entity {@link Empleado} and its DTO {@link EmpleadoDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface EmpleadoMapper extends EntityMapper<EmpleadoDTO, Empleado> {
    @Named("nombre")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    EmpleadoDTO toDtoNombre(Empleado empleado);
}
