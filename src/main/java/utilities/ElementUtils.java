package utilities;

public class ElementUtils {

    public static String formatProductId(String productName){

        return productName.trim().toLowerCase().replace(" ", "-");
    }
}
