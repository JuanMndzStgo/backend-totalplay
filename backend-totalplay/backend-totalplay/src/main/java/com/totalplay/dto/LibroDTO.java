package dto;

public class LibroDTO {
    private Long id;
    private String titulo;
    private String descripcion;
    private AutorDTO autor;

    public LibroDTO() {}

    public LibroDTO(Long id, String titulo, String descripcion, AutorDTO autor) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public AutorDTO getAutor() {
        return autor;
    }
    public void setAutor(AutorDTO autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "LibroDTO{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", autor=" + autor +
                '}';
    }
}
