public class DrivingLicense {
     String name;
     String surname;
     String address;
     String postalCode;
     String city;
     String drivingLicenseNumber;
     int yearOfIssue;
     String licenseCategory;

        public String display(){
            return "name " + name + "surname " + surname + "address " + address+ "postalCode " + postalCode+ "city " + city + "driving license number"+ drivingLicenseNumber + "year of issue" + yearOfIssue + "license category "+ licenseCategory; 
        }
}
