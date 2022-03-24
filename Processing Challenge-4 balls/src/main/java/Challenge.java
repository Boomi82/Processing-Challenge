import processing.core.PApplet;


public class Challenge extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 448;
    public static final int DIAMETER = 10;
    float speed_of_ball1= 0f,speed_of_ball2=0f,speed_of_ball3=0f,speed_of_ball4=0f;

    public static void main(String[] args)
    {
        PApplet.main("Challenge");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();

    }

    @Override
    public void draw() {


        drawCircle(speed_of_ball1,HEIGHT/5);
        speed_of_ball1+=0.8;

        drawCircle(speed_of_ball2,(2*HEIGHT)/5);
        speed_of_ball2+=2;
        drawCircle(speed_of_ball3,(3*HEIGHT)/5);
        speed_of_ball3+=4;
        drawCircle(speed_of_ball4,(4*HEIGHT)/5);
        speed_of_ball4+=6;
    }

    private void drawCircle(float x_axis,float y_axis) {
        ellipse(x_axis,y_axis,DIAMETER,DIAMETER);

    }

}
