public class PasswordChecker {
    private int minLength;
    private int maxRepeatSymbol;

    public void setMinLength(int minLength) throws IllegalAccessException {
        if (minLength <= 0) {
            throw new IllegalAccessException("minLength должен быть больше нуля");
        }
        this.minLength = minLength;
    }

    public void setMaxRepeatSymbol(int maxRepeatSymbol) throws IllegalAccessException {
        if (maxRepeatSymbol <= 0) {
            throw new IllegalAccessException("maxRepeatSymbol должен быть больше нуля");
        }
        this.maxRepeatSymbol = maxRepeatSymbol;
    }

    public boolean verify(String password) throws IllegalAccessException {
        if (minLength == 0 || maxRepeatSymbol == 0) {
            throw new IllegalAccessException("Не указан один из параметров строки");
        }
        int counter = 1;
        String[] array = password.split("");

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                counter++;
            } else {
                counter = 1;
            }
            ;
            if (counter > maxRepeatSymbol) {
                return false;
            }
        }

        return password.length() >= minLength;
    }
}
