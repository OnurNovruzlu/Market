package MarketMethods;

import bean.Product;
import java.util.InputMismatchException;
import market.Config;
import static market.Config.products;

public class MainMethods {
    public static Product writeProducts(){
          String name=MarketMethods.ScannerMethod.requireString("Enter product`s name");            
             String weight=ScannerMethod.requireString("Enter product`s weight");         
             double price=ScannerMethod.requireDouble("Enter product`s price");             
             int stock=ScannerMethod.requireInt("Enter product`s stock");           
             double value=ScannerMethod.requireDouble("Enter product`s value");
             
             Product mal=new Product(name,weight,price,stock,value);
        return mal;
    }
    public static void addProducts(){
        try{ int count=ScannerMethod.requireInt("How many product will you add?");
             Config.products=new Product[count];
             for(int i=0;i<products.length;i++){
                 System.out.println(i+1+". Product:");
             Config.products[i]=MainMethods.writeProducts();
             }
    }catch(NegativeArraySizeException  | InputMismatchException ex){
            System.err.println("Please enter posivite numbers");
    }
    }
    public static void showAllProducts(){
        if(products==null){
            return;
        }
        for(int i=0;i<products.length;i++){
    
            System.out.println(i+1+".Product:"+products[i]);
        }
    }
    public static void searchProducts(){
           if(Config.products==null){
            return;
        }
        String searchs=ScannerMethod.requireString("Enter keyword types: name || weight");
        for (Product cr : Config.products) {
            if(cr.getName().contains(searchs)||cr.getWeight().contains(searchs)){
                System.out.println(cr);
            }
            else
                System.out.println("Nothing founded");
        }
    }
    public static void updateProducts(){
           if(Config.products==null){
            return;
        }
        int choice = ScannerMethod.requireInt("Which product do you want to update");
                    Product prd = products[choice - 1];
                    prd.setName(ScannerMethod.requireString("Enter new name"));
                    prd.setWeight(ScannerMethod.requireString("Enter new weight"));
                  try{  prd.setPrice(ScannerMethod.requireDouble("Enter new price"));
                    prd.setStock(ScannerMethod.requireInt("Enter new stock"));
                    prd.setValue(ScannerMethod.requireDouble("Enter new value"));}catch(NegativeArraySizeException  | InputMismatchException ex){
                       System.err.println("please enter posivite (decimal or normal) numbers"); 
                    }
                
    }
    public static void productsSold(){
           if(Config.products==null){
            return;
        }
       int totaltype=ScannerMethod.requireInt("How many types of products were sold in total?");
       for(int i=0;i<totaltype;i++){
            String sold = ScannerMethod.requireString("Which product was sold?(Enter product`s name)");
            for (Product cr : Config.products) {
            if(cr.getName().contains(sold)){
                int selt=ScannerMethod.requireInt("How many products were sold? ");
               cr.setStock(cr.getStock()-selt);
                System.out.println(cr);
            }
        }
       }
}
    public static void benefit(){
        if(Config.products==null){
            return;
        }
        for (Product product : products) {
            double profit = product.getPrice() - product.getValue();
            int seltt = ScannerMethod.requireInt("How many stock were sold from " + product.getName());
            double benefit=profit*seltt;
            System.out.println("benefit from " + product.getName() + " = " + benefit);
        }
    }
    public static void marketMthd(){
        while (true) {
            int menu = ScannerMethod.requireInt("""
                                           What do you want to do?
                                           1.Add Product
                                           2.Show all Products
                                           3.Search Product
                                           4.Update Product
                                           5.Products sold
                                           6.Benefit
                                           7.Exit""");
            switch (menu) {
                case 1 ->
                    MainMethods.addProducts();
                case 2 ->
                    MainMethods.showAllProducts();
                case 3 ->
                    MainMethods.searchProducts();
                case 4 ->
                    MainMethods.updateProducts();
                case 5 ->
                    MainMethods.productsSold();
                case 6 ->   
                    MainMethods.benefit();
                case 7 ->  System.exit(0);
               default -> System.out.println("Please enter the correct menu");
            }
        }
    }
}
