package problem3;

public interface MyCollection {
    public int size();

    public boolean isEmpty();

    public boolean contains(Object o);

    public void add(Object o);
    
    public void remove(Object o);

    public void clear();

    public Object[] toArray();

    public boolean containsAll(MyCollection coll);

    public boolean addAll(MyCollection coll);

    public boolean removeAll(MyCollection coll);

    public boolean retainAll(MyCollection coll);
} 
