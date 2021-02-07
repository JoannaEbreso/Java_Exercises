package TurtleGraphics;

public class Pen {
    private PenPosition penPosition;

    public Pen(){
        penPosition = PenPosition.up;
    }

    public PenPosition getPosition() {
        return penPosition;
    }

    public void setPosition(PenPosition penPosition) {
        this.penPosition = penPosition;
    }
}
