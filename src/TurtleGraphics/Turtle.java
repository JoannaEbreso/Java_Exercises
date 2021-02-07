package TurtleGraphics;

public class Turtle {
    private Pen pen;
    private TurtlePosition turtlePosition;
    private Direction direction;


    public Turtle(){
        pen = new Pen();
        turtlePosition = new TurtlePosition(0,0);
        direction = Direction.front;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public TurtlePosition getTurtlePosition() {
        return turtlePosition;
    }

    public void setTurtlePosition(TurtlePosition turtlePosition) {

        this.turtlePosition = turtlePosition;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {

        this.direction = direction;
    }

//    public void TurnRight(){
//
//    }

//    public void TurnLeft(){
//
//    }

}
