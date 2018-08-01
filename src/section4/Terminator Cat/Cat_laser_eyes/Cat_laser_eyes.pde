PImage catPic;
int lx = 524;
int ly = 255;
int rx = 719;
int ry = 278;
int acceleration = 1;

void setup(){
  size(1280, 720);
  catPic = loadImage("cat.jpg");
  background(catPic);
}

void draw(){
  //noStroke();
  //fill(#D33D06);
 // keyPressed();
  //ellipse(lx, ly, 20, 20);
//ellipse(rx, ry, 20, 20);
   strokeWeight(20);
   stroke(#D33D06);
   line(524, 255, lx, ly);
   line(719, 278, rx, ry);
   if(ly > height  && ry > height){
     background(catPic);
     acceleration = 1;
     lx = 524;
     ly = 255;
     rx = 719;
     ry = 278;
   }
}

void keyPressed(){
  acceleration ++;
  lx += acceleration;
  ly += acceleration;
  rx += acceleration;
  ry += acceleration;
}