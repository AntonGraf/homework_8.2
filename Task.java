public class Task {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int[] reverseNumbers = reverseArray(numbers);
    }

    private static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length /2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1] ;
            array[array.length - i - 1] = temp;
        }
        return array;
    }

}