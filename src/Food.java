import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Food implements Eatable{

    protected String name;
    private Image image;
    protected ImageView imageView;
    protected String nutritiveValue;
    protected String benefits;
    protected String drawbacks;


    public Food(String name,String imageURL,String nutritiveValue,String benefits,String drawbacks){
        this.name=name;
        try {
            this.image=new Image(imageURL);
            this.imageView = new ImageView(this.image);
        }catch (Exception e){
            System.out.println("Exception while processing image");
            System.out.println(e.getMessage());
        }
        this.nutritiveValue = nutritiveValue;
        this.benefits = benefits;
        this.drawbacks=drawbacks;
    }


}
