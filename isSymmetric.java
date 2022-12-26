
public class isSymmetric {

    

    public boolean help(TreeNode rootLeft,TreeNode rootRight){
      

        if(rootRight==null || rootLeft==null)
        return rootLeft==rootRight;

        if(rootLeft.val!=rootRight.val)
        return false;

        return help(rootLeft.left,rootRight.right) && help(rootLeft.right,rootRight.left);
        
        
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        
      return help(root.left,root.right);
    }

    public static void main(String[] args) {
       
    
}
}
