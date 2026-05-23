package Model;

public class GuidedActivity extends Activity {

    private Guide assignedGuide;
    
    public GuidedActivity(String name, double price, int maxCapacity){
        super(name,price, maxCapacity);
    }
    
    public Guide getAssignedGuide() {
        return assignedGuide;
    }

    public void setAssignedGuide(Guide assignedGuide) {
        this.assignedGuide = assignedGuide;
    }
  
    public boolean canAcceptBooking(){
        return assignedGuide != null;
    }
}
