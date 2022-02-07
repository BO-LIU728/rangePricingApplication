/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Personnel;

/**
 *
 * @author kal bugrara
 */
public class EmployeeProfile {

    Person person;
    ArrayList<Order> orders;

    

    public EmployeeProfile(Person p) {
        orders = new ArrayList();

        person = p;
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public void addSalesPersonOrder(Order o){
        orders.add(o);

}



}
