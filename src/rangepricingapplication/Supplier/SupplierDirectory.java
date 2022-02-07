/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Supplier;

import java.util.ArrayList;
import rangepricingapplication.Business.Business;

/**
 *
 * @author kal bugrara
 */
public class SupplierDirectory {

    Business business;
    ArrayList<Supplier> suppliers;

    public SupplierDirectory(Business b){
        business = b;
        suppliers = new ArrayList<Supplier>();
        
    }

    public Supplier newSupplier(String n){
        Supplier supplier = new Supplier(n);
        suppliers.add(supplier);
        return supplier;

    }
}
