public class Main {
    public static void main(String[] args) {

        double[] nums = {2, 3, 4, 10, 26, 40};

        System.out.println(binarySearch(nums, 3,0, nums.length - 1));

    }

    public static int linearSearch (String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(double[] array, double target,int start, int end){
        if (start > end) {
            return -1;
        } else {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (target < array[mid]) {
                return binarySearch(array, target, start, mid - 1);
            } else {
                return binarySearch(array, target, mid + 1, end);
            }
        }
    }
}