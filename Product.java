package Models;

import javafx.scene.image.Image;

import java.util.LinkedList;

public class Product{

    private String name, description;
    private double price;
    private int unit;
    private Image image;

    public Product(String name, String description, double price, int unit) {
        setName(name);
        setDescription(description);
        setPrice(price);
        setUnit(unit);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty())
            throw new IllegalArgumentException("Models.Product name cannot be empty");
        else
            this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.isEmpty())
            throw new IllegalArgumentException("Models.Product description cannot be empty");
        else
            this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >0)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be greater than 0");
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        if (unit >= 0)
            this.unit = unit -1;
        else
            throw new IllegalArgumentException("Unit number must be greater than or equal to 0");
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return String.format("%s %s $%.2f %d", name, description, price, unit);
    }



}



