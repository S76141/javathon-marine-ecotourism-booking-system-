package Model;

public class Guide {

    private String name;
    private String contactNo;
    private String licenseNo;
    
    public Guide(String name, String contactNo, String licenseNo){
        this.name=name;
        this.contactNo=contactNo;
        this.licenseNo=licenseNo;
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

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
}
