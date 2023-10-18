public class CounterTest {
    public static void main(String[] args) {
  Counter uno = new Counter();
  Counter due = new Counter();
  uno.inc_by_ten();
  uno.inc_by_ten();
  uno.inc_by_one();
  uno.inc_by_one();
  uno.inc_by_one();
  uno.inc_by_one();
  uno.inc_by_one();
  uno.inc_by_one();
  uno.inc_by_one();
  uno.show();
  due.dec_by_one();
  due.dec_by_one();
  due.dec_by_one();
  due.dec_by_one();
  due.dec_by_one();
  due.dec_by_one();
  due.dec_by_one();
  due.dec_by_ten();
  due.dec_by_ten();
  due.dec_by_ten();
  due.dec_by_ten();
  due.show();



    }
}
