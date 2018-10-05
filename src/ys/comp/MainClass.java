package ys.comp;

/// 테트리스
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

abstract class Shape {
 abstract void draw(Graphics g);
}

class MyRect extends Shape {
 static int WIDTH = 40;
 private int i, j;
 private int mcolor = 0;
 private Color mColorArray[];

 MyRect() {
  mColorArray = new Color[10];
  mColorArray[0] = Color.GREEN; // 테두리
  mColorArray[1] = Color.YELLOW; // 노랑
  mColorArray[2] = Color.RED; // 빨강
  mColorArray[3] = Color.BLUE; // 파랑
  mColorArray[8] = Color.GRAY; // 배경
  mColorArray[9] = Color.BLACK; // 검정 도형테두리라인
 }

 public void setColor(int mcolor) {
  this.mcolor = mcolor;
 }

 public void setij(int a, int b) {
  i = a;
  j = b;
 }

 @Override
 void draw(Graphics g) {
// TODO Auto-generated method stub
  if (mcolor < 0) {
   g.setColor(mColorArray[8]);
  } else {
   g.setColor(mColorArray[mcolor]);
  }

  g.fillRect(j * WIDTH, i * WIDTH, WIDTH, WIDTH);
  g.setColor(mColorArray[9]);
  g.drawRect(j * WIDTH, i * WIDTH, WIDTH, WIDTH);
 }

}

//Timer timer = new Timer();
//timer.schedule(task, time)

class ColorPanel extends JPanel implements KeyListener {

 private static final int ROWSIZE = 15;
 private static final int COLSIZE = 10;
 private int mArray[][] = new int[ROWSIZE][COLSIZE];
 private int CurrentShape[][] = new int[4][2];
 private int mDelayCount = 0;

 private int keyValue;
 MyRect myRect = new MyRect();
 private int mtype;
 private int mrotateState;
 Random myRandom;
 private int nextShapeType;
 private int nextNextShapeType;
 private Graphics mygraphic;

 public void init() {
  int i, j;
  for (i = 0; i < ROWSIZE; i++) {
   for (j = 0; j < COLSIZE; j++) {
    if (i == 0 || i == ROWSIZE - 1 || j == 0 || j == COLSIZE - 1) {
     mArray[i][j] = 0;
    } else {
     mArray[i][j] = -1;
    }

   }
  }
  nextShapeType = 3;
  nextNextShapeType = 2;
  newShape();
 }

 public ColorPanel() {
  addKeyListener(this);
  mtype = 1;
  mrotateState = 0;
  myRandom = new Random();

  init();

 }

 private boolean newShape() {
// 다음나올 도형을 설정
  mtype = nextShapeType;
  nextShapeType = nextNextShapeType;
  nextNextShapeType = myRandom.nextInt(3) + 1;

  mrotateState = 0;
  switch (mtype) {
  case 1: // 네모
   CurrentShape[0][0] = 1;
   CurrentShape[0][1] = 5;
   CurrentShape[1][0] = 1;
   CurrentShape[1][1] = 6;
   CurrentShape[2][0] = 2;
   CurrentShape[2][1] = 6;
   CurrentShape[3][0] = 2;
   CurrentShape[3][1] = 5;
   break;
  case 2: // 짝대기
   CurrentShape[0][0] = 1;
   CurrentShape[0][1] = 4;
   CurrentShape[1][0] = 1;
   CurrentShape[1][1] = 5;
   CurrentShape[2][0] = 1;
   CurrentShape[2][1] = 6;
   CurrentShape[3][0] = 1;
   CurrentShape[3][1] = 7;
   break;
  case 3: // tri
   CurrentShape[0][0] = 1;
   CurrentShape[0][1] = 5;
   CurrentShape[1][0] = 2;
   CurrentShape[1][1] = 6;
   CurrentShape[2][0] = 2;
   CurrentShape[2][1] = 5;
   CurrentShape[3][0] = 2;
   CurrentShape[3][1] = 4;
   break;
  }
  return CheckNewShape();

 }

