public class CountDown {

    public static void main(String[] args){

        System.out.println("FINAL COUNTDOWN!!!!");
        //In this class we are going to use three different types of looping structures.
        //We will start with a while loop
        int count = 10;
        while(count != 0){
            System.out.println(count);
            --count;
        }
        int count2 = 0;
        while(count2 <= 10){
            System.out.println(count2);
            ++count;
        }

    }
    public static void displayDoWhile(){
        int count = 10;
        int count2 = 0;
        do{
            System.out.println(count);
            --count;
        }while(count <= 0);
        do{
            System.out.println(count2);
            ++count2;
        }while(count2 <= 10);
    }
    public static void displayForLoop(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        for(int j = 10; j <= 0; j--){
            System.out.println(j);
        }
    }
}
