/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.OrderManagement;

import java.util.ArrayList;
import rangepricingapplication.Business.Business;
import rangepricingapplication.CustomerManagement.CustomerProfile;
import rangepricingapplication.Personnel.EmployeeProfile;

/**
 *
 * @author kal bugrara
 */
public class MasterOrderList {

    Business business;
    ArrayList<Order> orders;


    public MasterOrderList(Business b){
        orders = new ArrayList();
        business = b;
    }
    
    public Order newOrder(CustomerProfile cp, EmployeeProfile sp){
        Order o= new Order(this, cp, sp);
        orders.add(o);
        return o;
            
 
    }
    
}
