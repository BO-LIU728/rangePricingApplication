/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Business;

import rangepricingapplication.CustomerManagement.CustomerDirectory;
import rangepricingapplication.OrderManagement.MasterOrderList;
import rangepricingapplication.Supplier.SupplierDirectory;
import rangepricingapplication.Supplier.Supplier;
import rangepricingapplication.Personnel.EmployeeDirectory;
/**
 *
 * @author kal bugrara
 */
public Business {

    String name;
    private SupplierDirectory suppliers;
    private CustomerDirectory customers;
    private MasterOrderList masterOrderList;
    private EmployeeDirectory employees;

    public Business(String name){
        
        this.name = name;
        suppliers = new SupplierDirectory(this);
        customers = new CustomerDirectory(this);
        masterOrderList = new MasterOrderList(this);
        employees = new EmployerDirectory(this);
    
    
}
     public SupplierDirectory getSuppliers() {
        return suppliers;
    }

    public CustomerDirectory getCustomers() {
        return customers;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public EmployeeDirectory getEmployees() {
        return employees;
    }
    public void setCustomers(CustomerDirectory customers) {
        this.customers = customers;
    }

    public String getName(){
        return name;
}
    public void setName(String name){
        this.name = name;
}
}
