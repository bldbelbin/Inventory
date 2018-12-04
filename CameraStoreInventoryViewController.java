package Controllers;

import Models.Inventory;
import Models.Product;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.*;

public class CameraStoreInventoryViewController implements Initializable {

    @FXML
    private ListView <ArrayList> inventoryTable;

    @FXML
    private ImageView productImage;

    @FXML
    private ChoiceBox categoryBox;

    @FXML
    private RadioButton highToLowRadio;

    @FXML
    private RadioButton lowToHighRadio;

    @FXML
    private RadioButton descRadio;

    @FXML
    private RadioButton ascRadio;

    @FXML
    private Button sellUnitButton;

    @FXML
    private Label inventoryTotalLabel;

    @FXML
    private Label categoryTotalLabel;

    private ToggleGroup selectRadioToggle;

    private Product activeProduct;

    public void loadInventory(Product product)
    {
        activeProduct = product;
        updateView();
    }

    public void updateView()
    {
        inventoryTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        productImage.setImage(activeProduct.getImage());

    }

    public static double getAmoungSpent(Product product, TreeMap<String, LinkedList<Product>> sales)
    {
        return sales.get(product).stream()
                .mapToDouble()
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Labels
        inventoryTotalLabel.setText(" ");
        categoryTotalLabel.setText("N/A");

        //configure toggle group
        this.ascRadio.setToggleGroup(selectRadioToggle);
        this.descRadio.setToggleGroup(selectRadioToggle);
        this.highToLowRadio.setToggleGroup(selectRadioToggle);
        this.lowToHighRadio.setToggleGroup(selectRadioToggle);

    }
}
