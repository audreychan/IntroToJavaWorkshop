void setup(){
  size(800, 800);
}

void draw(){
  fill(#2D92FA);
  if(mousePressed){
    fill(#890B0B);
  }
  ellipse(400, 400, 800, 800);
}