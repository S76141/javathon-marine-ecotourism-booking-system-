
package Model;
import java.util.List;
import java.util.ArrayList;

public class Activity {

    /**
     * @return the name
     */
    
    private String name;
    private double price;
    private int maxCapacity;
    private List<customer> registeredCustomer = new ArrayList<>();
    
    public Activity(String name, double price, int maxCapacity){
        this.name=name;
        this.price=price;
        this.maxCapacity= maxCapacity;
    }
    
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the maxCapacity
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * @param maxCapacity the maxCapacity to set
     */
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * @return the registeredCustomer
     */
    public List<customer> getRegisteredCustomer() {
        return registeredCustomer;
    }

    /**
     * @param registeredCustomer the registeredCustomer to set
     */
    public void setRegisteredCustomer(List<customer> registeredCustomer) {
        this.registeredCustomer = registeredCustomer;
    }
    
    public boolean addCustomer(customer customerName){
        if(registeredCustomer.size()<maxCapacity){
            return registeredCustomer.add(customerName);
        }
        return false;
    }
    
    boolean removeCustomer(customer customer){
        return;
    }
    
    boolean isFull(){
        return ;
    }
}
