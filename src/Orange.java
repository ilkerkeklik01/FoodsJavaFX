import javafx.scene.control.ScrollPane;

public class Orange extends Food {
    public Orange(String name, String imageURL, String nutritiveValue, String benefits, String drawbacks) {
        super(name, imageURL, nutritiveValue, benefits, drawbacks);
    }

    @Override
    public ScrollPane showInformation() {
        return null;
    }
}
