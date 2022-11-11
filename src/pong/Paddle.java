package pong;

public class Paddle {
    int x;
    int y;
    int width;

    public Paddle(int x, int y, int width) {
        this.x = x;
        this.y = y;
        this.width = 5;
    }

    public void moveUp() {
        y--;
    }
    public void moveDown() {
        y++;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public static void main(String[] args) {

    }
}
