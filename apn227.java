//Binary Tree 
// using Pre-order - traversal and print them 
public class apn227 {
    static class Node{
        int data;
        Node left ;
        Node right ; 
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        };
    };

    static class BinaryTree{
        static int idx = -1 ; // for track the index of the Node arr
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){ // -1 ka means null hota h in the index 
                return null;
            };

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root){
        if(root == null){
            return ; 
        };

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
    public static void main(String[] args) {
        int nodes[] = {1, 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1 , -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);

        tree.preorder(root);
    }
}
