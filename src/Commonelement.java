import java.util.ArrayList;

public class Commonelement {


        ArrayList<Integer> commonelementinthreesortedarray(int[] a, int[] b, int[] c, int n1, int n2, int n3) {
            int i = 0, j = 0, k = 0;
            ArrayList<Integer> ar = new ArrayList<>();
            while (i < n1 && j < n2 && k < n3) {
                if (a[i] == b[i] && b[i] == c[k]) {
                    if (ar.contains(a[i]) != true) {
                        ar.add(a[i]);
                    }
                    i++;
                    j++;
                    k++;
                } else if (a[i] < b[j]) {
                    i++;
                } else if (b[j] < c[k]) {
                    j++;
                } else {
                    k++;
                }
            }
            return ar;
        }
    }




