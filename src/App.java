import Controller.Controlador;
import View.Vista;

/**
 * Clase principal de la aplicación.
 * Inicia el programa siguiendo el patrón de diseño Modelo-Vista-Controlador
 * (MVC).
 *
 * @author Nicolas Angarita Pérez
 * @version 1.1
 * @since 2025-04-01
 * @license UMD
 */
public class App {

    /**
     * Método principal (punto de entrada) de la aplicación.
     * Crea e inicializa los componentes del patrón MVC y ejecuta el controlador.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en esta
     *             aplicación).
     * @throws Exception Manejo de posibles excepciones en la ejecución del
     *                   programa.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Object-Oriented Programming - MVC Pattern Class");

        // Crear componentes MVC
        Vista objVista = new Vista();
        Controlador objControlador = new Controlador(objVista);
    }
}
