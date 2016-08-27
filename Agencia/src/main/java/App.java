import datos.Repositorio;
import javafx.application.Application;
import javafx.stage.Stage;
import presentador.MenuPrincipalPresentador;

/**
 * Created by ASUS on 25/08/2016.
 */
public class App extends Application{
    Stage pantalla;

    public static void main(String[] args) {
        System.out.println("TP1 Ingeniería del soft");
        System.out.println("Inicializando repositorio de datos");
        Repositorio.getInstance().cargarDatos();
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        MenuPrincipalPresentador menuPrincipalPresentador = new MenuPrincipalPresentador(300,400);
    }
}
