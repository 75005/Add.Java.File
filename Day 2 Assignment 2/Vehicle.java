class Vehicle{
              
          
            int price;
            String color;
            String model;
           
           
           Vehicle( int p, String c, String m ) {
                 price = p;
                 color = c;
                 model = m;
             }

            void display(){

            System.out.println(" Vehicle price : " +price);
              
            System.out.println(" Vehicle color : " +color);

             System.out.println(" Vehicle model : " +model);

                
            }

            public static void main(String arg[]) {
 
               Vehicle aa = new Vehicle(10, "BLUE", "BMW" );
               Vehicle bb = new Vehicle(12, "Red", "Quanto" );
                 aa.display();
                 bb.display();                     
             }
        }

            

         
           
              