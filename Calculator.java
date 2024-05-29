package homework03;

public class Calculator{
    public static <T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double muliply(T a, T b){
        return a.doubleValue() * b.doubleValue();
    }
}
