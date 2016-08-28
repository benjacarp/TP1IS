package presentador;

import javafx.scene.control.Alert;

/**
 * Created by ASUS on 28/08/2016.
 */
public abstract class GenericPresentador {

    protected void alertaMaker(Alert.AlertType error, String advertencia, String headerText, String contentText) {
        Alert alert = new Alert(error);
        alert.setTitle(advertencia);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);

        alert.showAndWait();
    }
}
