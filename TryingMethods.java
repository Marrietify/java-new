import javax.sound.midi.Track;

public class TryingMethods {
    public static void main(String[] args) {
       System.out.println(summation()); 
       evenSum();
       TryingMethods t = new TryingMethods();
       System.out.println(t.weekDay(5));
       t.mathScore(30);
        
    }
    public String weekDay(int dayInteger) {
        switch (dayInteger) {
            case 1: 
                return "monday";
                case 2: 
                return "tuesday"; 
                case 3: 
                return "wednesday";
                case 4: 
                return "thursday";  
                case 5: 
                return "friday";
                case 6: 
                return "saturday";
                case 7: 
                return "sunday";
        
            default:
                return "days of the week not found";
        }
    }
    public void mathScore(int result){
        if(result <= 0 ){
            System.out.println("Olodo");
        }
        else if (result <= 20){
            System.out.println("Fail");
        }
        else if (result <= 50){
            System.out.println("Pass");
        }
        else {System.out.println("Excellent");
    }
    }
    public static int summation(){
        int count = 0;
        int sum = 0;
        while(count < 1000){
            sum = sum + count;
            count = count + 1;
        }
        return sum;
    }
    public static void evenSum(){
       int sum = 0;
       for (int index = 12; index < 104; index++) {
        if (index % 2 == 0){
            sum = sum + index;
        }
       }
       System.out.println(sum);

    }
}
