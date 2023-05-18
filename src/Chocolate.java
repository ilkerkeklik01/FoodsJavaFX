import javafx.scene.control.ScrollPane;

public class Chocolate extends Food{



    public Chocolate(String name, String imageURL, String nutritiveValue, String benefits, String drawbacks) {
        super(name, imageURL, nutritiveValue, benefits, drawbacks);
    }

    @Override
    public ScrollPane showInformation() {
        return null;
    }


}
