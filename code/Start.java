import java.util.Iterator;

class Start {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add("Hello");
        q.add("Welcome");
        while(q.hasNext()) {
            Object o = q.next();
            System.out.println(o);
        }
    }
}

class Queue implements Iterator {
    
    Object[] data = new Object[5];
    int size = 0;
    int count = 0;
    
    void add(Object x) {
        data[size] = x;
        size++;
    }
    
    public boolean hasNext() {
        return count < size;
    }
    
    public Object next() {
        Object temporary = data[count];
        count++;
        return temporary;
    }
}