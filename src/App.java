import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner nrg = new Scanner(System.in);

        RentaPeliculas estatica=new ImplementacionPilaEstatica();
        RentaPeliculas dinamica=new ImplementacionPilaDinamica();

        byte op;
        byte opFirst;
        do {
            System.out.println("=== MENU DE ITERACION ESTATICA/DINAICA ===");
            System.out.println("1. Implementacion estatica");
            System.out.println("2. Implementacion Dinamica");
            System.out.println("------------------------------------------------");
            System.out.println("0. Salir...");
            opFirst = nrg.nextByte();

            switch (opFirst) {
                case 1:
                    do {
                        System.out.println("=== ITERACCION ESTATICA: MENU DE PELICULAS ===");
                        System.out.println("1. Cargar BD de peliculas");
                        System.out.println("2. Rentar Peliculas");
                        System.out.println("3. Devolver pelicula");
                        System.out.println("4. Peliculas Disponibles para Renta");
                        System.out.println("5. Mostrar Cima de la bdd");
                        System.out.println("6. Limpiar bdd");
                        System.out.println("-------------------------------------------------");
                        System.out.println("0. Salir...");
                        op = nrg.nextByte();
                        nrg.nextLine();

                        switch (op) {
                            case 1:
                                estatica.insertar(new Pelicula("Max verstappen", "Formula 1"));
                                estatica.insertar(new Pelicula("Daniel Ricciardo", "Formula 1"));
                                estatica.insertar(new Pelicula("Carlos Sainz", "Formula 1"));
                                estatica.insertar(new Pelicula("Lewis Hamilton", "Formula 1"));
                                estatica.insertar(new Pelicula("Formula 1", "Accion y suspenso"));

                                System.out.println("BDD Cargada...");
                                break;
                            case 2:
                                estatica.eliminarDatos();
                                break;
                            case 3:
                                System.out.println("Ingresa el titulo de la pelicula a devolver: ");
                                String titulo=nrg.nextLine();

                                System.out.println("Que genero es?? :");
                                String genero=nrg.nextLine();

                                estatica.insertar(new Pelicula(titulo, genero));
                                break;
                            case 4:
                                estatica.elementosExistentes();
                                break;
                            case 5:
                                estatica.mostrarCima();
                                break;
                            case 6:
                                estatica.vaciar();
                                break;
                            case 0:
                                System.out.println("Saliste del programa....");
                                break;
                            default:
                                System.out.println("Esa opsion no esta disponible...");
                                break;
                        }

                    } while (op != 0);
                    break;
                case 2:
                    do {
                        System.out.println("=== MENU DE ITERACCION DINAMICA: MENU DE PELICULAS ===");
                        System.out.println("1. Cargar BD de peliculas");
                        System.out.println("2. Rentar Peliculas");
                        System.out.println("3. Devolver pelicula");
                        System.out.println("4. Peliculas Disponibles para Renta");
                        System.out.println("5. Mostrar Cima de la bdd");
                        System.out.println("6. Limpiar bdd");
                        System.out.println("---------------------------------------------------------");
                        System.out.println("0. Salir....");
                        op = nrg.nextByte();

                        switch (op) {
                            case 1:
                                System.out.println("Cuantos elementos quieres ingresar a la bdd...");
                                byte elementos=nrg.nextByte();
                                nrg.nextLine();

                                for (int i = 0; i < elementos; i++) {
                                    System.out.println("\nElemento "+(i+1)+".");
                                    System.out.println("Dime El nombre de la pelicula: ");
                                    String name=nrg.nextLine();
                                    System.out.println("Dime el genero de la pelicula: ");
                                    String gender=nrg.nextLine();
                                    
                                    dinamica.insertar(new Pelicula(name, gender));
                                }
                                System.out.println("Bdd llena...");
                                break;
                            case 2:
                                dinamica.eliminarDatos();
                                break;
                            case 3:
                                System.out.println("Que pelicula vas a devolver??: ");
                                String peliName=nrg.nextLine();
                                nrg.nextLine();
                                System.out.println("Dime el genero de la pelicula que vas a devolver: ");
                                String genderMovie=nrg.nextLine();

                                dinamica.insertar(new Pelicula(peliName, genderMovie));
                                break;
                            case 4:
                                dinamica.elementosExistentes();
                                break;
                            case 5:
                                dinamica.mostrarCima();
                                break;
                            case 6:
                            dinamica.vaciar();
                                break;
                            case 0:
                                System.out.println("Saliste del programa....");
                                break;
                            default:
                                System.out.println("Esa opsion no esta disponible...");
                                break;
                        }

                    } while (op != 0);
                    break;
                case 0:
                    System.out.println("Saliste del muno de Iteraccion...");
                    break;
                default:
                    System.out.println("No Hay esa opsion en el menu");
                    break;
            }

        } while (opFirst != 0);
        nrg.close();
    }
}
