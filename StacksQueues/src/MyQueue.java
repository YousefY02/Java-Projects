import java.util.LinkedList;
import java.util.List;
public class MyQueue {
    private List<Student> myQueue = new LinkedList<>();
    private int size;

    public MyQueue() {
        this.myQueue = null;
        this.size = 0;
    }
    public void enqueue(Student o){
        myQueue.addLast(o);
    }
    public Student dequeue(){
        return myQueue.removeFirst();
    }
    public boolean findElement(String name){
        for (int i = 0; i < getSize()-1 ; i++) {
            myQueue.get(i).getaNum().equals(name);
        }
        return false;
    }
    public int getSize(){
        return myQueue.size();
    }
}
