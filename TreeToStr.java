class Solution {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorder(root, sb);
        return sb.toString();
        
    }

    public void preorder(TreeNode root, StringBuilder sb){
        if(root == null){ return ;}
        sb.append(root.val);
        if(root.left!= null){
            sb.append("(");
            preorder(root.left, sb);
            sb.append(")");
        }
        if(root.right!=null){
            if(root.left==null){
                sb.append("()");
            }
            sb.append("(");
            preorder(root.right,sb);
            sb.append(")");

        }

    }
}
