public class zad10test {

    public static void main(String[] args) {
        zad10 dl = new zad10();
        dl.setName("Miki");
        dl.setSurname("Kochany");
        dl.setAddress("Miksowo 13");
        dl.setPostalCode("32-987");
        dl.setCity("zbw");
        dl.setDrivingLicenseNumber("123124");
        dl.setYearOfIssue(1999);
        dl.setLicenseCategory("b2");

        dl.setYearOfIssue(1000);
        System.out.println(dl);

    }
}
