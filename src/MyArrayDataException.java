public class MyArrayDataException extends NumberFormatException  {
    private int row;
    private int column;
    private String val_str;

    public MyArrayDataException(String s, int row, int column, String val_str) {
        super(s+" в строке "+row+" в столбце "+column+ " значение "+val_str+" не может быть приведено к типу");
        this.row = row;
        this.column = column;
        this.val_str = val_str;
    }
}
