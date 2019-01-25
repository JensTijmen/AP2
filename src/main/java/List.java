public class List<E extends Comparable<E>> implements ListInterface<E> {

    private int size;
    private Node last, current, first;

    private class Node {

        E data;
        Node prior, next;

        public Node(E d) {
            this(d, null, null);
        }

        public Node(E data, Node prior, Node next) {
            this.data = data == null ? null : data;
            this.prior = prior;
            this.next = next;
        }

    }

    @Override
    public boolean isEmpty() {
        if( size == 0 ){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public ListInterface<E> init() {
        size = 0;
        first = null;
        current = null;
        last = null;
        return this;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public ListInterface<E> insert(E d) {
        return null;
    }

    @Override
    public E retrieve() {
        return current.data;
    }

    @Override
    public ListInterface<E> remove() {
        return null;
    }

    @Override
    public boolean find(E d) {
        return false;
    }

    @Override
    public boolean goToFirst() {
        if ( isEmpty() ) {
            return false;
        }
        current = first;
        return true;
    }

    @Override
    public boolean goToLast() {
        if ( isEmpty() ) {
            return false;
        }
        current = last;
        return true;
    }

    @Override
    public boolean goToNext() {
        if ( isEmpty() ) {
            return false;
        }
        if ( current == first ) {
            return false;
        }
        current = current.next;
        return true;
    }

    @Override
    public boolean goToPrevious() {
        if ( isEmpty() ) {
            return false;
        }
        if ( current == last ) {
            return false;
        }
        current = current.prior;
        return true;
    }

    @Override
    public ListInterface<E> copy() {

        return null;
    }
}
