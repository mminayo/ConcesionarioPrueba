package y.service.mapper;

import org.mapstruct.*;
import y.domain.Venta;
import y.service.dto.VentaDTO;

/**
 * Mapper for the entity {@link Venta} and its DTO {@link VentaDTO}.
 */
@Mapper(componentModel = "spring", uses = { EmpleadoMapper.class, ClienteMapper.class })
public interface VentaMapper extends EntityMapper<VentaDTO, Venta> {
    @Mapping(target = "empleado", source = "empleado", qualifiedByName = "nombre")
    @Mapping(target = "cliente", source = "cliente", qualifiedByName = "name")
    VentaDTO toDto(Venta s);

    @Named("fecha")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "fecha", source = "fecha")
    VentaDTO toDtoFecha(Venta venta);
}
