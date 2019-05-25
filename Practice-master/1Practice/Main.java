public class Main {
    public static void main(String[] args) {
        Ball fb = new Ball(5, "Волейбольный");
        fb.get_props();
        System.out.println("Размер мяча: " + fb.getSize());
        System.out.println("Тип мяча: " + fb.getType());
    }
}
