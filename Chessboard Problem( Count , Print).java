import java.util.*;
public class Main{
    private static List<String> kMove(int n, int row, int col) {
        List<String> moves = new ArrayList<>();
        if (row + 2 < n && col + 1 < n) {
            moves.add("{" + (row + 2) + "-" + (col + 1) + "}");

        }
        if (col + 2 < n && row + 1 < n) {
            moves.add("{" + (row + 1) + "-" + (col + 2) + "}");
        }
        return moves;
    }

    private static List<String> rMove(int n, int row, int col) {
        List<String> moves = new ArrayList<>();
        if (row == 0 || row == n-1 || col == 0 || col == n-1) {
            for (int i = 1; i + col < n; i++) {
                moves.add("{" + row + "-" + (col+i) + "}");
            }
            for (int i = 1; i + row < n; i++) {
                moves.add("{" + (row+i) + "-" + col + "}");
            }
        }
        return moves;
    }

    private static List<String> bMove(int n, int row, int col) {
        List<String> moves = new ArrayList<>();
        if ((col == row) || (col>0 && row>0)) {
            for(int i=1;i+row<n && i+col<n;i++){
				moves.add("{" + (row+i) + "-" + (col+i) + "}");
			}
        }
        return moves;
    }

    private static void findPaths(int n, int row, int col, String ans, List<String> res) {
        if (row == n - 1 && col == n - 1) {
            res.add(ans);
            return;
        }
        List<String> k_move = kMove(n, row, col);
        if (k_move.size() > 0) {
            for (String k : k_move) {
                findPaths(n, k.charAt(1) - '0', k.charAt(3) - '0', ans + "K" + k, res);
            }
        }
        
        List<String> r_move = rMove(n, row, col);
        if (r_move.size() > 0) {
            for (String r : r_move) {
                findPaths(n, r.charAt(1) - '0', r.charAt(3) - '0', ans + "R" + r, res);
            }
        }
        
        List<String> b_move = bMove(n, row, col);
        if (b_move.size() > 0) {
            for (String b : b_move) {
                findPaths(n, b.charAt(1) - '0', b.charAt(3) - '0', ans + "B" + b, res);
            }
        }
    }
    public static void main(String args[]) {
        // Your Code Here
		int n = new Scanner(System.in).nextInt();
        List<String> res = new ArrayList<>();
        findPaths(n, 0, 0, "{0-0}", res);
        for (String s : res) System.out.print(s + " ");
        System.out.println("\n" + res.size());
    }
}
