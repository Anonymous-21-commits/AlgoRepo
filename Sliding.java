public class Sliding {
    public int find(int[] arr, int k) {
        int i = 0, j = 0, n = arr.length, op = 0, len = 0;
        while (j < n) {
            // perform the operation (say addition)
            op += arr[j];
            while (op > k) {
                // remove the contribution of ith index
                op -= arr[i];
                //do reverse operation to remove contribution
                i++;
            }
            len = Math.max(j - i + 1, len); //update len of valid case
            j++;
        }
        return len;
    }// T.C O(N)
    // S.C O(1)
}
