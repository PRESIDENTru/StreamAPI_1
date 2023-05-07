import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", "iphone 12", 60000));
        phones.add(new Phone("Samsung", "Galaxy 21", 72000));
        phones.add(new Phone("Apple", "iphone 13 pro", 100000));
        phones.add(new Phone("Xiaomi", "Redmi 7", 10000));
        phones.add(new Phone("Xiaomi", "Redmi 9", 14000));
        phones.add(new Phone("Apple", "iphone 11", 52000));
        phones.add(new Phone("Samsung", "Galaxy A13", 15000));

        ArrayList<Phone> phoneApple = phones.stream()
                .filter(s -> s.getName() == "Apple")
                .collect(Collectors.toCollection(ArrayList::new));
        phoneApple.stream().forEach(s -> System.out.println(s));

        System.out.println();
        System.out.println("---------------------------------------------------");

        //2
        phones.stream()
                .sorted()
                .forEach(s -> System.out.println(s));
    }
}