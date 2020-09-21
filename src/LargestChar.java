public class LargestChar {

    public static void main(String[] args) {
        String s="admeDCAB";
        for( char c:s.toCharArray()){

        }
    }
    private static int getLargestMAlignedSubset(int[] array, int M) {
        int result = 0;
        if (array == null || array.length == 0) return 0;

        int length = array.length;
        // aggregate numbers by the reminder
        int[] subsetSizeArray = new int[M];
        for (int num : array) {
            // get reminders, and convert non-positive reminders to non-negative
            int index = num < 0 ? (num % M + M) % M : num % M;
            result = Math.max(++subsetSizeArray[index], result);
        }
        return result=result<2?0:result;
    }
    public String replaceQuestionMark(String str){
        if(str.length()==0){
            return str;
        }
        char[] arr = str.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i]=='?'){
                char pre = '?';
                char post = '?';
                if(i>0){
                    pre = arr[i-1];
                }
                if(i<arr.length-1){
                    post = arr[i+1];
                }
                char rep = 'a';
                while((rep==pre || rep==post)&& rep<='z'){
                    rep = (char)(rep+1);
                }
                arr[i] = rep;
            }
        }
        return new String(arr);
    }

}
class goodNodes{
    int counter = 0;
    public int goodNodes(TreeNode root) {
        // root value is current maximum. so root will be the first in list of good nodes
        traverse(root, root.val);
        return counter;
    }
    // go trough each node and compare it to current maximum
    private void traverse(TreeNode node, int max) {
        if (node == null) return;
        // if node value is greater or equal - counter increased
        if (node.val >= max) {
            counter++;
            // next maximum value may increase
            max = node.val;
        }
        traverse(node.left, max);
        traverse(node.right, max);
    }
}
