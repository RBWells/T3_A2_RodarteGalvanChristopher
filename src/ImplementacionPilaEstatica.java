
public class ImplementacionPilaEstatica implements RentaPeliculas {

    private Pelicula[] pila;
    private int cima;
    private int tam;

    public ImplementacionPilaEstatica() {
        tam = 5;
        pila = new Pelicula[tam];
        cima = -1;
    }

    @Override
    public void insertar(Pelicula pelicula) {
        if (verificarPilaLlena()) {
            System.out.println("La bdd esta llena....");
        }
        cima++;
        pila[cima] = pelicula;
        System.out.println("Pelicula agregada...");
    }

    @Override
    public void eliminarDatos() {
        if (cima == -1) {
            System.out.println("No hay peliculas disponibles para rentar...");
        }
        Pelicula pelicula = pila[cima];
        pila[cima] = null;
        cima--;
        System.out.println("La pelicula que rentaste fue: "+pelicula);
    }

    @Override
    public void mostrarCima() {
        if (cima == -1) {
            System.out.println("La bdd esta vacia...");
        } else {
            System.out.println("La pelicula que esta en la sima es: "+pila[cima]);
        }
    }

    @Override
    public void elementosExistentes() {
        System.out.println(
            "Peliculas disponibles para rentar: " + (cima + 1));
    }

    @Override
    public void vaciar() {
        cima = -1;
        System.out.println("bdd limpiada...");
    }

    @Override
    public boolean verificarPilaLlena() {
        return cima == tam - 1;
    }
}