 private void DrawNextNextShape(Graphics g) {
// TODO Auto-generated method stub
// 다음나올도형을 디스플레이하기 위한 무비클립 생성

  int i, j;
  myRect.setColor(nextNextShapeType);
  g.drawString("다음나올도형", COLSIZE * 40 + 40, 150);
  switch (nextNextShapeType) {
  case 1: // 네모
   myRect.setij(6 + 1, COLSIZE + 5 - 4);
   myRect.draw(g);
   myRect.setij(6 + 1, COLSIZE + 6 - 4);
   myRect.draw(g);
   myRect.setij(6 + 2, COLSIZE + 6 - 4);
   myRect.draw(g);
   myRect.setij(6 + 2, COLSIZE + 5 - 4);
   myRect.draw(g);

   break;
  case 2: // 짝대기
   myRect.setij(6 + 1, COLSIZE + 4 - 4);
   myRect.draw(g);
   myRect.setij(6 + 1, COLSIZE + 5 - 4);
   myRect.draw(g);
   myRect.setij(6 + 1, COLSIZE + 6 - 4);
   myRect.draw(g);
   myRect.setij(6 + 1, COLSIZE + 7 - 4);
   myRect.draw(g);
   break;
  case 3: // 짝대기
   myRect.setij(6 + 1, COLSIZE + 5 - 4);
   myRect.draw(g);
   myRect.setij(6 + 2, COLSIZE + 6 - 4);
   myRect.draw(g);
   myRect.setij(6 + 2, COLSIZE + 5 - 4);
   myRect.draw(g);
   myRect.setij(6 + 2, COLSIZE + 4 - 4);
   myRect.draw(g);
   break;
  }

 }

 private void DrawNextShape(Graphics g) {
// TODO Auto-generated method stub
// 다음나올도형을 디스플레이하기 위한 무비클립 생성

  int i, j;

  myRect.setColor(nextShapeType);

  switch (nextShapeType) {
  case 1: // 네모
   myRect.setij(3 + 1, COLSIZE + 5 - 4);
   myRect.draw(g);
   myRect.setij(3 + 1, COLSIZE + 6 - 4);
   myRect.draw(g);
   myRect.setij(3 + 2, COLSIZE + 6 - 4);
   myRect.draw(g);
   myRect.setij(3 + 2, COLSIZE + 5 - 4);
   myRect.draw(g);

   break;
  case 2: // 짝대기
   myRect.setij(3 + 1, COLSIZE + 4 - 4);
   myRect.draw(g);
   myRect.setij(3 + 1, COLSIZE + 5 - 4);
   myRect.draw(g);
   myRect.setij(3 + 1, COLSIZE + 6 - 4);
   myRect.draw(g);
   myRect.setij(3 + 1, COLSIZE + 7 - 4);
   myRect.draw(g);
   break;
  case 3: // 짝대기
   myRect.setij(3 + 1, COLSIZE + 5 - 4);
   myRect.draw(g);
   myRect.setij(3 + 2, COLSIZE + 6 - 4);
   myRect.draw(g);
   myRect.setij(3 + 2, COLSIZE + 5 - 4);
   myRect.draw(g);
   myRect.setij(3 + 2, COLSIZE + 4 - 4);
   myRect.draw(g);
   break;
  }

 }

 private boolean CheckNewShape() {
// TODO Auto-generated method stub
  for (int i = 0; i < 4; i++) {
   if (mArray[CurrentShape[i][0]][CurrentShape[i][1]] >= 0) { // 이동 불가
    return false;
   }
   // if (CurrentShape[i][0] + 1 == RowSize - 1) return false;
  }
  return true;
 }

