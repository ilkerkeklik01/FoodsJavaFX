import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FoodStage extends Stage {

    Food food;

    public FoodStage(Food food){
        this.food=food;

        ScrollPane scrollPane = new ScrollPane();
        VBox container = new VBox();
        container.setSpacing(10);
        container.setPadding(new Insets(10));

        container.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE.brighter().brighter(),null,null)));

        Label nameLabel = new Label("Name: " + food.name);
        nameLabel.setAlignment(Pos.CENTER);
        nameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));

        Label nutritiveValueLabel = new Label("Nutritive Value ");
        nutritiveValueLabel.setFont(Font.font("Arial",FontWeight.EXTRA_BOLD,18));
        Label nutritiveValueLabel2 = new Label(food.nutritiveValue);
        nutritiveValueLabel2.setFont(Font.font("Times New Roman",FontWeight.SEMI_BOLD,16));

        Label benefitsLabel = new Label("Benefits ");
        benefitsLabel.setFont(Font.font("Arial",FontWeight.BOLD,18));
        Label benefitsLabel2 = new Label(food.benefits);
        benefitsLabel2.setFont(Font.font(16));

        Label drawbacksLabel = new Label("Drawbacks ");
        drawbacksLabel.setFont(Font.font("Arial",FontWeight.BOLD,18));
        Label drawbacksLabel2 = new Label(food.drawbacks);
        drawbacksLabel2.setFont(Font.font(16));


        container.getChildren().addAll(food.imageView,nameLabel, nutritiveValueLabel,nutritiveValueLabel2
                , benefitsLabel,benefitsLabel2, drawbacksLabel,drawbacksLabel2);
        container.setAlignment(Pos.CENTER);
        scrollPane.setContent(container);
        scrollPane.setFitToWidth(true);


        Scene scene = new Scene(scrollPane,1250,950);
        this.setScene(scene);
        this.setTitle(food.name);
        this.initOwner(Main.initialStage);
        this.initModality(Modality.APPLICATION_MODAL);

        this.showAndWait();

    }

}
