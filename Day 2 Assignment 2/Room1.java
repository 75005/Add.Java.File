class Room{
           float height;
           float width;
           float breadth;


        void getvolume(float height,float width,float breadth){
         System.out.println( "Volume of Room is : " + height*width*breadth);
       }

            public static void main(String arg[]) {
             Room aa = new Room();
             aa.getvolume(5.0f,4.0f,6.0f);
           }
          
}
          