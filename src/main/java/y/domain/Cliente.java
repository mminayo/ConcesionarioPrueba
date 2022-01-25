package y.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Cliente.
 */
@Entity
@Table(name = "cliente")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 9)
    @Column(name = "dni", length = 9, nullable = false, unique = true)
    private String dni;

    @Column(name = "name")
    private String name;

    @Column(name = "numero_compras")
    private Integer numeroCompras;

    @Column(name = "tier")
    private String tier;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Cliente id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return this.dni;
    }

    public Cliente dni(String dni) {
        this.setDni(dni);
        return this;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return this.name;
    }

    public Cliente name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumeroCompras() {
        return this.numeroCompras;
    }

    public Cliente numeroCompras(Integer numeroCompras) {
        this.setNumeroCompras(numeroCompras);
        return this;
    }

    public void setNumeroCompras(Integer numeroCompras) {
        this.numeroCompras = numeroCompras;
    }

    public String getTier() {
        return this.tier;
    }

    public Cliente tier(String tier) {
        this.setTier(tier);
        return this;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cliente)) {
            return false;
        }
        return id != null && id.equals(((Cliente) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Cliente{" +
            "id=" + getId() +
            ", dni='" + getDni() + "'" +
            ", name='" + getName() + "'" +
            ", numeroCompras=" + getNumeroCompras() +
            ", tier='" + getTier() + "'" +
            "}";
    }
}
