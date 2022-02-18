public class forPrint {
    public static void main(String[] args) {
      String[] cars = {"volvo", "BMW","Odi","Honda"};
      for(int i=0; i<cars.length ; i++){
        System.out.println("car"+cars[i]);
      }
      for(String i : cars){
        System.out.println(i);
      }
    }
  }