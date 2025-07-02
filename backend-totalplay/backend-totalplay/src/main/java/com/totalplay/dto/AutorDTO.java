package dto;

public class AutorDTO {
    private Long id;
    private String nombreCompleto;

    public AutorDTO() {}

    public AutorDTO(Long id, String nombreCompleto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "AutorDTO{" +
                "id=" + id +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                '}';
    }
}
