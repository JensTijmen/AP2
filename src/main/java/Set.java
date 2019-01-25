public class Set<E extends Comparable<E>> implements SetInterface {
    private int length;
    private ListInterface<E> elements;

    public boolean add(){
        return false;
    }
    public int length(){
        return 0;
    }
    public Set union(Set set){
        return set;
    }
    public Set symmetric_difference(Set set){
        return set;
    }
    public Set difference(Set set){
        return set;
    }
    public Set intersection(Set set){
        return set;
    }
}
