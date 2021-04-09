package ivge;

public class Computer {
    private Hard hard;
    private MotherBoard motherBoard;
    private Ram ram;
    private Box box;

    public Computer() {
    }

    public Hard getHard() {
        return hard;
    }

    public void setHard(Hard hard) {
        this.hard = hard;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hard=" + hard +
                ", motherBoard=" + motherBoard +
                ", ram=" + ram +
                ", box=" + box +
                '}';
    }

    public boolean isComplete(){
        return (!(box == null || ram == null || motherBoard == null || hard == null));
    }
}
