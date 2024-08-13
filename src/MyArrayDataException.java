public class MyArrayDataException extends Exception {
    public MyArrayDataException() {
        super();
    }

    public MyArrayDataException(int i, int j, String value) {
        super("Неверные данные в ячейке [" + i + "][" + j + "]: " + value);
    }
}
