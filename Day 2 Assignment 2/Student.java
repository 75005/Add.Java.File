class Student{
              String name;
              int sub1 = 50;
              int sub2 = 70;
              int sub3 = 80;
            void getname(String name) {
             System.out.println(name);
            }
              int sum() {
              return sub1 + sub2 + sub3;
          }
             int total = sum();
             float average() {
              return total/3;
            }
           public static void main(String arg[]) {
             Student aa = new Student();
              aa.getname("Shahnawaz");
             System.out.println("Total marks : " +aa.total);
             System.out.println(" Marks Average : " +aa.average());   
            }
    }