public class ArrayOps {
    public static void main(String[] args) {
        int [] array1 = new int [] {1,3,2};
        int [] array2 = new int [] {1,3,-4,5};
        System.out.println(isSorted(array1));
    }
    // gets an array of integers and returns its maximum value
    public static int Max (int [] array) {
         int max = 0;
         for (int i = 0; i < array.length; i ++) {
                if (array[i] > max)
                  max = array [i]; 
         }
         return max;
        }
        public static boolean contains (int [] array, int value) {
            // gets an array and an integer and returns if it contains it
            for (int i = 0; i < array.length; i ++) {
                if (array [i] == value) {
                    return true;
                }
            }
            return false;
        }

    public static int findMissingInt (int [] array) {
        int num = 1;
        for ( int i = 0; i < array.length; i ++){
            if (num == array[i]) {
                num ++;
                i=0;
            }
        }
        return num;
    }


    public static int secondMaxValue(int [] array) {
        int max = Max (array);
        int secondMax = 0;
        int countMax = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array [i] > secondMax && array [i] < max)
            secondMax = array [i];
            if (array [i] == max)
            countMax ++;
        }
        if (countMax > 1)
        return max;
        else return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int length = 0;
        if (array1.length > array2.length) {
            length = array1.length;
        }
        else length = array2.length;
        for (int i = 0; i < length; i ++ ) {
            int num = array1 [i];
            if (length == array1.length)
            {
                if (!contains(array2, num)) 
                return false;
            }
            else {
                if (!contains(array1, num)) 
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        int countMax = 1;
        int countMin = 1;
            for (int i = array.length-1; i > 0; i --)
        {
            if (array [i] <= array [i-1]) {
                countMin ++;
            }
            if (array [i] >= array [i-1]) {
                countMax ++;
            }
        }
        return (countMax == array.length || countMin == array.length );
    }

}
