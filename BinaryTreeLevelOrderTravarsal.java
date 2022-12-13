import java.util.*;
public class BinaryTreeLevelOrderTravarsal {

    static class Node{

        int data;
        Node left;
        Node right;

        Node(){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }

    static class BinaryTree{
       
        public static Node buildTree(int nodes[]){
             int i=-1;
            i++;
            if(nodes[i]==-1)
            return null;
        
            Node newNode=new Node(nodes[i]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }

     public List<List<Integer>> solution(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
         if (root == null) return ans;
         Deque<Node> queue = new ArrayDeque<>();
         queue.add(root);
         while (!queue.isEmpty()) {
             int qlen = queue.size();
             List<Integer> row = new ArrayList<>();
             for (int i = 0; i < qlen; i++) {
                 Node curr = queue.poll();
                 row.add(curr.data);
                 if (curr.left != null) queue.add(curr.left);
                 if (curr.right != null) queue.add(curr.right);
             }
             ans.add(row);
         }
         return ans;
     }
public static void main(String[] args) {
    int nodes[]={3,9,20,-1,-1,15,7};
    BinaryTree tree=new BinaryTree();
    Node root=tree.buildTree(nodes);
    System.out.println(root);
   System.out.println(tree.solution(root));
}
    
}