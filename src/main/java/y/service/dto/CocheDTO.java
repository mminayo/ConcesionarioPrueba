package y.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link y.domain.Coche} entity.
 */
public class CocheDTO implements Serializable {

    private Long id;

    private String marca;

    private String modelo;

    private String color;

    private Float precio;

    private Integer numeroSerie;

    private String transpuesto;

    private VentaDTO venta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getTranspuesto() {
        return transpuesto;
    }

    public void setTranspuesto(String transpuesto) {
        this.transpuesto = transpuesto;
    }

    public VentaDTO getVenta() {
        return venta;
    }

    public void setVenta(VentaDTO venta) {
        this.venta = venta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CocheDTO)) {
            return false;
        }

        CocheDTO cocheDTO = (CocheDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, cocheDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CocheDTO{" +
            "id=" + getId() +
            ", marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", color='" + getColor() + "'" +
            ", precio=" + getPrecio() +
            ", numeroSerie=" + getNumeroSerie() +
            ", transpuesto='" + getTranspuesto() + "'" +
            ", venta=" + getVenta() +
            "}";
    }
}
