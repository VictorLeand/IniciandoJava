import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Empezamos hpta :v");
        //System.out.println("Película Golpe Bajo");

        //Declaración de variables
        int fechaDeLanzamiento = 2005;
        double evaluacion = 4.8;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Golpe Bajo";
        String sinopsis = """
                Gonorrea de pelicula :v
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Película: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Resultado de la Evaluación: " + evaluacion);
        System.out.println("Se Incluye en Nuestro Plan Básico: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la Evaluación de Golpe Bajo: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023){
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la calificación que le das a la película Golpe Bajo: ");
            double notaGolpeBajo = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaGolpeBajo;
        }
        System.out.println("La media calculada por el usuario" +
                " de la película Golpe Bajo es: " + mediaEvaluacionUsuario / 3);

    }
}