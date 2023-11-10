public class zad10 {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String drivingLicenseNumber;
    private int yearOfIssue;
    private String licenseCategory;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        String output = city.substring(0, 1).toUpperCase() + city.substring(1);
        this.city = output;
    }
    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }
    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public void setYearOfIssue(int yearOfIssue) {
        if(yearOfIssue>=1980 &&yearOfIssue<=2023){
        this.yearOfIssue = yearOfIssue;
        }
    }
    public String getLicenseCategory() {
        return licenseCategory;
    }
    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }
    @Override
    public String toString()
    {
        return "name "+ name + "\n" +  "surname " + surname + "\n" +  "address " + address + "\n" +  "postalCode " + postalCode + "\n" +   "city " + city  + "\n" +   "driving license number "+ drivingLicenseNumber  + "\n" +   "year of issue " + yearOfIssue  + "\n" +  "license category "+ licenseCategory; 
    }
}
