public class heightCountSumDiamOfTree {
    
    public static class Node{
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    //Height of a Tree  O(n)
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }

    //Count Node of a Tree  O(n)
    public static int count(Node root) {
        if(root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount + 1;
    }

    //Sum of Nodes  O(n)
    public static int sum(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.data;
    }

    //Diameter of a Tree [Approach 1]  O(n^2)
    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHeight = height(root.right);
        
        int selfDiam = leftHeight + rightHeight + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    //Diameter of a Tree [Approach 2]  O(n)
    public static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter2(Node root) {
        if(root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        /*         
         *           1
         *          / \
         *         2   3
         *        / \ / \
         *        4 5 6 7
         */
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of a Tree = " + height(root));

        System.out.println("Count of Nodes in a Tree = " + count(root));

        System.out.println("Total Sum of Nodes = " + sum(root));

        System.out.println("Diameter of Tree using Approach 1 = " + diameter(root));

        System.out.println("Diameter of Tree using Approach 2 = " + diameter2(root).diam);

    }
}
