/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        rightV(root, res, 0);
        return res;
    }
    public void rightV(TreeNode cur, List<Integer> res, int curD)
    {
        if(cur == null)
        {
            return;
        }
        if(curD == res.size())
        {
            res.add(cur.val);
        }
        rightV(cur.right, res, curD+1);
        rightV(cur.left, res, curD+1);
    }
}