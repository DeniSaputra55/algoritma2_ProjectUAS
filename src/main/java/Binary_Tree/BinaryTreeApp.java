package Binary_Tree;
public class BinaryTreeApp {
 public static void main(String[] args) {
        BinaryTree binary = new BinaryTree();
        //membuat node tree
        TreeNode node;
        node = new TreeNode(50);
        binary.insert(node);
        
        node = new TreeNode(30);
        binary.insert(node);
        
        node = new TreeNode(20);
        binary.insert(node);
        
        node = new TreeNode(40);
        binary.insert(node);
        
        node = new TreeNode(70);
        binary.insert(node);
    
        System.out.println("Traversal dengan Inorder : "); //inorder
        binary.inOrder();
        System.out.println("\nTraversal dengan Preorder : " ); //preorder
        binary.preOrder();
        System.out.println("\nTraversal dengan Postorder : " ); //postorder
        binary.postOrder();
        System.out.println(" ");
        System.out.println("Nama saya adalah DENI SAPUTRA ");
    }    
}