 protected void paintComponent(Graphics g) {
  int i, j;

  super.paintComponent(g);

  for (i = 0; i < ROWSIZE; i++) {
   for (j = 0; j < COLSIZE; j++) {
    myRect.setColor(mArray[i][j]);
    myRect.setij(i, j);
    myRect.draw(g);
   }
  }
// 현재 플레이되는 도형 출력
  for (i = 0; i < 4; i++) {
   myRect.setColor(mtype);
   myRect.setij(CurrentShape[i][0], CurrentShape[i][1]);
   myRect.draw(g);
  }

  DrawNextShape(g);
  DrawNextNextShape(g);

// g.setColor(Color.red);
// g.drawString("33" +keyChar , 50, 50);
// g.setColor(Color.blue);
// g.drawString("배우기 쉬운 자바 프로그래밍", 50, 80);
// Color c1 = new Color(100, 255, 100);
// Color c2 = new Color(255, 100, 255);
// g.setColor(c1);
// g.fillRect(50, 100, 60, 50);
// g.setColor(c2);
// g.fillOval(130, 100, 90, 30);
// g.setColor(Color.cyan);
// g.drawRoundRect(50, 190, 200, 50, 15, 15);

 }

 public void keyReleased(KeyEvent ke) {
 }

 public void keyTyped(KeyEvent ke) {
 }

 public void keyPressed(KeyEvent ke) {
  keyValue = ke.getKeyCode();
  switch (keyValue) {
  case 40:
   if (IsPossibleDown()) {
    Down();
   } else {
    break;
   }
   break;

  case 37: // left
   if (IsPossibleLeft()) {
    Left();
   }
   break;

  case 38: // up
   //
   if (IsPossibleRotate()) {
    Rotate();
   }

   break;
  case 39: // right
   if (IsPossibleRight()) {
    Right();
   }
   break;
  case 32: // space
   do {
    if (IsPossibleDown()) {
     Down();
    } else {
     break;
    }
   } while (true);
   break;
  }
  repaint();
 }

 public void everyTimeCheck() {
// TODO Auto-generated method stub
  if (mDelayCount > 10) {
   mDelayCount = 0;

   if (IsPossibleDown()) {
    Down();
    repaint();
   } else { // 도형이 더이상 내려갈 수 없는 위치에 있을 경우
    FixShape(); // 도형의 현재 위치에 해당하는 배열 값을 false로 설정
    CheckCompleteLine(); // 라인이 완성되었는지 체크
    if (newShape() == false) // 프로그램 종료
    {
     init();
     // _root.onEnterFrame=null;
     // Init();
     // NewShape();
    }

   }
  }
  mDelayCount++;
 }

 private void CheckCompleteLine() {
// TODO Auto-generated method stub
  for (int i = 1; i < ROWSIZE - 1; i++) {
   boolean isLineComplete = true;
   for (int j = 1; j < COLSIZE - 1; j++) {
    if (mArray[i][j] < 0) {
     isLineComplete = false;
     break;
    }
   }
   // 해당라인이 모두 false인 경우 에는 라인 삭제
   if (isLineComplete) {
    // 라인삭제
    DeleteLine(i);

    // 새로 그림을 그려주어야 한다.
    repaint();
   }

  }
 }

 private void DeleteLine(int deleteLine) {
  int m;
// TODO Auto-generated method stub
  for (int k = deleteLine; k > 1; k--) {
   for (m = 1; m < COLSIZE - 1; m++) {
    mArray[k][m] = mArray[k - 1][m];
   }
  }
// 1번라인은 true로 설정
  for (m = 1; m < COLSIZE - 1; m++) {
   mArray[1][m] = -1;
  }
 }

 private void FixShape() {
// TODO Auto-generated method stub
  for (int i = 0; i < 4; i++) {
   mArray[CurrentShape[i][0]][CurrentShape[i][1]] = mtype;
  }
 }

