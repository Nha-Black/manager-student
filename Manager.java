import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Student> list = new ArrayList<>();

    public void add(Student student){
        list.add(student);  
    }
    public void display(){
        for (Student student: list){
            student.print();
        }
    }
    public Student findId(String id){
        for(Student student : list){
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }
    public void sort(){
        for (int i=0; i<list.size()-1; i++)
            for (int j=i+1; j<list.size() ; j++){
                if(list.get(i).getGpa()<list.get(j).getGpa()){
                    swap(list.get(i).list.get(j));
                }
            }
    }
}
