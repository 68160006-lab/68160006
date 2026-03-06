import java.util.Scanner;

public class Chess {

    static char[][] board = new char[8][8];
    static boolean whiteTurn = true;

    public static void main(String[] args) {
        initBoard();
        gameLoop();
    }

    // 1. เริ่มต้นกระดาน
    static void initBoard() {

        String[] start = {
                "rnbqkbnr",
                "pppppppp",
                "........",
                "........",
                "........",
                "........",
                "PPPPPPPP",
                "RNBQKBNR"
        };

        for (int i = 0; i < 8; i++) {
            board[i] = start[i].toCharArray();
        }
    }

    // 2. ลูปเกม
    static void gameLoop() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            printBoard();

            System.out.println((whiteTurn ? "White" : "Black") + " move");
            System.out.println("Example: e2 e4  (type exit to quit)");

            String input = sc.nextLine();

            if (input.equals("exit")) break;

            String[] move = input.split(" ");

            if (move.length != 2) {
                System.out.println("Invalid input");
                continue;
            }

            int[] from = parsePos(move[0]);
            int[] to = parsePos(move[1]);

            if (from == null || to == null) {
                System.out.println("Invalid position");
                continue;
            }

            if (isValidMove(from[0], from[1], to[0], to[1])) {

                movePiece(from[0], from[1], to[0], to[1]);
                whiteTurn = !whiteTurn;

            } else {
                System.out.println("Illegal move");
            }
        }

        sc.close();
    }

    // 3. แสดงกระดาน
    static void printBoard() {

        System.out.println("\n  a b c d e f g h");

        for (int i = 0; i < 8; i++) {

            System.out.print(8 - i + " ");

            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println(8 - i);
        }

        System.out.println("  a b c d e f g h\n");
    }

    // 4. เดินหมาก
    static void movePiece(int fr, int fc, int tr, int tc) {

        board[tr][tc] = board[fr][fc];
        board[fr][fc] = '.';
    }

    // 5. แปลงตำแหน่ง เช่น e2
    static int[] parsePos(String pos) {

        if (pos.length() != 2) return null;

        int col = pos.charAt(0) - 'a';
        int row = 8 - (pos.charAt(1) - '0');

        if (row < 0 || row > 7 || col < 0 || col > 7) return null;

        return new int[]{row, col};
    }

    // 6. ตรวจสอบการเดิน
    static boolean isValidMove(int fr, int fc, int tr, int tc) {

        char piece = board[fr][fc];

        if (piece == '.') return false;

        if (whiteTurn && Character.isLowerCase(piece)) return false;
        if (!whiteTurn && Character.isUpperCase(piece)) return false;

        int dr = tr - fr;
        int dc = tc - fc;

        piece = Character.toLowerCase(piece);

        switch (piece) {

            case 'p':
                return pawnMove(fr, fc, tr, tc);

            case 'r':
                return (dr == 0 || dc == 0);

            case 'n':
                return (Math.abs(dr) == 2 && Math.abs(dc) == 1) ||
                        (Math.abs(dr) == 1 && Math.abs(dc) == 2);

            case 'b':
                return Math.abs(dr) == Math.abs(dc);

            case 'q':
                return (dr == 0 || dc == 0) || Math.abs(dr) == Math.abs(dc);

            case 'k':
                return Math.abs(dr) <= 1 && Math.abs(dc) <= 1;
        }

        return false;
    }

    // 7. การเดิน Pawn
    static boolean pawnMove(int fr, int fc, int tr, int tc) {

        int dir = whiteTurn ? -1 : 1;

        if (fc == tc && board[tr][tc] == '.') {

            if (tr - fr == dir) return true;

            if ((whiteTurn && fr == 6 || !whiteTurn && fr == 1)
                    && tr - fr == 2 * dir) return true;
        }

        if (Math.abs(fc - tc) == 1 && tr - fr == dir
                && board[tr][tc] != '.') return true;

        return false;
    }
}
