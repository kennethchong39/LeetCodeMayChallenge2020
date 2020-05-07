private TreeNode xParent;
private TreeNode yParent;
private int xDepth = -1;
private int yDepth = -1;

public boolean isCousins(TreeNode root, int x, int y) {
    dfs(root, x, y, null, 0);

    return xDepth == yDepth && xParent != yParent;
}

public void dfs(TreeNode root, int x, int y, TreeNode parent, int depth){
    if(root==null){
        return;
    }
    if(x == root.val){
        xParent = parent;
        xDepth = depth;
    } else if (y == root.val) {
        yParent = parent;
        yDepth = depth;
    }

    dfs(root.left, x, y, root, depth+1);
    dfs(root.right, x, y, root, depth+1);
}

/*
 * A cousin = different parent and must be the same depth. 
 * 1. Depth First Search with the root, x, y, and parent, and depth of 0;
 * 2. DFS() --> 
 *     2a. Check the root null then return;
 *     2b. if x equals to same as root.val --> set xParent to parent and xDepth with current depth;
 *     2c. if y equals to same as root.val --> set yParent to parent and yDepth with current depth;
 *   dfs(root.left)
 *   dfs(root.right)
 * Time Complexity O(n)
 * Space Complexity O(n)
 */
