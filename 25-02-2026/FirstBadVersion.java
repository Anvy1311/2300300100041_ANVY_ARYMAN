public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid - 1;   
            } else {
                low = mid + 1;    
            }
        }
        return low;
    }

    
    public static void main(String[] args) {
        FirstBadVersion solution = new FirstBadVersion();

        int n = 10;
        int firstBad = solution.firstBadVersion(n);

        System.out.println("First bad version is: " + firstBad);
    }
}

class VersionControl {
    int badVersion = 4;

    boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}