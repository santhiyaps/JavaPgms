public class ClosesetValueBst {
    public static int findClosestValueInBst(BST tree, int target) {
         return computeClosest(tree, target, tree.value);
    }
        static int computeClosest (BST node,int target, int closestValue){
            if (Math.abs(target - closestValue) > Math.abs(target - node.value)) {
                closestValue = node.value;
            }
            if (target < node.value && node.left != null) {
                return computeClosest(node.left, target, closestValue);
            } else if (target > node.value && node.right != null) {
                return computeClosest(node.right, target, closestValue);
            } else {
                return closestValue;
            }
        }
static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
        this.value = value;
    }

}


    public static void main(String[] args) {
        BST node = new BST(10);
        node.left = new BST(5);
        node.right = new BST(15);
        node.left.left = new BST(2);
        node.left.right = new BST(5);
        node.right.left = new BST(1);
        node.right.left = new BST(13);
        node.right.left.right = new BST(14);
        node.right.right = new BST(22);
        System.out.println(findClosestValueInBst(node, 12));

        /*{"id": "10", "left": "5", "right": "15", "value": 10},
        {"id": "15", "left": "13", "right": "22", "value": 15},
        {"id": "22", "left": null, "right": null, "value": 22},
        {"id": "13", "left": null, "right": "14", "value": 13},
        {"id": "14", "left": null, "right": null, "value": 14},
        {"id": "5", "left": "2", "right": "5-2", "value": 5},
        {"id": "5-2", "left": null, "right": null, "value": 5},
        {"id": "2", "left": "1", "right": null, "value": 2},
        {"id": "1", "left": null, "right": null, "value": 1}*/
    }

}

