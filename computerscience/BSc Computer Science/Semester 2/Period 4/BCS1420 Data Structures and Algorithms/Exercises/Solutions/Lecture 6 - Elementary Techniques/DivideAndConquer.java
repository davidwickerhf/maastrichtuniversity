public class DivideAndConquer {

    private static int find(int[] a, int start, int end, int target){
        if(end < start || end >= a.length)
            return -1;
        int middle = (end+start)/2;
        if(a[middle]==target)
            return middle;
        if(a[middle]<target)
            return find(a, middle+1, end, target);
        else
            return find(a, start, middle-1, target);

    }

    private static String divideAndConquer(int[] a, int target) {
        String result;
        int index = find(a, 0, a.length-1, target);
        if(index == -1)
            result = "Element not found";
        else
            result = "Element found at index " + index;

        return result;
    }

    public static void main(String[] a){
        int[] A = new int[]{2, 3, 5, 7, 9};
        int target = 7;
        System.out.println(divideAndConquer(A, target));
        int[] B = new int[]{1, 4, 5, 8, 9};
        target = 2;
        System.out.println(divideAndConquer(B, target));
    }


}
