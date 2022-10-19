public class TryingMethods {
    public static void main(String[] args) {
        
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
}
