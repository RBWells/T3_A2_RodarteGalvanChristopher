public interface RentaPeliculas {

    void insertar(Pelicula pelicula);
    void eliminarDatos();
    void mostrarCima();
    void elementosExistentes();
    void vaciar();

    // Metodo Auxiliar
    boolean verificarPilaLlena();
}
