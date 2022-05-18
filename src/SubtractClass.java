
interface Subtract{
   // void switchOn();
   // void sum(int input);
    int subtract(int i1,int i2);
}
public class SubtractClass {


    public static void main(String[] args) {

        Subtract cl = (i1,i2) -> {
            if(i1 > i2){
                throw new RuntimeException();
            }else

            return i2 - i1;
        };
        System.out.println(cl.subtract(0,2));

      // Subtract cl = (input) -> System.out.println("Sum = " +input);
      // cl.sum(514);
        //Subtract cl = () ->  System.out.println("Switch On");
        //cl.switchOn();
    }


}
