package ivge;

public class Student {
    private String name = "";
    private int number = 1;
    private char letter = 'a';

    Student(String name)
    {
        this(name, 1, 'a');
    }

    Student(String name, int number)
    {
        this(name, number, 'a');
    }

    Student(String name, int number, char letter)
    {
        this.name = name;
        this.number = number;
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
