package lessons.lesson3.time_complexity;

public class PermMissingElem {

    public int solution(int[] array) {

        if (array.length == 0)
            return 1;
        quicksort(array, 0, array.length - 1);
        if (array[0] > 1)
            return array[0] - 1;
        if (array.length > 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (i + 1 <= array.length) {
                    if (array[i] + 1 != array[i + 1])
                        return array[i] + 1;
                }
            }
            if (array[array.length - 1] < 100001)
                return array[array.length - 1] + 1;
        }
        return array[0] + 1;
    }

    private void quicksort(int tablica[], int x, int y) {
        int i, j, v, temp;
        i = x;
        j = y;
        v = tablica[(x + y) / 2];
        do {
            while (tablica[i] < v)
                i++;
            while (v < tablica[j])
                j--;
            if (i <= j) {
                temp = tablica[i];
                tablica[i] = tablica[j];
                tablica[j] = temp;
                i++;
                j--;
            }
        }
        while (i <= j);
        if (x < j)
            quicksort(tablica, x, j);
        if (i < y)
            quicksort(tablica, i, y);
    }
}
