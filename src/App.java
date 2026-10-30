public class App {
    public static void main(String[] args) throws Exception {
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro3 = new Libro("1984", "George Orwell"); 
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Catálogo de la biblioteca:");
        biblioteca.mostrarCatalogo();

        biblioteca.buscarPorAutor("Gabriel García Márquez");
        System.out.println();
        biblioteca.buscarPorAutor("J.K. Rowling");

    }
}