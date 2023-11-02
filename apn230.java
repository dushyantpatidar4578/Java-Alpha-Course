//Binary Tree 
// using Level-order - traversal and print them 
import java.util.*;
public class apn230 {
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

        public static void levelOrder(Node root){
            if(root == null){
                return ; 
            };
    
            Queue<Node> q = new LinkedList<>();
    
            q.add(root);
            q.add(null); // next line k liye use kiya
    
            while(!q.isEmpty()){
                Node currNode = q.remove(); // ek ek krke bahar nikal lenge 
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.println(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
}
    public static void main(String[] args) {
        int nodes[] = {1, 2 , 4 , -1 , -1 , 5 , -1 , -1 , 3 , -1 , 6 , -1 , -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        

        tree.levelOrder(root);
    }
}

