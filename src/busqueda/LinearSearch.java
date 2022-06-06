package busqueda;

public class LinearSearch {
    public static void main(String[] args) {

        int [] testBinary = {1,2,3,4,8,9,18,22,35,99,122,222};

        System.out.println(linearSearch(testBinary, 4));
    }
    public static int linearSearch(int[] arrayToSearch, int element) {
        int elementPos = -1;
        for (int i = 0 ; i < arrayToSearch.length ; i++) {
            if (arrayToSearch[i] == element) {
                return i;
            }
        }

        return elementPos;
    }
}

