public class count_digits {
    public static void main(String[] args) {

    int count = 0, num = 2563452;

    while (num != 0) {
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  
    }
}
