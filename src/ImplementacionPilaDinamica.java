import java.util.Stack;

public class ImplementacionPilaDinamica implements RentaPeliculas{
    private Stack<Pelicula> pilaDinamica=new Stack<>();

    public ImplementacionPilaDinamica(){
        pilaDinamica=new Stack<>();
    }

    @Override
    public void insertar(Pelicula pelicula) {
        pilaDinamica.push(pelicula);
        System.out.println("Pelicula agregada correctamente...");
    }

    @Override
    public void eliminarDatos() {
        if (pilaDinamica.empty()) {
            System.out.println("No hay peliculas disponibles para rentar....");
        }
        Pelicula pelicula = pilaDinamica.pop();
        System.out.println("La pelicula rentada fue:"+pelicula);
    }

    @Override
    public void mostrarCima() {
        if (pilaDinamica.empty()) {
            System.out.println("La bdd esta vacia...");
        } else {
            System.out.println("La pelicula en la cima es: "+pilaDinamica.peek());
        }
    }

    @Override
    public void elementosExistentes() {
        System.out.println("La cantidad disponible para rentar es: " + pilaDinamica.size());
    }

    @Override
    public void vaciar() {
        pilaDinamica.clear();
        System.out.println("La bdd se limpio...");
    }
    @Override
    public boolean verificarPilaLlena() {
        return false;
    }
}
