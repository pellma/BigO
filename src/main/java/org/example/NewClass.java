package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NewClass {
    public static int getLargest(int arr[], int sz) {
        int iterate1 = 0;      // 1
        int iterate2 = 0;      // 1
        int largest = 0;       // 1

        while (iterate1 < sz - 1) {      // (n+1)+1
            iterate2++;                   // 1+n
            if (iterate2 == sz) {         // 1+n
                iterate1++;               // 1+n
                iterate2 = iterate1;      // 1+n
                continue;                 // 1
            }

            int product = arr[iterate1] * arr[iterate2];  //  n*n = n^2 (this part here makes me thing O(n^2)
            if (product > largest)        // (n+1)
                largest = product;        // (1+n)
        }

        return largest;                   // 1
    }
}

//my answer is still O(n^2)