import java.awt.Rectangle;

class sgfd{
	public static void main(String[] args) {
		
	
	
    int base;
    int height;
  
    int area;
    int perimeter;
    System.out.println("Height * Base = 42");
    for(int i = 1; i< 42; i++){
      base = i;
      for(int j = 1; j< 42; j++){
        height = j;
        area = height * base;
        if(area == 42){
          System.out.println(height + " x " + base + " = 42");
          Rectangle rect = new Rectangle();
          rect.setBounds(0, 0, i, j);
        }
        
        
      }
      
    }
    System.out.println("Height + Height + Base + Base = 42");
    for(int i = 1; i< 42; i++){
      base = i;
      for(int j = 1; j< 42; j++){
        height = j;
        perimeter = 2*height + 2* base;
        if(perimeter == 42){
          System.out.println(height + " + " + height + " + " + base + " + " + base + " = 42");
        }
        
      }
  
    
    }
	}
}
  
