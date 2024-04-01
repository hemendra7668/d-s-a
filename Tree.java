public class Tree {
    Tree lefTree;
    int data;
    Tree Right;

    public Tree(int data) {
        this.data = data;
        this.lefTree = lefTree;
        this.Right = Right;
    }

}

class Binarytree {

    public Tree root;

    public static void main(String[] args) {
        Binarytree bt = new Binarytree();
        bt.insert_levelwise(25);
    }

    public boolean is_empty() {
        root = null;
        return true;
    }

    public void insert_levelwise(int data) {
        Tree tmp = new Tree(data);
        if (is_empty()) {
            root = tmp;
        } else {

        }
    }

    public void display_infix() {
        if (is_empty()) {
            return;
        } else {

            // while (root!= null) {

            // root = root.lefTree;

            // }

        }
    }
}
