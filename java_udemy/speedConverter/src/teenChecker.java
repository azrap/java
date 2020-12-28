public class teenChecker {
    public static boolean hasTeen(int age1, int age2, int age3){

        if (age1>12 && age1<20){
            return true;
        }
        else if (age2>12 && age2<20){
            return true;
        }
        else if (age3>12 && age3<20){
            return true;
        }
        return false;

    }

    public static boolean isTeen(int age1){

        if (age1>12 && age1<20){
            return true;
        }
        return false;

    }
}
