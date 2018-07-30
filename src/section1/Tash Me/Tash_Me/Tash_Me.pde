PImage mustache;
PImage friend;

void setup(){
  friend = loadImage("delara.jpg");
  size(800, 600);
  friend.resize(width, height);
  mustache = loadImage("Mustache.png");
  mustache.resize(50, 25);
}

void draw(){
  background(friend);
  if(mousePressed){
    image(mustache, mouseX - 250, mouseY - 75);
  }
}