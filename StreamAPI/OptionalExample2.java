package StreamAPI;
import java.util.Optional;
// Create method getCityName(String userId)
// If userId = "101", return "Chennai" inside an Optional.
// Otherwise, return an empty Optional.
// Then, in main(), safely print the city name (avoid NullPointerException).
public class OptionalExample2 {
    public static void main(String[] args) {
        
        String userId = "101";
        Optional<String> cityName = getCityName(userId);
        System.out.println(cityName.orElse("Handled NullPointerException !"));
    }
    private static Optional<String> getCityName(String UserId){
        if("101".equals(UserId)){
            return Optional.of("Chennai");
        }
        return Optional.empty();
        
    }
}
