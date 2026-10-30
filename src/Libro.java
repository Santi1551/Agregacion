public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;


    public Libro(){
        disponible = true;
    }

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
    }
    
    public Libro(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("El título no puede estar vacío.");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public void mostrarInfo() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Disponible: " + (this.disponible ? "Sí" : "No"));
    }


    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + this.titulo + "' ha sido prestado.");
            return true;
        } else {
            System.out.println("El libro '" + this.titulo + "' no está disponible para préstamo.");
            return false;
        }
    }   

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro '" + this.titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + this.titulo + "' ya estaba disponible.");
        }
    }
}