
interface I{
  void m1();
  void m2();
}


class Main {
  public static void main(String[] args) {

    //Inner class implementaion of Interface I
    I i1 = new I()
    {
      public void m1(){
        System.out.println("Anonymous Inner class implementation of Interface I - m1()");
      }
      public void m2(){
        System.out.println("Anonymous Inner class implementation of Interface I - m2()");
      }
    };
    i1.m1();
    i1.m2();
    System.out.println("Hello world!");
  }
}