public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        dl.name = "Jack";
        dl.surname = "Masny";
        dl.postalCode = "12314";
        dl.city = "Krakow";
        dl.drivingLicenseNumber = "235624";
        dl.yearOfIssue = 1253;
        dl.licenseCategory = "adghjj";

        System.out.println(dl.display());

    }
}
