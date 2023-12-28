import processing.core.PApplet;

public class MySketch_4balls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int axis1=0,axis2=0,axis3=0,axis4=0;

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup(){

    }

    public void draw(){
        ellipse(axis1, (float) HEIGHT/5 , DIAMETER, DIAMETER);
        axis1++;
        ellipse(axis2, (float) (HEIGHT/5)*2 , DIAMETER, DIAMETER);
        axis2+=2;
        ellipse(axis3, (float) (HEIGHT/5)*3 , DIAMETER, DIAMETER);
        axis3+=3;
        ellipse(axis4, (float) (HEIGHT/5)*4 , DIAMETER, DIAMETER);
        axis4+=4;
    }
    public static void main(String[] args){
        PApplet.main("MySketch_4balls",args);
    }
}
