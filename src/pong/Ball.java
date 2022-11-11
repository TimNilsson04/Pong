package pong;

public class Ball {
    int x;
    int y;
    int vx;
    int vy;

        public Ball(int x, int y, int vx, int vy) {
             this.x = x;
             this.y = y;
             this.vx = 1;
             this.vy = 1;
        }
         public void move() {
            x += vx;
            y += vy;
        }
         public void bounce() {
            vy = -vy;
        }
        public void bouncePaddle() {
            vx = -vx;
        }

    public static void main(String[] args) {

    }
}
