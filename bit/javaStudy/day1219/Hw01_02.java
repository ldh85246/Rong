import java.util.Random;

interface Drawble {
	public void draw();
}

class Rectangle implements Drawable {
   public void draw() {
      System.out.println("사각형");
   }
}

class Triangle implements Drawable {
   public void draw() {
      System.out.println("삼각형");
   }
}

class Circle implements Drawable {
   public void draw() {
      System.out.println("원");
   }
}

class Hw01_02 {
	public static void main(String[] args) {
		Random r = new Random();
	}
}
