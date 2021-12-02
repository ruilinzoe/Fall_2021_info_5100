import java.util.LinkedList;

public class SynchronizedLinkedList<T>{
    private LinkedList<Integer> list;
    private Object lock;

    public SynchronizedLinkedList(){
        this.lock=new Object();
        this.list=new LinkedList<>();
    }
    public void addAtPosition(int index, int element){
        synchronized (lock){
            list.add(index,element);
        }
    }
    public void removeAtPosition(int index, int element){
        synchronized (lock){
            list.remove(index);
        }
    }
    public int getFirst() {
        synchronized (lock){
            return list.indexOf(0);
        }
    }
    public int getLast() {
        synchronized (lock){
            return (int) list.getLast();
        }
    }
    public int size(){
        synchronized (lock){
            return list.size();
        }
    }
}

