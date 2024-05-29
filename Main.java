package homework03;


public class Main {
    public static <T> boolean compareArrays(T[] arr1, T[] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if(!arr1[i].getClass().equals(arr2[i].getClass())) return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Calculator.sum(10, 2.3));
        System.out.println(Calculator.multiply(1.2, 4));
        System.out.println(Calculator.subtract(4, 3));
        System.out.println(Calculator.divide(3, 1.5));
//        System.out.println(Calculator.divide(4, 0));

        Object [] arr1 = {1, "s", 1.2};
        Object [] arr2 = {5, "t", 53.2};
        Object [] arr3 = {5, "t", 53.2, 300};
        Object [] arr4 = {5, "r", "o"};

        System.out.println(compareArrays(arr1, arr2));
        System.out.println(compareArrays(arr1, arr3));
        System.out.println(compareArrays(arr4, arr2));
    }
}
