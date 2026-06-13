package OOPS;
/*
An immutable class is a class whose objects cannot be modified after they are created. Once an object's state is initialized.
*/
public class immutableClass {
    public static void main(String[] args) {
        College college = new College("IISc", "Bengaluru");
        Student studentOne = new Student("Bhavesh", 2029, college);
        System.out.println(studentOne.getName());

        studentOne.getCollege().collegeName = "IIT B";
        System.out.println(studentOne.getCollege().collegeName);
    
    }
}

final class Student{

    private final String name;
    private final int yearOfGrad;
    private final College college;

    Student(String name, int yearOfGrad, College college){
        this.name = name;
        this.yearOfGrad = yearOfGrad;
        this.college = new College(college.collegeName, college.collegeLocation);
    }

    public String getName(){
        return this.name;
    }

    public int getYearOfGrad(){
        return this.yearOfGrad;
    }

    public College getCollege(){
        return new College(this.college.collegeName, this.college.collegeLocation);
    }

    // public String getCollegeName(){
    //     return this.college.collegeName;
    // }

    // public String getCollegeLocation(){
    //     return this.college.collegeLocation;
    // }
}

class College{
    String collegeName; 
    String collegeLocation;

    College(String collegeName, String collegeLocation){
        this.collegeName = collegeName;
        this.collegeLocation = collegeLocation;
    }

    public String getCollegeName(){
        return this.collegeName;
    }

    public String getCollegeLocation(){
        return this.collegeLocation;
    }
}