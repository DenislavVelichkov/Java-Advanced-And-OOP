package JavaAdvanced.Generics_17.JarOfT_1;

public class Main {
    public static void main(String[] args) {

        Jar<String> jar = new Jar<>();

        jar.add("Pickle1");
        jar.add("Pickle2");

        System.out.println(jar.remove());
    }
}
