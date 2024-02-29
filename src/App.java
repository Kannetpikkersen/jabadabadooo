import processing.core.*;

public class App extends PApplet {

    int c;
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        App myApp = new App();
        myApp.runSketch();
    }

    public void settings(){
        size(600,400);
    }

    public void setup(){
        c = color(255,0,0);

    }

    public void draw(){
        background(c);
    }
}
