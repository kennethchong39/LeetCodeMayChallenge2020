private int count;
private int result;
public int kthSmallest(TreeNode root, int k) {
    count = 0;
    dfs(root, k);
    return result;
}

public void dfs(TreeNode root, int k) {
    if(root == null) return;

    dfs(root.left, k);
    count++;
    if(k == count) {
        result = root.val;
    }
    dfs(root.right, k);

}

/*
 * You traverse the tree from dfs in inorder traversal. 
 * Given count to find k, if count == k then set result = root.val
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */
