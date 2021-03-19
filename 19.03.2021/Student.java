package ivge;

public class Student {
    String name = "";
    int number = 1;
    char letter = 'a';

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
}
