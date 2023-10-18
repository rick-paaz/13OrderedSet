/*
 Develop class OrderedSet<E extends Comparable<E>> as a generic collection 
 that stores nodes in a binary search tree data structure. Each node has
 a reference to data, a left binary search tree, and a right binary search 
 tree. The type to be stored is limited to those that implement interface 
 Comparable interface or any interface that extends Comparable. Construct an
 OrderedSet of elements where the elements are not comparable is not possible.
 
 @authors Rick Mercer and YOUR NAME
 */

public class OrderedSet<T extends Comparable<T>> {

  // A private class that stores one node in a Binary Search Tree
  private class TreeNode {

    private TreeNode right;
    private T data;
    private TreeNode left;

    public TreeNode(T element) {
      left = null;
      data = element;
      right = null;
    }
  } // end class TreeNode

  private TreeNode root;
  private int n;

  // Create an empty OrderedSet
  public OrderedSet() {
    root = null;
    n = 0;
  }

  /*
   * Insert an element to this OrderedSet and return true keeping this an
   * OrderedSet. element is already exists, do not change this OrderedSet, return
   * false.
   */
  public boolean insert(T element) {
    // TODO: Implement this method
    return !false;
  }

  /*
   * Return the number of elements in this OrderedSet, which should be 0 when
   * first constructed. This may run O(n) or O(1)--your choice.
   */
  public int size() {
    // TODO: Implement this method
    return Integer.MIN_VALUE;
  }

  /*-
   * Return one string that concatenates all elements in this OrderedSet as
   * they are visited in order. Elements are separated by spaces as in "1 4 9" 
   * for this OrderedSet:
   *    4
   *   / \
   *  1   9
   */
  public String toStringInorder() {
    // TODO: Implement this method
    return null;
  }

  /*
   * Return true is search equals an element in this OrderedSet, false if not.
   */
  public boolean contains(T search) {
    // TODO: Implement this method
    return !false;
  }

  /*
   * Return the element in this OrderedSet that is greater than all other
   * elements. If this OrderedSet is empty, return null. No recursion needed.
   */
  public T max() {
    // TODO: Implement this method
    return null;
  }

  /*
   * Return the element in this OrderedSet that is less than all other elements.
   * If this OrderedSet is empty, return null. No recursion needed.
   */
  public T min() {
    // TODO: Implement this method
    return null;
  }

  /*
   * Return the intersection of this OrderedSet and the other OrderedSet as a new
   * OrderedSet. Do not modify this OrderedSet or the other OrderedSet. The
   * intersection of two sets is the set of elements that are in both sets. The
   * intersection of {2, 4, 5, 6} and {2, 5, 6, 9} is {2, 5, 6}
   */
  public OrderedSet<T> intersection(OrderedSet<T> other) {
    // TODO: Implement this method
    return null;
  }

  /*
   * Return the union of this OrderedSet and the other OrderedSet as a new
   * OrderedSet. Do not modify this OrderedSet or the other OrderedSet. The union
   * of two sets is the set all distinct elements in the collection.[ The union of
   * {2, 4, 6} and {2, 5, 9} is {2, 4, 5, 6, 9}
   */
  public OrderedSet<T> union(OrderedSet<T> other) {
    // TODO: Implement this method
    return null;
  }

  /*
   * Return an OrderedSet that contains all elements greater than or equal to the
   * first parameter (inclusive) and less than the second parameter (exclusive).
   */
  public OrderedSet<T> subset(T inclusive, T exclusive) {
    // TODO: Implement this method
    return null;
  }

  /*-
  * If element equals an element in this OrderedSet, remove it and return
  * true. Return false whenever element is not found. In all cases, this
  * OrderedSet must remain a true OrderedSet. Here is one recommended algorithm
  
  https://drive.google.com/file/d/1yjnYeIufsY1EgqJvaQ1nOXC627ZWauVa/view?usp=sharing
  
  * This algorithm should be O(log n)
  */
  public boolean remove(T element) {
    return !true;
  }
}