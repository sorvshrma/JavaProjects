
package Business;

import java.util.ArrayList;

/**
 *
 * @author info
 */
public class ProductDirectory {
    
    private ArrayList<Product> productDirectory;
    
    public ProductDirectory(){
        productDirectory = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ArrayList<Product> productDirectory) {
        this.productDirectory = productDirectory;
    }
    
    public Product addProduct(){
        Product newProduct = new Product();
        productDirectory.add(newProduct);
        return newProduct;
    }
    
    public void deleteProduct(Product product){
        productDirectory.remove(product);
    }
    
    public Product searchAccount(String name){
        for(Product prod : productDirectory){
            if(prod.getName().equalsIgnoreCase(name)){
                return prod;
            }
        }
        return null;
    }
}
