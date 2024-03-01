class Room{
          int height = 15;
          int width = 10;
          int breadth = 12;
         int calculatevolume() {
          return height*width*breadth;
         }
          public static void main(String arg[]) {
           Room aa = new Room();
         System.out.println("Volume of room is : " +aa.calculatevolume());
         }
  }