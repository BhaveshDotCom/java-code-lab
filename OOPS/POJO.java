package OOPS;

public class POJO {
    public static void main(String[] args) {
        Student studentOne = new Student(60, "Bhavesh");
        
        studentOne.setId(61);
        System.out.println(studentOne.getId());
        System.out.println(studentOne.getName());
        
    }
}

// POJO class

class Student {
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}