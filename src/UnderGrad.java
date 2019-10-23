import javax.swing.*;
//import java.util.ArrayList;

public class UnderGrad extends Student{

    private String subjects;
    //ArrayList<subjects> = new ArrayList<subjects>;

    private String category;

    public UnderGrad(String[] subjects,String category){
        super("unknown",0);
        setCategory("Full-Time");
        setSubjects("unknown");
    }
    //while(subjects != )
    //{
        //for(int i=0; i <subjects.size()-1; i++ )

    //subjects = JOptionPane.showInputDialog("Please enter your subject");


    //}

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Student Name: %s\nStudents Age: %d\nSubjects: %s\nCatergory %s",getName(),getAge(),getSubjects(),getCategory());
    }

}
