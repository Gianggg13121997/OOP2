package Manager;

import java.util.ArrayList;

public interface IManager<E>{
    void add(E e);
    void remove(int id);
    void findByIndex(int id);
    ArrayList<E> getAll();
}
