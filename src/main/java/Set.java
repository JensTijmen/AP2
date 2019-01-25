public class Set<E extends Comparable<E>> implements SetInterface<E> {
    private int size;
    private ListInterface<E> elements;


    public Set() {
        this.size = 0;
        this.elements = new List<E>();
    }

    @Override
    public boolean add(E element){
        this.elements = this.elements.insert(element);
        size++;
        return true;
    }

    @Override
    public int length(){
        return 0;
    }
    @Override
    public Set<E> union(Set set){
        return set;
    }
    @Override
    public Set<E> symmetric_difference(Set set){
        return set;
    }
    //difference = all elements contained in the 1st but not the 2nd set.
    @Override
    public Set<E> difference(Set<E> otherSet) {
        Set<E> differenceSet = new Set<E>();
//
//        boolean elementSet1PresentInSet2;
//
//        for (int i = 0; i < size; i++) {
//            elementSet1PresentInSet2 = false;
//
//            for(int j = 0; j < otherSet.size; j++ ){
//                if( stringArray[i].equals(otherSet.stringArray[j]) ) {
//                    elementSet1PresentInSet2 = true;
//                }
//            }
//
//            if ( !elementSet1PresentInSet2 ){
//                differenceSet.add(this.stringArray[i]);
//            }
//        }
        return differenceSet;
    }

    @Override
    public Set<E> intersection(Set set){
        return set;
    }

//    /*ASSINGMENT 1*/
//
//
//
//
//
//
//
//
//    /*ASSINGMENT 1*/
//
//    String[] stringArray = new String[MAX_NUM_IDENTIFIERS];
//    private int sizeSet = 0;
//
//    @Override
//    public int get_size(){
//        return size;
//    }
//
//    //intersection: all elements contained in both sets.
//    //intersection is everything that is in set1 and also in set2
//    @Override
//    public Set intersection(Set otherSet) {
//        Set intersectionSet = new Set();
//
//        boolean elementSet1PresentInSet2;
//
//        for (int i = 0; i < size; i++) {
//            elementSet1PresentInSet2 = false;
//
//            for(int j = 0; j < otherSet.size; j++ ){
//                if( stringArray[i].equals(otherSet.stringArray[j]) ) {
//                    elementSet1PresentInSet2 = true;
//                }
//            }
//
//            if ( elementSet1PresentInSet2 ){
//                intersectionSet.add(this.stringArray[i]);
//            }
//        }
//
//        return intersectionSet;
//    }
//
//    /*union = all elements of both sets. (N.B. sets do not contain duplicate elements per definition.).
//    union = differenceSet + second set, It is this easy because the manual says 'Sets do not contain duplicate elements
//    per definition) */
//    @Override
//    public Set union(Set secondSet) {
//        Set unionSet = new Set();
//        //int position =0;
//        for (int position = 0; position< size; position++){
//            unionSet.add(this.stringArray[position]);
//        }
//        //If for-loop from above is finished, set2 has to be added to unionSet
//        for(int i = 0; i <secondSet.size; i++ ){
//            unionSet.add(secondSet.stringArray[i]);
//        }
//
//        return unionSet;
//    }
//
//    //symmetric difference: all elements of both sets that are not contained in he intersection.
//    //symmetric difference = ( set1 + set2 ) - intersection.
//    @Override
//    public Set symmetric_difference(Set set2, Set intersection) {
//        Set symdifSet = new Set();
//
//        boolean elementSet1PresentInIntersection;
//        boolean elementSet2PresentInIntersection;
//
//        for (int i = 0; i< size; i++) {
//            elementSet1PresentInIntersection = false;
//
//            for (int j = 0; j < intersection.size; j++) {
//                if (stringArray[i].equals(intersection.stringArray[j])) {
//                    elementSet1PresentInIntersection = true;
//                }
//            }
//            if (!elementSet1PresentInIntersection) {
//                symdifSet.add(this.stringArray[i]);
//            }
//        }
//
//        for (int i = 0; i<set2.size; i++) {
//            elementSet2PresentInIntersection = false;
//
//            for (int j = 0; j < intersection.size; j++) {
//                if (set2.stringArray[i].equals(intersection.stringArray[j])) {
//                    elementSet2PresentInIntersection = true;
//                }
//            }
//            if (!elementSet2PresentInIntersection) {
//                symdifSet.add(set2.stringArray[i]);
//            }
//        }
//
//        return symdifSet;
//    }
//
//    @Override
//    public void print() {
//        System.out.print('{');
//        if(size > 0) {
//            for (int i = 0; i < size; i++ ) {
//                if(i == size - 1){
//                    System.out.println(stringArray[i] + "}");
//                } else {
//                    System.out.print(stringArray[i] + " ");
//                }
//            }
//        } else {
//            System.out.println("}");
//        }
//    }
//
//    /*ASSINGMENT 1*/

}
