import javafx.scene.control.ScrollPane;

public class Mushroom extends Food{


    public Mushroom(String name, String imageURL, String nutritiveValue, String benefits, String drawbacks) {
        super(name, imageURL, nutritiveValue, benefits, drawbacks);
    }

    @Override
    public ScrollPane showInformation() {
        return null;
    }
}
