public class Sorting {

    int partition(String[] items, int low, int high){
        String pivot = items[high];
        int index = low - 1;
        String temp;
        for (int j = low; j < high; j++) {
            if (items[j].toLowerCase().charAt(0) < pivot.toLowerCase().charAt(0)) {
                index++;
                temp = items[index];
                items[index] = items[j];
                items[j] = temp;
            }}
        temp = items[index+1];
        items[index+1] = items[high];
        items[high] = temp;
        return (index + 1);
    }

    void quickSort(String[] items, int low, int high){
        if (low < high) {
            int pIndex = partition(items, low, high);
            quickSort(items, low, pIndex - 1);
            quickSort(items, pIndex + 1, high);
        }
    }

    private void merge(int[] items, int start, int mid, int end) {
        //create a temporary array to store the values while we merge them
        int[] temp = new int[items.length];
        //indicates the start of the first subArray (pos1) and start of the second subArray(pos2)
        int pos1 = start, pos2 = mid+1;
        int spot = start;	//track next available position in tempArray
        //Keep repeating until all values have been merged
        while (!(pos1 > mid && pos2 > end)) {
            if ((pos1 > mid) || ((pos2 <= end) && (items[pos2] > items[pos1]))) {
                temp[spot] = items[pos2];
                pos2++;
            } else {
                temp[spot] = items[pos1];
                pos1++;
            }
            spot++;
        }
        //Copy values from temp back to items
        for(int i = start; i <= end; i++) items[i] = temp[i];
    }

    public void mergeSort(int[] items, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(items, start, mid);
            mergeSort(items, mid+1, end);
            merge(items, start, mid, end);
        }
    }


}
