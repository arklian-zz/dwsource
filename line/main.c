#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "ml6.h"
#include "display.h"
#include "draw.h"

int main() {

  screen s;
  color c;
 
  
  c.red = MAX_COLOR;
  c.green = MAX_COLOR;
  c.blue = 0;
  
  clear_screen(s);

  int i, j;

  for (i=0; i < YRES; i++)
    for (j=0; j < XRES; j++ )
      plot(s, c, i, j);
  
  c.green = 0;

  draw_line(0, 0, 400, 350, s, c);

  display(s);

  save_ppm(s, "pic.ppm");
  save_extension(s, "whatevs.png");
}  
