import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {

    public static Stage initialStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        initialStage = primaryStage;
        BorderPane root = new BorderPane();
        ObservableList<Food> foods= getFoods();


        Button button = new Button("Click");
        root.setCenter(button);
        button.setOnAction(e->{
            new FoodStage(foods.get(0));
        });

        Scene scene = new Scene(root,1250,950);
        primaryStage.setTitle("Foods");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    private ObservableList<Food> getFoods(){
        ObservableList<Food> list =FXCollections.observableArrayList();

        String name = "Veal";
        String imageURL="foodImages/Veal.jpg";
        String nutritiveValue= "A 100-gram serving of low-fat beef contains approximately 20 grams of protein and 8 grams\n" +
                " of fat. The same portion of fatty beef contains 16 grams of fat and about 18 grams of protein. \n" +
                "100 grams of low-fat beef has an average of 150 calories, while 100 grams of fatty beef is around \n" +
                "220 calories.";
        String benefits="Protein source: Meat is an excellent source of high-quality protein, which is essential for building \n" +
                "and repairing tissues, producing enzymes and hormones, and supporting overall growth and development.\n" +
                "\n" +
                "Essential amino acids: Meat contains all the essential amino acids that our bodies cannot produce on their own. \n" +
                "These amino acids are crucial for various bodily functions, including muscle synthesis, immune function, and \n" +
                "the production of neurotransmitters.\n" +
                "\n" +
                "Vitamins and minerals: Meat is a significant source of several important vitamins and minerals. For example, it is\n" +
                " a rich source of iron, which is essential for transporting oxygen in the body, as well as zinc, selenium, \n" +
                "phosphorus, and various B vitamins, including vitamin B12, which is primarily found in animal products.\n" +
                "\n" +
                "Heme iron: Meat, particularly red meat, contains heme iron, which is highly bioavailable and easily absorbed \n" +
                "by the body. Iron is vital for the production of red blood cells and the prevention of iron deficiency anemia.\n" +
                "\n" +
                "Weight management and satiety: Protein-rich foods like meat can help promote feelings of fullness and satiety, \n" +
                "which may aid in weight management and weight loss efforts. Including lean meat in meals can help curb appetite \n" +
                "and reduce overall calorie intake.\n" +
                "\n" +
                "Muscle health and strength: Protein in meat plays a crucial role in maintaining and building muscle mass, making \n" +
                "it an important component of a balanced diet, particularly for those involved in physical activity or \n" +
                "strength training.\n" +
                "\n" +
                "Brain function: Meat is a source of several nutrients, including omega-3 fatty acids, vitamin B12, and \n" +
                "choline, which are essential for brain health and function. These nutrients contribute to cognitive \n" +
                "function, memory, and overall neurological well-being.\n" +
                "\n" +
                "Improved nutrient absorption: The presence of protein and fat in meat can enhance the absorption of \n" +
                "fat-soluble vitamins like vitamin A, vitamin D, vitamin E, and vitamin K. Including meat in meals can \n" +
                "aid in the absorption of these important nutrients.";
        String drawbacks="High saturated fat content: Meat, especially red meat and processed meats, often contain \n" +
                "significant amounts of saturated fat. Consuming high levels of saturated fat has been linked to \n" +
                "an increased risk of cardiovascular diseases, such as heart disease and stroke.\n" +
                "\n" +
                "Increased risk of certain diseases: Regular consumption of red and processed meats has been associated \n" +
                "with an increased risk of various diseases, including certain types of cancer (such as colorectal cancer),\n" +
                " type 2 diabetes, and cardiovascular diseases. These risks may be attributed to the saturated fat, \n" +
                "cholesterol, and compounds formed during cooking and processing of meat.\n" +
                "\n" +
                "Potential for foodborne illnesses: Improper handling, storage, or undercooking of meat can lead to the \n" +
                "presence of harmful bacteria like Salmonella, Escherichia coli (E. coli), and Campylobacter, which can \n" +
                "cause foodborne illnesses. It's crucial to handle and cook meat properly to minimize the risk of contamination.\n" +
                "\n" +
                "Environmental impact: The production of meat, especially from conventionally raised livestock, can have a \n" +
                "significant environmental impact. Meat production requires large amounts of water, land, and resources, \n" +
                "contributes to greenhouse gas emissions, and can contribute to deforestation and habitat loss.\n" +
                "\n" +
                "Ethical considerations: Many people have ethical concerns related to the treatment of animals in the meat \n" +
                "industry. Animal welfare issues, such as intensive farming practices, confinement systems, and use of growth \n" +
                "hormones and antibiotics, are areas of concern for some individuals.\n" +
                "\n" +
                "Digestive issues: Some individuals may experience digestive issues or discomfort after consuming certain \n" +
                "types of meat. This can include symptoms such as bloating, gas, indigestion, or intolerance to \n" +
                "specific proteins found in meat.\n" +
                "\n" +
                "Cost: Depending on the quality and type of meat, it can be more expensive compared to other protein sources. \n" +
                "This can make it less accessible or less affordable for some individuals or families.\n" +
                "\n";

        Meat meat = new Meat(name, imageURL,nutritiveValue,benefits,drawbacks);
        list.add(meat);

         name = "Orange";
         imageURL = "foodImages/Orange.jpg";
         nutritiveValue = "There are 46 calories in 100 grams of orange. 1 serving (220 g) of orange is 101 calories.\n" +
                " 100 grams of orange contains 11.54 grams of carbohydrates, 0.7 grams of protein, 0.21 grams of fat and 2.4\n" +
                " grams of fiber.";
         benefits = "High in Vitamin C: Oranges are renowned for their high vitamin C content. Vitamin C is an antioxidant \n" +
                 "that helps protect cells from damage, supports the immune system, aids in collagen synthesis for \n" +
                 "healthy skin, and assists with iron absorption.\n" +
                 "\n" +
                 "Immune system support: Vitamin C in oranges plays a crucial role in supporting the immune system, \n" +
                 "helping to fight off infections, and promoting overall immune health.\n" +
                 "\n" +
                 "Antioxidant properties: Oranges contain various antioxidants, including flavonoids, which help \n" +
                 "protect against oxidative stress and reduce the risk of chronic diseases. These antioxidants contribute\n" +
                 " to the overall health and well-being of the body.\n" +
                 "\n" +
                 "Heart health: Oranges are a good source of dietary fiber, potassium, and folate, which are beneficial \n" +
                 "for heart health. The fiber helps maintain healthy cholesterol levels, while potassium supports proper \n" +
                 "heart function and blood pressure regulation. Folate helps reduce levels of homocysteine, an amino acid \n" +
                 "associated with an increased risk of heart disease.\n" +
                 "\n" +
                 "Digestive health: Oranges are rich in dietary fiber, which aids in maintaining healthy digestion and \n" +
                 "preventing constipation. The fiber content also supports a healthy gut microbiome, promoting good bacteria \n" +
                 "growth and overall digestive well-being.\n" +
                 "\n" +
                 "Skin health: The high vitamin C content in oranges is essential for the production of collagen, a protein that\n" +
                 " supports skin structure and elasticity. Consuming oranges can contribute to healthier skin, reduce signs of aging, \n" +
                 "and improve overall skin appearance.\n" +
                 "\n" +
                 "Hydration: Oranges have high water content, making them a hydrating fruit choice. Staying hydrated is \n" +
                 "important for overall health, proper bodily functions, and maintaining optimal energy levels.\n" +
                 "\n" +
                 "Eye health: Oranges contain nutrients like vitamin C, vitamin A, and antioxidants such as lutein and \n" +
                 "zeaxanthin, which are beneficial for eye health. These compounds help protect against age-related macular \n" +
                 "degeneration (AMD) and promote good vision.\n" +
                 "\n" +
                 "Weight management: Oranges are relatively low in calories and fat, making them a nutritious choice for those \n" +
                 "watching their weight. The fiber content in oranges also contributes to feelings of fullness and can aid in \n" +
                 "weight management efforts.\n" +
                 "\n" +
                 "Flavor and versatility: Oranges are delicious and versatile. They can be enjoyed as a refreshing snack, added \n" +
                 "to fruit salads, juiced, or used in various recipes, adding flavor, sweetness, and a nutritional boost to \n" +
                 "meals.";
         drawbacks = "Acidic nature: Oranges and other citrus fruits are acidic in nature. This acidity can potentially cause \n" +
                 "discomfort or irritation for individuals with sensitive stomachs or digestive conditions such as \n" +
                 "acid reflux, gastritis, or ulcers. It's important to monitor your personal tolerance and consume \n" +
                 "oranges in moderation if you experience any adverse effects.\n" +
                 "\n" +
                 "Allergic reactions: Although rare, some individuals may be allergic to citrus fruits, including \n" +
                 "oranges. Allergic reactions can range from mild symptoms like itching or skin rashes to more severe \n" +
                 "reactions such as difficulty breathing or anaphylaxis. If you have a known allergy to citrus fruits, \n" +
                 "it's important to avoid consuming oranges.\n" +
                 "\n" +
                 "Dental health concerns: Oranges are acidic and contain natural sugars, which can contribute to dental \n" +
                 "erosion and tooth decay if consumed in excess or not followed by proper oral hygiene practices. \n" +
                 "It's recommended to rinse your mouth with water after consuming oranges and to brush your teeth regularly.\n" +
                 "\n" +
                 "Blood sugar impact: While oranges are relatively low on the glycemic index compared to many other fruits, \n" +
                 "they still contain natural sugars. People with diabetes or those who need to manage their blood sugar \n" +
                 "levels should be mindful of their orange consumption and consider portion control or consult with a \n" +
                 "healthcare professional or registered dietitian for personalized guidance.\n" +
                 "\n" +
                 "Interactions with certain medications: Oranges, particularly the juice, can interact with certain medications. \n" +
                 "Compounds in oranges, such as furanocoumarins, can inhibit enzymes responsible for drug metabolism, \n" +
                 "potentially altering the effectiveness or concentration of certain medications in the body. If you are \n" +
                 "taking any medications, it's essential to check with your healthcare provider or pharmacist for any \n" +
                 "potential interactions.";


        Orange orange = new Orange(name,imageURL,nutritiveValue,benefits,drawbacks);
        list.add(orange);

        name="Chocolate";
        imageURL = "foodImages/chocolate.jpg";
        nutritiveValue="There are 528 calories in 100 grams of chocolate. 1 package (70 g) of chocolate is 370 calories. \n" +
                "100 grams of chocolate contains 57.9 grams of carbohydrates, 4.4 grams of protein, 35.1 grams of fat.";
        benefits="Antioxidant-rich: Dark chocolate is a potent source of antioxidants, such as flavonoids and polyphenols, \n" +
                "which help protect the body from oxidative stress and damage caused by free radicals.\n" +
                "\n" +
                "Heart health: Several studies suggest that moderate consumption of dark chocolate may have a positive\n" +
                " impact on heart health. It may help lower blood pressure, reduce the risk of blood clots, improve blood\n" +
                " flow, and enhance the function of the endothelial cells lining the blood vessels.\n" +
                "\n" +
                "Mood enhancement: Chocolate contains several compounds that can positively affect mood. It stimulates the\n" +
                " production of endorphins and serotonin, which are neurotransmitters associated with feelings of pleasure\n" +
                " and well-being, leading to a temporary mood boost.\n" +
                "\n" +
                "Cognitive benefits: The flavonoids present in chocolate have been linked to potential cognitive benefits.\n" +
                " They may improve blood flow to the brain, enhance cognitive function, and provide protection against\n" +
                " age-related cognitive decline.\n" +
                "\n" +
                "Nutritional value: Dark chocolate contains essential minerals like iron, magnesium, copper, and manganese. \n" +
                "It also provides fiber and a small amount of protein. However, it's important to note that chocolate is \n" +
                "also calorie-dense, so portion control is crucial.\n" +
                "\n" +
                "Improved exercise performance: Some research suggests that consuming dark chocolate may enhance exercise \n" +
                "performance. The flavonols found in chocolate have been associated with increased nitric oxide production, \n" +
                "which can improve blood flow and oxygen delivery to muscles.\n" +
                "\n" +
                "Skin health: The antioxidants in chocolate, along with its flavonoids and minerals, may have a positive \n" +
                "impact on skin health. They can help protect the skin against sun damage, improve hydration, and promote \n" +
                "a healthy complexion.";
        drawbacks="High calorie content: Chocolate is calorie-dense, and excessive consumption can contribute to\n" +
                " weight gain and obesity. It's crucial to consume chocolate in moderation and be mindful of \n" +
                "portion sizes.\n" +
                "\n" +
                "Added sugars: Many chocolate products, particularly milk chocolate and flavored varieties, contain \n" +
                "high amounts of added sugars. Excessive sugar intake is associated with various health problems, \n" +
                "including weight gain, diabetes, and dental issues.\n" +
                "\n" +
                "High fat content: Chocolate, especially milk and white chocolate, often contains significant amounts \n" +
                "of saturated and trans fats. These fats can raise cholesterol levels and increase the risk of heart \n" +
                "disease when consumed in excess.\n" +
                "\n" +
                "Potential allergen: Some individuals may have allergies or sensitivities to chocolate, particularly \n" +
                "those with cocoa allergies or lactose intolerance (in the case of milk chocolate). Allergic reactions \n" +
                "can range from mild discomfort to severe symptoms and require medical attention.\n" +
                "\n" +
                "Caffeine and stimulants: Chocolate contains caffeine and other stimulants like theobromine. While the \n" +
                "amounts are generally not significant, individuals sensitive to these substances may experience adverse \n" +
                "effects such as increased heart rate, jitteriness, or difficulty sleeping.\n" +
                "\n" +
                "Potential for addiction: Chocolate, especially when combined with sugar and fat, can be addictive for some \n" +
                "people. Cravings and overconsumption can lead to an unhealthy relationship with food and contribute to weight\n" +
                " management difficulties.\n" +
                "\n" +
                "Interactions with certain medications: Chocolate may interact with certain medications, such as monoamine \n" +
                "oxidase inhibitors (MAOIs), used to treat depression. These interactions can lead to elevated blood pressure \n" +
                "or other adverse effects. It's important to consult a healthcare professional if you have concerns about \n" +
                "interactions with your medications.";


        Chocolate chocolate = new Chocolate(name,imageURL,nutritiveValue,benefits,drawbacks);
        list.add(chocolate);


        name="Mushroom";
        imageURL="foodImages/mushroom.jpg";
        nutritiveValue="There are 22 calories in 100 grams of mushrooms. 1 piece (15 g) mushroom is 3 calories. \n" +
                "100 grams of mushroom contains 3.26 grams of carbohydrates, 3.09 grams of protein, 0.34 grams of \n" +
                "fat, 1 gram of fiber.";
        benefits="Nutrient-rich: Mushrooms are low in calories and rich in essential nutrients. They are a good source \n" +
                "of B vitamins, including riboflavin, niacin, and pantothenic acid. Mushrooms also provide minerals like \n" +
                "selenium, copper, potassium, and phosphorus.\n" +
                "\n" +
                "Antioxidant properties: Mushrooms contain antioxidants, such as selenium and various phenolic compounds, \n" +
                "which help protect the body's cells from oxidative stress and damage caused by free radicals. Antioxidants \n" +
                "are beneficial for overall health and may help reduce the risk of chronic diseases.\n" +
                "\n" +
                "Immune support: Certain types of mushrooms, such as shiitake and maitake, have been studied for their \n" +
                "potential immune-boosting properties. They contain beta-glucans, a type of polysaccharide, which may \n" +
                "enhance immune function by stimulating the production of immune cells and enhancing their activity.\n" +
                "\n" +
                "Potential anti-cancer properties: Some mushrooms, including reishi, turkey tail, and maitake, have been \n" +
                "esearched for their potential anti-cancer properties. They contain bioactive compounds that may have anti-tumor \n" +
                "effects and stimulate the immune system to combat cancer cells. However, further research is needed to understand\n" +
                " their full potential.\n" +
                "\n" +
                "Gut health and digestion: Mushrooms are a good source of dietary fiber, which is important for a healthy \n" +
                "digestive system. Fiber aids in maintaining regular bowel movements, promotes the growth of beneficial gut \n" +
                "bacteria, and helps prevent constipation.\n" +
                "\n" +
                "Weight management: Mushrooms can be a valuable addition to a weight management plan due to their low calorie\n" +
                " and fat content. They can be a satisfying and flavorful alternative to higher-calorie ingredients in various dishes.\n" +
                "\n" +
                "Vitamin D: Some mushrooms, such as certain varieties of wild mushrooms or those exposed to UV light, naturally\n" +
                " contain vitamin D. Vitamin D is essential for bone health, immune function, and overall well-being.\n" +
                "\n" +
                "Versatile culinary ingredient: Mushrooms have a unique and savory flavor that adds depth to many dishes. \n" +
                "They can be incorporated into a wide range of recipes, including soups, stir-fries, salads, and pasta dishes, \n" +
                "providing taste and texture variety to meals.";
        drawbacks="Allergic reactions: Some individuals may be allergic to certain types of mushrooms or fungi. Allergies can \n" +
                "range from mild symptoms like itching and skin rashes to severe reactions that require immediate medical\n" +
                " attention. If you have a known allergy to mushrooms or fungi, it's important to avoid them.\n" +
                "\n" +
                "Toxicity and misidentification: Some wild mushrooms can be toxic or even deadly if consumed. It is \n" +
                "crucial to have proper knowledge and expertise in identifying edible mushrooms or to purchase them \n" +
                "from reliable sources. Eating wild mushrooms without proper identification can pose significant health risks.\n" +
                "\n" +
                "High purine content: Certain mushrooms, such as shiitake and portobello, have a relatively high purine content.\n" +
                " Purines are naturally occurring compounds that can be broken down into uric acid in the body. High levels of\n" +
                " uric acid can contribute to gout and kidney stone formation in susceptible individuals. People with these \n" +
                "conditions may need to limit their intake of purine-rich foods, including certain mushrooms.\n" +
                "\n" +
                "Contaminants and pesticides: Like any agricultural product, mushrooms can be exposed to contaminants or \n" +
                "pesticides. It's important to source mushrooms from reputable growers or suppliers who follow proper \n" +
                "cultivation and safety practices.\n" +
                "\n" +
                "Digestive issues for some individuals: Some people may experience digestive discomfort or an upset stomach \n" +
                "after consuming mushrooms. This could be due to individual sensitivity or the presence of certain compounds \n" +
                "in mushrooms that may be difficult to digest for some individuals. Cooking mushrooms thoroughly can help make \n" +
                "them more digestible.\n" +
                "\n" +
                "Drug interactions: Some mushrooms, particularly certain varieties of medicinal mushrooms, may interact with \n" +
                "certain medications. For example, mushrooms with immune-stimulating properties may interfere with \n" +
                "immune-suppressing drugs. It's important to consult with a healthcare professional if you are taking \n" +
                "medications to understand potential interactions.";

        Mushroom mushroom = new Mushroom(name,imageURL,nutritiveValue,benefits,drawbacks);
        list.add(mushroom);



        return list;

    }



    public static void main(String[] args) {
        launch(args);
    }
}
