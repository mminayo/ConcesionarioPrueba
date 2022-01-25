package y.service.mapper;

import org.mapstruct.*;
import y.domain.Coche;
import y.service.dto.CocheDTO;

/**
 * Mapper for the entity {@link Coche} and its DTO {@link CocheDTO}.
 */
@Mapper(componentModel = "spring", uses = { VentaMapper.class })
public interface CocheMapper extends EntityMapper<CocheDTO, Coche> {
    @Mapping(target = "venta", source = "venta", qualifiedByName = "fecha")
    CocheDTO toDto(Coche s);
}
