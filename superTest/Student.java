package superTest;

public class Student extends Person{
    int studentID;
    Student(String name,int studentID){
        super(name);
        this.studentID=studentID;

    }
    void DisplayInfo(){
        super.displayInfo();
        System.out.println("studentID:"+studentID);
    }

    public static void main(String[] args) {
        Student std=new Student("amaan",12);
        std.DisplayInfo();
    }
}
