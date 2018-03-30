package service;

import dao.ProductDao;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productdao;

    public List<Product> getProducts(){
        return productdao.getProducts();
    }

    public boolean addProduct(Product product) {

        return productdao.addProduct(product);
    }

    public boolean deleteProduct(int id) {

        return productdao.deleteProduct(id);
    }

    public Product getProductById(int id) {

        return productdao.getProductById(id);
    }

    public boolean updateProduct(Product product) {

        return productdao.updateProduct(product);
    }
}
