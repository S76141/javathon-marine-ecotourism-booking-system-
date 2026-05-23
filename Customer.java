
package Model;

public class Customer {
    
    private String name;
    private String contactNo;    
    
    public Customer(String name, String contactNo){
        this.name=name;
        this.contactNo=contactNo;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
