public class ArrayOperations {
    /**
     * Delete the value at the given position in the argument array, shifting
     * all the subsequent elements down, and storing a 0 as the last element of
     * the array.
     */
    public static void delete(int[] values, int pos) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        // TODO: YOUR CODE HERE
        else {
            for ( int i=pos; i< values.length-1;i=i+1) {
                values[i]= values[i+1];
            }
            values[values.length-1]= 0;
        }
    }

    /**
     * Insert newInt at the given position in the argument array, shifting all
     * the subsequent elements up to make room for it. The last element in the
     * argument array is lost.
     */
    public static void insert(int[] values, int pos, int newInt) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        // TODO: YOUR CODE HERE
        else{
            for (int i= values.length-1 ; pos<i ;i-=1) {
                values[i] = values[i-1];
            }
            values[pos] = newInt;
        }
    }

    /** 
     * Returns a new array consisting of the elements of A followed by the
     *  the elements of B. 
     */
    public static int[] catenate(int[] A, int[] B) {
        // TODO: YOUR CODE HERE
        int[] C= new int[A.length + B.length];
        System.arraycopy(A, 0, C, 0, A.length);
        System.arraycopy(B,0, C, A.length, B.length);
        return C;
    }

    /** 
     * Returns the array of arrays formed by breaking up A into
     *  maximal ascending lists, without reordering.
     */
    public static int[][] naturalRuns(int[] A) {
        // TODO: Your CODE HERE
        int count = 1;
        for (int i= 0 ; i< A.length-1 ; i++) {
            if (A[i] >= A[i+1]) {
                count = count+1;
            }
        }

    int [][] separateArray = new int[count][];
    int positionArray [] = new int [count];
    int counter = 1;
    positionArray [0]= 0;
    for (int i=0; i< A.length-1 ; i++) {
        if (A[i] > A[i+1]) {
            positionArray[counter] = i+1;
            counter = counter +1;
        }

    }
    int lenArray[] = new int [count];
    int counter2= 0;
    int len= 1;
    for (int i=0 ; i< A.length-1 ; i+=1) {
        if (A[i] < A[i+1]){
            len = len + 1;
        }

        else {
        lenArray[counter2]= len;
        counter2 = counter2+1;
        len=1; }

    }
    lenArray[counter2] =len;
    int position =0;
    for (int i=0; i <count; i++) {
        position= positionArray[i];
        len= lenArray[i];
        separateArray[i]=subarray(A,position,len);
    }
    return separateArray;

    }



    /*
    * Returns the subarray of A consisting of the LEN items starting
    * at index K.
    */
    public static int[] subarray(int[] A, int k, int len) {
        int[] result = new int[len];
        System.arraycopy(A, k, result, 0, len);
        return result;
    }

}