package com.tutorial.main;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable{

  private static final long serialVersionUID = -2408406005333728354L;

  public static final int WIDTH = 640, HEIGHT = WIDTH;

  private Thread thread;
  private boolean running = false;


  public Game(){
    new Window(WIDTH,HEIGHT,"Let's Build a Game",this);
  }

  public synchronized void start(){
    thread = new Thread(this);
    thread.start();
    running = true;
  }

  public synchronized void stop(){
    try {
      thread.join();
      running = false;
    }catch(Exception e){
      e.printStackTrace();
    }
  }

  public void run(){
    long lastTime = System.nanoTime();
    double amountOfTicks = 60.0;
    double ns = 1000000000 / amountOfTicks;
    double delta = 0;
    long timer = System.currentTimeMillis();
    int frames = 0;
    while (running){
      long now = System.nanoTime();
      delta += (now - lastTime) / ns;
      lastTime = now;
      while (delta >= 1){
        tick();
        delta--;
      }
      if (running)
        render();
      frames++;

      if(System.currentTimeMillis() - timer > 1000){
        timer += 1000;
        System.out.println("FPS: " + frames);
        frames = 0;
      }
    }
    stop();
  }


  private void tick() {

  }

  private void render() {
    BufferStrategy bs = this.getBufferStrategy();
    if(bs == null){
      this.createBufferStrategy(3);
      return;
    }

    Graphics g =bs.getDrawGraphics();

    g.dispose();
    bs.show();
  }

  public static void main(String[] args) {
    new Game();
  }
}
