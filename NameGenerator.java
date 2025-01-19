import java.util.Random;
public class NameGenerator {
    public static void main(String[] args) {
        System.out.println("Hello welcome to my name generator. Let's generate a name for You!!!!!");
        String[] name = new String[]{"Ram","Hari","Sujata","Saroj","Suryansu","Sanket","Dudu"};
        String[] surname = new String[]{"Kumar","Mohanty","Sahoo","Barik","Mallik","Samal","Pradhan"};
        Random random = new Random();
        int n = random.nextInt(7);
        int s = random.nextInt(7);
        System.out.println(name[n] +" "+ surname[s]);
    }
}