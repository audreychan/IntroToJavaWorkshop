PImage wakanda;
PImage quinjet;

void setup(){
  wakanda = loadImage("Wakanda.jpeg");
  size(640, 357);
  quinjet = loadImage("Quinjet.png");
}

void draw(){
  background(wakanda);
  image(quinjet, mouseX, mouseY);
}