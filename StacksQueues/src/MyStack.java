import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Student> myStack = new ArrayList<>();
    private int size;

    public MyStack() {
        this.size = 0;
        this.myStack = null;
    }

    public void push(Student o){
        myStack.add(o);
    }
    public Student pop(){
        return myStack.remove(getSize()-1);
    }
    public Student peek(){
        return myStack.get(getSize()-1);
    }
    public int getSize(){
        return myStack.size();
    }
}