 private boolean IsPossibleRotate() {
// TODO Auto-generated method stub
  try {
   switch (mtype) {
   case 1: // 정사각형
    break;
   case 2: // 짝대기
    switch (mrotateState) {
    case 0:
     if (mArray[CurrentShape[0][0] - 1][CurrentShape[0][1] + 2] >= 0)
      return false;
     if (mArray[CurrentShape[1][0] - 0][CurrentShape[1][1] + 1] >= 0)
      return false;
     if (mArray[CurrentShape[2][0] + 1][CurrentShape[2][1] + 0] >= 0)
      return false;
     if (mArray[CurrentShape[3][0] + 2][CurrentShape[3][1] - 1] >= 0)
      return false;
     break;
    case 1:
     if (mArray[CurrentShape[0][0] + 1][CurrentShape[0][1] - 2] >= 0)
      return false;
     if (mArray[CurrentShape[1][0] - 0][CurrentShape[1][1] - 1] >= 0)
      return false;
     if (mArray[CurrentShape[2][0] - 1][CurrentShape[2][1] + 0] >= 0)
      return false;
     if (mArray[CurrentShape[3][0] - 2][CurrentShape[3][1] + 1] >= 0)
      return false;
     break;
    }

    break;
   case 3: // tri
    switch (mrotateState) {
    case 0:
     if (mArray[CurrentShape[0][0] + 1][CurrentShape[0][1] + 1] >= 0)
      return false;
     if (mArray[CurrentShape[1][0] + 1][CurrentShape[1][1] - 1] >= 0)
      return false;
     if (mArray[CurrentShape[2][0] + 0][CurrentShape[2][1] + 0] >= 0)
      return false;
     if (mArray[CurrentShape[3][0] - 1][CurrentShape[3][1] + 1] >= 0)
      return false;
     break;
    case 1:
     if (mArray[CurrentShape[0][0] + 0][CurrentShape[0][1] - 1] >= 0)
      return false;
     if (mArray[CurrentShape[1][0] - 2][CurrentShape[1][1] - 1] >= 0)
      return false;
     if (mArray[CurrentShape[2][0] - 1][CurrentShape[2][1] + 0] >= 0)
      return false;
     if (mArray[CurrentShape[3][0] - 0][CurrentShape[3][1] + 1] >= 0)
      return false;
     break;

    case 2:
     if (mArray[CurrentShape[0][0] + 0][CurrentShape[0][1] - 1] >= 0)
      return false;
     if (mArray[CurrentShape[1][0] - 0][CurrentShape[1][1] + 1] >= 0)
      return false;
     if (mArray[CurrentShape[2][0] + 1][CurrentShape[2][1] + 0] >= 0)
      return false;
     if (mArray[CurrentShape[3][0] + 2][CurrentShape[3][1] - 1] >= 0)
      return false;
     break;

    case 3:
     if (mArray[CurrentShape[0][0] - 1][CurrentShape[0][1] + 1] >= 0)
      return false;
     if (mArray[CurrentShape[1][0] + 1][CurrentShape[1][1] + 1] >= 0)
      return false;
     if (mArray[CurrentShape[2][0] - 0][CurrentShape[2][1] + 0] >= 0)
      return false;
     if (mArray[CurrentShape[3][0] - 1][CurrentShape[3][1] - 1] >= 0)
      return false;
     break;
    }

    break;
   }
  } catch (Exception e) {
   // TODO Auto-generated catch block
   // 인덱스의 -1이 나오는 경우가 있지만 이경우는 경계를 벗어나므로 회전 불가하여 거짓을 반환
   return false;
  }
  return true;
 }

