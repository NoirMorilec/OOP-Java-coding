public class Ball {
    private int size;
    private String type;
    public Ball() {
        size = 1;
        type = "Волейбольный";
    }
    public Ball(int sz, String tp) {
        size = sz;
        type = tp;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void get_props() {
        System.out.println("Тип мяча: " + type);
        System.out.println("Размер мяча: " + size);
    }
}

