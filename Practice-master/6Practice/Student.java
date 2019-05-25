public class Student {
    public int id;
    public String name;
    public Student() {
        name = "Стас";
        id = 0;
    }
    public Student (int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    static public int compare(Student dummy, Student dumbo){
        if(dummy.getId() < dumbo.getId()){
            return 1;
        }
        else if (dummy.getId() == dumbo.getId()){
            return 0;
        }
        else {
            return -1;
        }
    }
}
