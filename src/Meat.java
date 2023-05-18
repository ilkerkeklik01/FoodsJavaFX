import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Meat extends Food{




    public Meat(String name, String imageURL, String nutritiveValue, String benefits, String drawbacks) {
        super(name, imageURL, nutritiveValue, benefits, drawbacks);


    }

    @Override
    public ScrollPane showInformation() {


        return null;
    }
}
