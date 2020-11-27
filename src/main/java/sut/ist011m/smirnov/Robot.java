package sut.ist011m.smirnov;

public class Robot {
    private Head head;
    private Body body;
    private Legs legs;

    public Robot(Head hd, Body bd, Legs lg) {
        this.head = hd;
        this.body = bd;
        this.legs = lg;
    }

    public void action(){
        head.think();
        legs.run();
        body.move();
    }
}

