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
}
