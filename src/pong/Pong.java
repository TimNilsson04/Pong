package pong;

public class Pong {
  int width = 500;
  int height = 250;
  Paddle paddle1 = new Paddle(0, 30, 25);
  Paddle paddle2 = new Paddle(495, 30, 25);
  Ball ball = new Ball(250,125,1,1);

  public void update(){
      ball.move();
      checkCollision();
    }
    public void checkCollision(){
        if (ball.y == height || ball.y == 0){
          ball.bounce();
        }
        if (ball.y == paddle1.y && ball.x == paddle1.x){
          ball.bouncePaddle();
        }
        if (ball.y == paddle2.y && ball.x == paddle2.x){
          ball.bouncePaddle();
        }

    }

  public static void main(String[] args) {

  }
}
