public abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece(String color) { // конструктор, принимающий цвет фигуры
        this.color = color;
    }

    abstract String getColor(); // геттер цвета фигур
    abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn); // перечисление позиций, доступных для хода
    abstract String getSymbol(); // метод, выводящий в консоль букву, отображающую фигуру на доске



}
