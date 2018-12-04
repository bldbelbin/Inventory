package Models;

import java.util.*;

public class Inventory {

        TreeMap<String, LinkedList<Product>> inventoryMap;

    public Inventory() {
            inventoryMap = new TreeMap<>();
        }

        public void loadDefaultData () {

            // Adding of product camera
            Product camera1 = new Product("FUJIFILM X-T20", "Mirrorless", 1550.01, 15);
            Product camera2 = new Product("SONY Alpha A6000", "Mirrorless", 779.98, 20);
            Product camera3 = new Product("SONY Alpha A5100", "Mirrorless", 679.98, 18);
            Product camera4 = new Product("CANON EOS M50", "Mirrorless", 1099.95, 12);
            Product camera5 = new Product("CANON EOS 80D", "DSLR", 2399.87, 10);
            Product camera6 = new Product("NIKON D5600", "DSLR", 1050.04, 30);
            Product camera7 = new Product("SONY DSCHX99", "Point & Shoot", 599.99, 15);
            Product camera8 = new Product("NIKON COOLPIX W300", "Point & Shoot", 499.99, 12);

            // Adding of product lens
            Product lens1 = new Product("NIKON AF-P DX", "18-55 VR F3.5-5.6", 329.99, 5);
            Product lens2 = new Product("NIKON AF-S DX", "18-140 F3.5-5.6", 649.99, 7);
            Product lens3 = new Product("SONY SEL", "55-210 OSS", 449.99, 8);
            Product lens4 = new Product("CANON EF-S", "55-250 F4-5.6 IS STM", 399.99, 6);
            Product lens5 = new Product("CANON EF-S", "10-18 4.5-5.6 IS STM", 439.99, 3);
            Product lens6 = new Product("FUJINON XF", "35 F2 WR", 509.99, 5);
            Product lens7 = new Product("FUJINON XC", "50-230 4.5-6.7 OIS II", 499.99, 4);
            Product lens8 = new Product("SONY FE", "70-200 F4.0 OSS", 1799.99, 4);

            // Adding of product tripods
            Product tripod1 = new Product("MANFROTTO BEFREE", "ADVANCED TWIST LOCK BLACK", 299.99, 15);
            Product tripod2 = new Product("MANFROTTO ELEMENT", "SMALL BLACK", 299.99, 8);
            Product tripod3 = new Product("CAMERON T310BH", "W/MONOPOD & CASE", 150.99, 10);
            Product tripod4 = new Product("CAMERON CF710", "W/VH40 2WAY HEAD", 449.99, 12);
            Product tripod5 = new Product("VANGUARD ESPOD CX203AP", "W/PAN HEAD", 64.99, 20);

            // giving the product a category of camera
            addProduct("Camera", camera1);
            addProduct("Camera", camera2);
            addProduct("Camera", camera3);
            addProduct("Camera", camera4);
            addProduct("Camera", camera5);
            addProduct("Camera", camera6);
            addProduct("Camera", camera7);
            addProduct("Camera", camera8);

            // giving the product a category of lens
            addProduct("Lens", lens1);
            addProduct("Lens", lens2);
            addProduct("Lens", lens3);
            addProduct("Lens", lens4);
            addProduct("Lens", lens5);
            addProduct("Lens", lens6);
            addProduct("Lens", lens7);
            addProduct("Lens", lens8);

            // giving the product a category of tripod
            addProduct("Tripod", tripod1);
            addProduct("Tripod", tripod2);
            addProduct("Tripod", tripod3);
            addProduct("Tripod", tripod4);
            addProduct("Tripod", tripod5);
        }

        public TreeMap<String, LinkedList> productList;

    public Inventory(TreeMap < String, LinkedList > productList) {

            this.productList = productList;
        }

        public void addProduct (String category, Product product){

            if (!inventoryMap.keySet().contains(category)) {
                inventoryMap.put(category, new LinkedList());
                inventoryMap.get(category).add(product);
            } else
                inventoryMap.get(category).add(product);
        }

        public String[] getAllCategories () {
            //returns array of all categories
            List<String> categories = new ArrayList<>();
            for(Map.Entry<String, LinkedList<Product>> m:inventoryMap.entrySet())
                categories.add(m.getKey());

            return (String[])categories.toArray();
    }

        public Product[] getAllProducts () {
            //returns Array of all products
            List<Product> products = new ArrayList<Product>();
            for(Map.Entry m:inventoryMap.entrySet())
            products.add((Product) m.getValue());

            return (Product[])products.toArray();
    }

        public Product[] getProductFromCategory(String category){
            List<Product> products = new ArrayList<Product>();
            for(Map.Entry m:inventoryMap.entrySet())
            {
            if(m.getKey().equals(category))
                {
                products.add((Product) m.getValue());
                }
            }
            return (Product[])products.toArray();
    }

}
