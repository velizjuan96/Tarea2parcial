package sample.controladores;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import sample.modelos.Persona;
import javafx.scene.control.Label;

public class Controller {

    public Label Apellido;
    public Label Nombre;
    public Label Edad;
    public Label txterror;
    public TextField txtBuscar;


    private Persona primerNombre(ActionEvent actionEvent) {

        return Persona.primerNombre(txtBuscar.getText());
    }


    public void getPersona(ActionEvent actionEvent) {
        Persona Buscar = this.primerNombre(actionEvent);

        if (Buscar!=null){
            Nombre.setText(Buscar.nombre);
            Apellido.setText(Buscar.apellido);
            Edad.setText(String.valueOf(Buscar.edad));
        }
        else {
            txterror.setText("NO HAY NINGUN NOMBRE CON ESE RESULTADO");
     }

    }

}
