public class AladdinCheckers {
    public int aladdinCheckers(String[][] B) {
        int[] MAX = new int[1];
        for(int i = 0; i < B.length; i++) {
            for(int j = 0; j < B[i].length; j++) {
                if(B[i][j] == "O")
                    dfs(B, i, j, 0, MAX);
            }
        }

        return MAX[0];
    }


    public void dfs(String[][] B, int i, int j, int pawns_beaten, int[] MAX) {

        //BASE CASE - OOB OR I JUMPED INTO ALADDIN'S PAWN
        if(Math.min(i,j) < 0 || i >= B.length || j >= B[i].length || B[i][j] == "X")
            return;

        // UPDATE THE MAX
        MAX[0] = Math.max(MAX[0], pawns_beaten);

        if(i > 0) {
            //TOP-LEFT ATTACK
            if(j > 0 && B[i-1][j-1] == "X")
                dfs(B, i-2, j-2, pawns_beaten + 1, MAX);

            // TOP-RIGHT ATTACK
            if(j < B[i].length - 1 && B[i-1][j+1] == "X")
                dfs(B, i-2, j+2, pawns_beaten + 1, MAX);
        }
    }

    public static void main(String[] args) {
        AladdinCheckers s = new AladdinCheckers();
        System.out.println(s.aladdinCheckers(
                new String[][]{{".",".","X",".",".","."},
                        {".",".",".",".",".","."},
                        {".",".",".",".","X","."},
                        {".","X",".",".",".","."},
                        {".",".","X",".","X","."},
                        {".",".",".","O",".","."}}));

        System.out.println(s.aladdinCheckers(
                new String[][]{{"X",".",".",".","."},
                        {".","X",".",".","."},
                        {".",".","O",".","."},
                        {".",".",".","X","."},
                        {".",".",".",".","."}}));
    }

}
