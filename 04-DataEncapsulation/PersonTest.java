public class PersonTest {
    public static void main(String[] args) {
        Person Miki = new Person("Miki", 19);
        System.out.println(Miki.getAge());
        System.out.println(Miki.isAdult());
        Miki.setAge(17);
        System.out.println(Miki.isAdult());
        System.out.println(Miki.toString());
    }
}
