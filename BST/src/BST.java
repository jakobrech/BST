public class BST <E extends Comparable<E>>{

    private TreeNode<E> root;

    public BST(){

        this.root = null;

    }

    public void insert(E data){

        if(root == null){

            root = new SimpleTreeNode<E>(data);

        }

        else{

            insertRecursively(root,data);

        }

    }

    private TreeNode<E> insertRecursively(TreeNode<E> current, E data){

        if(current == null){

            return new SimpleTreeNode<E>(data);

        }
        if(data.compareTo(current.getData())<0){

            current.setLeft(insertRecursively(current.getLeft(), data));

        }
        else if(data.compareTo(current.getData())>0){

            current.setRight(insertRecursively(current.getRight(), data));

        }
        return current;

    }

    public void iOT(){

        iOTRec(root);

    }

    private void iOTRec(TreeNode<E> current){

        if(current != null){

            iOTRec(current.getLeft());
            System.out.print(current.getData() + " ");
            iOTRec(current.getRight());

        }

    }

    private void posOTRec(TreeNode<E> current){

        if(current != null){

            posOTRec(current.getLeft());
            posOTRec(current.getRight());
            System.out.print(current.getData() + " ");

        }

    }

    private void preOTRec(TreeNode<E> current){

        if(current != null){


            System.out.print(current.getData() + " ");
            preOTRec(current.getLeft());
            preOTRec(current.getRight());

        }

    }

    /*

q1
a. Which node is the root? - /user/rt/courses/
b. What are the internal nodes? - cs016/ cs252/ homeworks/ programs/ projects/ papers/ demos/
c. How many descendants does node cs016/ have? - 9
d. How many ancestors does node cs016/ have? - 1
e. What are the siblings of node homeworks/? - programs/ grades
f. Which nodes are in the subtree rooted at node projects/? - papers/ demos/
g. What is the depth of node papers/? - 3
h. What is the height of the tree? - 5

     */

    /*

    q2
    I didn't understand the question and this is what chat gpt said to do

          *
        /   \
       /     \
      /       \
     /         \
    /           \
   +             *
  / \           / \
 /   \         /   \
5     2       -     8
             / \
            +   -
           /   / \
          2   9   -
               / \
              7   1

     */

    /*

    q3
    -/*+313+-952+*3-746

    q4
    31+3*95-2+/374-*6+-

     */

    /*

    q5
      E
     / \
    M   U
   /   / \
  A   N   F
   \     /
    X   X

     */

}
