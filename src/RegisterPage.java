import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public abstract class RegisterPage {

    public static Stage getRegisterStage() {
        Stage registerStage = new Stage();

        // Create the UI components
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label surnameLabel = new Label("Surname:");
        TextField surnameField = new TextField();

        Label dobLabel = new Label("Date of Birth:");
        DatePicker dobPicker = new DatePicker();

        Label countryLabel = new Label("Country:");
        ComboBox<String> countryComboBox = new ComboBox<>();
        countryComboBox.getItems().addAll("Russia", "United States", "Turkey","Spain","Italy","Portugal",
                "Argantina","Brasil","Canada","Japan","China","Germany","France","England","Sweden","Greece","Iran",
                "Iraq","Syria","Bulgary","Poland","Ukraine","Unknown");

        Label cityLabel = new Label("City:");
        TextField cityField = new TextField();

        Label phoneLabel = new Label("Phone Number:");
        TextField phoneField = new TextField();

        Label universityLabel = new Label("University:");
        TextField universityField = new TextField();

        Button registerButton = new Button("Register");
        registerButton.setOnAction(event -> {
            // Retrieve the user input
            String name = nameField.getText().equals("") ? "Unknown" : nameField.getText();

            String surname = surnameField.getText().equals("") ? "Unknown": surnameField.getText();

            String dob ="";
            try {
                dob = dobPicker.getValue().toString();
            }catch (Exception e){
                dob="Unknown";
            }
            String country = countryComboBox.getValue();


            String city = cityField.getText().equals("") ? "Unknown": cityField.getText();
            String phoneNumber = phoneField.getText().equals("") ? "Unknown" : phoneField.getText();
            String university = universityField.getText().equals("") ? "Unknown" : universityField.getText();

            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Date of Birth: " + dob);
            System.out.println("Country: " + ((country==null) ? "Unknown" :country));
            System.out.println("City: " + city);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("University: " + university);

            registerStage.close();
        });


        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.addRow(0, nameLabel, nameField);
        gridPane.addRow(1, surnameLabel, surnameField);
        gridPane.addRow(2, dobLabel, dobPicker);
        gridPane.addRow(3, countryLabel, countryComboBox);
        gridPane.addRow(4, cityLabel, cityField);
        gridPane.addRow(5, phoneLabel, phoneField);
        gridPane.addRow(6, universityLabel, universityField);
        gridPane.addRow(7, registerButton);


        Scene scene = new Scene(gridPane,400,400);
        registerStage.setScene(scene);
        registerStage.setResizable(false);
        registerStage.setTitle("Registration Form(Optional)");

        return registerStage;
    }


}
