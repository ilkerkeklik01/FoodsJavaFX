import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public abstract class SurveyPage {


    public static Stage getSurveyPage() {
        Stage surveyStage = new Stage();

        Label ratingLabel = new Label("Rate the program (out of 10):");
        Slider ratingSlider = new Slider(0, 10, 5);
        ratingSlider.setShowTickLabels(true);
        ratingSlider.setShowTickMarks(true);
        ratingSlider.setMajorTickUnit(1);
        ratingSlider.setBlockIncrement(1);

        Label feedbackLabel = new Label("Additional Feedback:");
        TextArea feedbackArea = new TextArea();

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(event -> {
            // Retrieve the user input
            int rating = (int) ratingSlider.getValue();
            String feedback= "";
            try {
                feedback = feedbackArea.getText();
            }catch (Exception e){

                System.out.println(e.getMessage());
            }
            System.out.println("Rating: " + rating);
            System.out.println("Feedback: " + feedback);
            surveyStage.close();
        });


        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(ratingLabel, ratingSlider, feedbackLabel, feedbackArea, submitButton);


        Scene scene = new Scene(vbox, 400, 250);
        surveyStage.setScene(scene);
        surveyStage.setResizable(false);
        surveyStage.setTitle("Program Survey");

        return surveyStage;
    }

}
