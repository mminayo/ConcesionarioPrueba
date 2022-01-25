package y.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link y.domain.Cliente} entity.
 */
public class ClienteDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 9)
    private String dni;

    private String name;

    private Integer numeroCompras;

    private String tier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumeroCompras() {
        return numeroCompras;
    }

    public void setNumeroCompras(Integer numeroCompras) {
        this.numeroCompras = numeroCompras;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClienteDTO)) {
            return false;
        }

        ClienteDTO clienteDTO = (ClienteDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, clienteDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ClienteDTO{" +
            "id=" + getId() +
            ", dni='" + getDni() + "'" +
            ", name='" + getName() + "'" +
            ", numeroCompras=" + getNumeroCompras() +
            ", tier='" + getTier() + "'" +
            "}";
    }
}
