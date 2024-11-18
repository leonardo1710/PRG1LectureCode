package at.ac.fhcampuswien.lecture10.bb02122024;

public interface GenericList <E> {
    boolean add(E el);  // type parameter -> instantiate with any reference type, e.g. GenericList<String>, GenericList<Number>
    E get(int index);
}
