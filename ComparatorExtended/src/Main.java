import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> personArray = new ArrayList<>();
        personArray.add(new Person("Andrzej", "Kowalski", 30));
        personArray.add(new Person("Bartek", "Kołakowski", 40));
        personArray.add(new Person("Cezary", "Dębowski", 35));
        personArray.add(new Person("Cezary", "Akacjowy", 32));
        personArray.add(new Person("Cezary", "Szczęsny", 30));
        personArray.sort(Comparator.comparing(Person::getSurname, Collator.getInstance(new Locale("pl", "PL"))));
        for (Person person : personArray)
        {
            
        }
        personArray.sort(Comparator.comparing(Person::getName).thenComparing(Person::getSurname));
        for (Person person : personArray)
        {
            System.out.println(person);
        }
        personArray.sort(Comparator.comparing(Person::getName, (s, t) -> Integer.compare(s.length(), t.length())));
        personArray.sort((s, t) -> s.getAge() - t.getAge());
    }
}