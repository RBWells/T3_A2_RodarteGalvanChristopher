public class Pelicula {
    private String Titulo_de_Pelicula;
    private String generoPelicula;
    public Pelicula(String titulo_de_Pelicula, String generoPelicula) {
        Titulo_de_Pelicula = titulo_de_Pelicula;
        this.generoPelicula = generoPelicula;
    }
    public String getTitulo_de_Pelicula() {
        return Titulo_de_Pelicula;
    }
    public void setTitulo_de_Pelicula(String titulo_de_Pelicula) {
        Titulo_de_Pelicula = titulo_de_Pelicula;
    }
    public String getGeneroPelicula() {
        return generoPelicula;
    }
    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }
    
    @Override
    public String toString() {
        return "\nTitulo de la pelicula: "+getTitulo_de_Pelicula()+"\n"+
                "Genero de la pelicula: "+getGeneroPelicula()+"\n";
    }

}
