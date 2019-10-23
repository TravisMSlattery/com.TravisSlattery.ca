// Travis Slattery
public abstract class Student implements Categorizable{
    String name;
    int age;

    public Student(String name,int age){
        this("unknown",0);
    }
    public Student() {
        setAge(age);
        setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Student Name: %s\nStudents Age: %d",getName(),getAge());
    }

    @Override
    public void setCategory(String category) {

    }

    @Override
    public String getCategory() {
        return null;
    }
}
