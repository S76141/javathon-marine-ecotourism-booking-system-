
package Model;

public class SelfGuidedActivity extends Activity {
    
    public SelfGuidedActivity(String name, double price, int maxCapacity){
        super(name,price,maxCapacity);
    }
    
    public boolean canAcceptBooking(){
        return true;
    }
    
}
