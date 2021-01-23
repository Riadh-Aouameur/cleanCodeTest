package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.util.LinkedList;
import java.util.List;

public class Controller {

    Model model;
    public Label lab;


    public void onClick(ActionEvent actionEvent) {
        model.setCount(model.getCount()+1);

        model.addListener(m -> {
            System.out.println(m.getCount());
            lab.setText(""+m.getCount());

        } );

    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Model getModel() {
        return model;
    }
}
