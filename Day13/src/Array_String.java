public class Array_String {

    public static void main(String[] args) {
        String[] arr1 = {"Apple", "Mango", "Banana"};
        String[] arr2 = {"Orange", "Apple", "Grapes"};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println("Common variable: " + arr1[i]);
                }
            }
       }
    }
}
