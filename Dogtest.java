class dog{
    String name ;
    int age;
    String breed;
}
public class Dogtest {
    public static void main(String[] args) {
        dog german = new dog();
        german.name = "Shiro";
        german.age = 15;
        german.breed = "German shaphed ";
        System.out.println(german.name + " "+ german.age + " "+ german.breed);
    }
}
