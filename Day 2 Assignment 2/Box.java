class Box{
          
         float height;
         float width;
         float breadth;

        Box(float H, float W, float B ) {
           height = H;
           width = W;
           breadth = B;
        }

          void getvolume() {
           float volume =  height*width*breadth;
          System.out.println("Volume of Box : " + volume);
         }

          void getArea() {
           float area =  width*breadth;
           System.out.println(" Surface Area of Box : " + area);
          }
           
        public static void main(String arg[]) {
           Box b1 = new Box( 10.5f,6.4f,5.6f);
           Box b2 = new Box(4.2f,5.4f,8.3f);
           b1.getvolume();
           b1.getArea();
           b2.getvolume();
           b2.getArea();
        }
 }
          
           
            
         