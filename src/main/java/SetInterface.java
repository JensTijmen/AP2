public interface SetInterface<E extends Comparable<E>> {
    boolean add(E element);

    int length();

    Set<E> union(Set set);

    Set<E> symmetric_difference(Set set);

    //difference = all elements contained in the 1st but not the 2nd set.
    Set<E> difference(Set<E> otherSet);

    Set<E> intersection(Set set);
}
