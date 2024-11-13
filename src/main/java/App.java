public class App {
    public static void main(String[] args) {
        String name = System.getenv("USER_NAME");
        if (name == null || name.isEmpty()) {
            System.out.println("Nenhum nome informado!");
        } else {
            System.out.println("Olá, " + name + "!");
        }
    }
}
