public class Horse extends ChessPiece { // класс коня наследуется от общего класса всех фигур

    public Horse(String color) {
        super(color);
    }

    @Override
    String getColor() {
        return this.color;
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)) {
            if (line != toLine && column != toColumn && (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].color.equals(this.color)) && chessBoard.board[line][column] != null) {
                // проверка, что клетка, на которую ссылаются введенные пользователем координаты пуста, что введенные пользователем координаты не должны быть такими же, как те, на которых фигура уже стоит, или
                // что на этой клетке уже стоит фигура не ее цвета
                if (!chessBoard.board[line][column].equals(this)) {
                    return false;
                }
                int[][] positions = new int[][]{
                        {line - 2, column - 1}, {line - 2, column + 1},
                        {line + 2, column - 1}, {line + 2, column + 1},
                        {line - 1, column - 2}, {line - 1, column + 2},
                        {line + 1, column - 2}, {line + 1, column + 2}};

                for (int i = 0; i < positions.length; i++) {
                    if (positions[i][0] == toLine && positions[i][1] == toColumn)
                        return true;
                }
            }


            return false;
        }

        return false;
    }

    public boolean checkPos(int pos) {
        if (pos >= 0 && pos <= 7) {
            return true;
        } return false;
    }



    @Override
    String getSymbol() {
        return "H";
    }
}

