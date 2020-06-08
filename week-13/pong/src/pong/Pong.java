package pong;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.util.Random;
import java.util.Timer;

@SuppressWarnings({ "serial", "unused" })
public class Pong extends Canvas {
    Point delta;
    Ellipse2D.Double ball;
    Rectangle paddle1;
    Rectangle paddle2;
    int scoreP1;
    int scoreP2;

    public static void main(String[] args) {
        JFrame win = new JFrame("Pong");
        win.setSize(1010, 735);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new Pong());
        win.setVisible(true);
    }

    public Pong() {
        enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
        requestFocus();

        ball = new Ellipse2D.Double(500, 350, 20, 20);
        delta = new Point(-5, 5);
        paddle1 = new Rectangle(50, 250, 20, 200);
        paddle2 = new Rectangle(900, 250, 20, 200);
        scoreP1 = scoreP2 = 0;


        Timer t = new Timer(true);
        t.schedule(new java.util.TimerTask() {
            public void run() {
                doStuff();
                repaint();
            }
        }, 10, 10);

    }

    // Player1 and Player2 strings 
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // Ball 
        g2.setColor(Color.black);
        g2.fill(ball);

        // Paddle 
        g2.setColor(Color.blue);
        g2.fill(paddle1);

        g2.setColor(Color.green);
        g2.fill(paddle2);

        // ScoreBoard
        g2.setColor(Color.blue);
        g2.drawString("Score: " + scoreP1, 200, 40);

        g2.setColor(Color.green);
        g2.drawString("Score: " + scoreP2, 700, 40);

    }

     // key press event
    public void processKeyEvent(KeyEvent e) {
        if (e.getID() == KeyEvent.KEY_PRESSED) {
        	// Player1 W(up)S(down)
            if (e.getKeyCode() == KeyEvent.VK_W) {
                paddle1.y -= 100;
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                paddle1.y += 100;
            }
            // Player2 P(up)L(down)
            if (e.getKeyCode() == KeyEvent.VK_P) {
                paddle2.y -= 100;
            }
            if (e.getKeyCode() == KeyEvent.VK_L) {
                paddle2.y += 100;
            }
        }
    }

    public void doStuff() {
        ball.x += delta.x;
        ball.y += delta.y;

        //setting bounds to window edge
        if (paddle1.y < 5)
            paddle1.y = 5;
        if (paddle1.y > 495)
            paddle1.y = 495;
        if (paddle2.y < 5)
            paddle2.y = 5;
        if (paddle2.y > 495)
            paddle2.y = 495;

        // and bounce if we hit a wall
        if (ball.y < 0 || ball.y + 20 > 700)
            delta.y = -delta.y;
        if (ball.x < 0)
            delta.x = -delta.x;

        // check if the ball is hitting the paddle
        if (ball.intersects(paddle1))
            delta.x = -delta.x;

        if (ball.intersects(paddle2))
            delta.x = -delta.x;

        // check for scoring
        if (ball.x > 1000) {
            ball.x = 500;
            ball.y = 350;
            delta = new Point(-5, 5);
            scoreP1++;
        }
        if (ball.x < 00) {
            ball.x = 500;
            ball.y = 350;
            delta = new Point(5, -5);
            scoreP2++;
        }

    }

    public boolean isFocusable() {
        return true;
    }
}

