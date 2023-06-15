package enumerationTest;
    enum Day{
      MONDAY,
       TUESDAY,
       WEDNESDAY,
       THU,
       FRI,
       SAT,
       SUNDAY

   }

public class main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("today is "+today);
        for (Day day :Day.values()){
            System.out.println(day);
        }
    }

}
