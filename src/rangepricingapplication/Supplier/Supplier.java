/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Supplier;

import rangepricingapplication.ProductManagement.ProductCatalog;

/**
 *
 * @author kal bugrara
 */
public class Supplier {

    SupplierDirectory suppliers;
    String name;
    ProductCatalog productcatalog;
    public Supplier(String n, SupplierDirectory s){
        name = n;
        productcatalog = new ProductCatalog();
        suppliers = s;
    }


    public SupplierDirectory getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(SupplierDirectory suppliers) {
        this.suppliers = suppliers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCatalog getProductcatalog() {
        return productcatalog;
    }

    public void setProductcatalog(ProductCatalog productcatalog) {
        this.productcatalog = productcatalog;
    }


}