 private void Rotate() {
// TODO Auto-generated method stub

  switch (mtype) {
  case 1: // 정사각형
   break;
  case 2: // 짝대기
   switch (mrotateState) {
   case 0:
    CurrentShape[0][0] -= 1;
    CurrentShape[0][1] += 2;
    CurrentShape[1][0] -= 0;
    CurrentShape[1][1] += 1;
    CurrentShape[2][0] += 1;
    CurrentShape[2][1] += 0;
    CurrentShape[3][0] += 2;
    CurrentShape[3][1] -= 1;
    mrotateState = 1;
    break;
   case 1:
    CurrentShape[0][0] += 1;
    CurrentShape[0][1] -= 2;
    CurrentShape[1][0] -= 0;
    CurrentShape[1][1] -= 1;
    CurrentShape[2][0] -= 1;
    CurrentShape[2][1] += 0;
    CurrentShape[3][0] -= 2;
    CurrentShape[3][1] += 1;
    mrotateState = 0;
    break;
   }

   break;

  case 3: // 짝대기
   switch (mrotateState) {
   case 0:
    CurrentShape[0][0] += 1;
    CurrentShape[0][1] += 1;
    CurrentShape[1][0] += 1;
    CurrentShape[1][1] -= 1;
    CurrentShape[2][0] += 0;
    CurrentShape[2][1] += 0;
    CurrentShape[3][0] -= 1;
    CurrentShape[3][1] += 1;
    mrotateState = 1;
    break;
   case 1:
    CurrentShape[0][0] += 0;
    CurrentShape[0][1] -= 1;
    CurrentShape[1][0] -= 2;
    CurrentShape[1][1] -= 1;
    CurrentShape[2][0] -= 1;
    CurrentShape[2][1] += 0;
    CurrentShape[3][0] -= 0;
    CurrentShape[3][1] += 1;
    mrotateState = 2;
    break;
   case 2:
    CurrentShape[0][0] -= 0;
    CurrentShape[0][1] -= 1;
    CurrentShape[1][0] -= 0;
    CurrentShape[1][1] += 1;
    CurrentShape[2][0] += 1;
    CurrentShape[2][1] += 0;
    CurrentShape[3][0] += 2;
    CurrentShape[3][1] -= 1;
    mrotateState = 3;
    break;
   case 3:
    CurrentShape[0][0] -= 1;
    CurrentShape[0][1] += 1;
    CurrentShape[1][0] += 1;
    CurrentShape[1][1] += 1;
    CurrentShape[2][0] -= 0;
    CurrentShape[2][1] += 0;
    CurrentShape[3][0] -= 1;
    CurrentShape[3][1] -= 1;
    mrotateState = 0;
    break;
   }

   break;
  }
 }

 private void Right() {
// TODO Auto-generated method stub
  for (int i = 0; i < 4; i++) {
   CurrentShape[i][1] = CurrentShape[i][1] + 1;
  }
 }

 private boolean IsPossibleRight() {
// TODO Auto-generated method stub
  for (int i = 0; i < 4; i++) {
   if (mArray[CurrentShape[i][0]][CurrentShape[i][1] + 1] >= 0) { // 이동
    // 불가
    return false;
   }
  }
  return true;
 }

 private void Left() {
// TODO Auto-generated method stub
  for (int i = 0; i < 4; i++) {
   CurrentShape[i][1] = CurrentShape[i][1] - 1;
  }
 }

 private boolean IsPossibleLeft() {
// TODO Auto-generated method stub
  for (int i = 0; i < 4; i++) {
   if (mArray[CurrentShape[i][0]][CurrentShape[i][1] - 1] >= 0) { // 이동
    // 불가
    return false;
   }
  }
  return true;
 }

 private void Down() {
// TODO Auto-generated method stub
  for (int i = 0; i < 4; i++) {
   CurrentShape[i][0] = CurrentShape[i][0] + 1;
  }
 }

 private boolean IsPossibleDown() {
// TODO Auto-generated method stub
  for (int i = 0; i < 4; i++) {
   if (mArray[CurrentShape[i][0] + 1][CurrentShape[i][1]] >= 0) { // 이동
    // 불가
    return false;
   }
  }
  return true;
 }

}

class ColorFrame extends JFrame {
 /**
 *
 */
 private static final long serialVersionUID = 1L;

 public ColorFrame() {
  setTitle("Tetris");

  ColorPanel colorPanelObject = new ColorPanel();
  Timer timer = new Timer();
  MyTimeEvent myTimeEvent = new MyTimeEvent(colorPanelObject);

  add(colorPanelObject);
  colorPanelObject.setFocusable(true);
  setSize(600, 800);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
  timer.schedule(myTimeEvent, 10, 50);

 }
}

class MyTimeEvent extends TimerTask {
 ColorPanel mColorPanel;

 MyTimeEvent(ColorPanel colorPanel) {
  mColorPanel = colorPanel;
 }

 @Override
 public void run() {
// TODO Auto-generated method stub
  mColorPanel.everyTimeCheck();
 }
}

public class MainClass {
 public static void main(String[] args) {
  new ColorFrame();
 }
}