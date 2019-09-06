public class BinaryRecursiveSearch implements Practice03Search {
    public String searchName() {
        return "Binary Recursive Search";
    }

    public int search(int[] arr, int target, int low, int high) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return search(arr, target, low, mid - 1);
        } else {
            return search(arr, target, mid + 1, high);
        }
    }

    public int search(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }
}