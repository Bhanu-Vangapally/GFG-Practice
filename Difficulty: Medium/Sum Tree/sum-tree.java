/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    boolean isSumTree(Node r) {
        // Your code here
        if(r==null||(r.left==null && r.right==null)) return true;
        int ls=0,rs=0;
        ls=sum(r.left);
        rs=sum(r.right);
        return (ls+rs==r.data)&&
          isSumTree(r.left) &&
          isSumTree(r.right);
    }
    public static int sum(Node r){
    if (r == null)
        return 0;
    return r.data + sum(r.left) + sum(r.right);
        // return checkSumTree(root).isSumTree;
    }
//     Result checkSumTree(Node node) {
//     // Base case: Empty tree
//     if (node == null)
//         return new Result(true, 0);

//     // Base case: Leaf node
//     if (node.left == null && node.right == null)
//         return new Result(true, node.data);

//     // Recurse for left and right subtrees
//     Result left = checkSumTree(node.left);
//     Result right = checkSumTree(node.right);

//     // Check if current node satisfies Sum Tree property
//     boolean isSum = left.isSumTree && right.isSumTree &&
//                     (node.data == left.sum + right.sum);

//     // Calculate the total sum for the current subtree
//     int totalSum = left.sum + right.sum + node.data;

//     return new Result(isSum, totalSum);
// }
}
// class Result {
//     boolean isSumTree;
//     int sum;

//     Result(boolean isSumTree, int sum) {
//         this.isSumTree = isSumTree;
//         this.sum = sum;
//     }
// }