public class GradeUtils {
    public static int grade(int points) {
        if(points >= 50 && points <= 60) {
            return 5;
        }
        if(points >= 45 && points <= 49) {
            return 4;
        }
        if(points >= 40 && points <= 44) {
            return 3;
        }
        if(points >= 35 && points <= 39) {
            return 2;
        }
        if(points >= 30 && points <= 34) {
            return 1;
        }
        return 0;
    }
}
