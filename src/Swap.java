/**
 * @program: algrithm-template
 * @description: Swap function that often was used in biPointer problems
 * @author: Kiki
 * @create: 2022-04-16 16:59
 * @location: Fuzhou University
 **/
public class Swap {

    public void swap(char[] arr, int i1, int i2) {
        char temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
