package Modelo;

import java.util.Scanner;

public class Principal {

    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido/a a mi Primer Programa
                    1) Registrar nueva película
                    2) Registrar una nueva serie
                    
                    9) Salir                   
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la Pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año del lanzamiento");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);

                    peliculaUsuario.muestraFichaTecnica();

                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la Serie");
                    String Serie = teclado.nextLine();
                    System.out.println("Ingrese la cantidad de temporadas");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el número de episodios por temporadas");
                    int episodiosPorTemporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el tiempo de duracion en minutos por episodio");
                    int duracionEnMinutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    Serie serieUsuario = new Serie();
                    serieUsuario.setSerie(Serie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporadas(episodiosPorTemporadas);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);

                    serieUsuario.muestraFichaTecnica();

                                break;


                case 9:
                    System.out.println("Saliendo del Programa");

                    break;
                default:
                    System.out.println("Opción no valida");
                    break;

            }

        }
    }

}
