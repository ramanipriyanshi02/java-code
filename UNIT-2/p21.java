class Student {
    private int rollno;
    private String name;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class p21 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setRollno(101);
        s.setName("Priyanshi");

        System.out.println("Roll No: " + s.getRollno());
        System.out.println("Name: " + s.getName());
    }
}