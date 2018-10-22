package chapter6;

public class QuickSort {

  static void quickSort(char items[]) {
    quickSortChar(items, 0, items.length-1);
  }

  static void quickSort(int items[]) {
    quickSortInt(items, 0, items.length-1);
  }

  private static void quickSortChar(char items[], int maxLeft, int maxRight) {
    int left, right;
    char middlePoint, tmp;

    left = maxLeft; right = maxRight;
    middlePoint = items[(maxLeft+maxRight) / 2];

    do {
      //swaping left for right position
      while((items[left] < middlePoint) && (left < maxRight))
        left++;
      while((middlePoint < items[right]) && (right > maxLeft))
        right--;

      if(left <= right) {
        tmp = items[left];
        items[left] = items[right];
        items[right] = tmp;
        left++; right--;
      }
    } while(left <= right); //swaping again right for left position

    if(maxLeft < right) quickSortChar(items, maxLeft, right);
    if(left < maxRight) quickSortChar(items, left, maxRight);
  }
  private static void quickSortInt(int items[], int maxLeft, int maxRight) {
    int left, right;
    int middlePoint, tmp;

    left = maxLeft; right = maxRight;
    middlePoint = items[(maxLeft+maxRight) / 2];

    do {
      //swaping left for right position
      while((items[left] < middlePoint) && (left < maxRight))
        left++;
      while((middlePoint < items[right]) && (right > maxLeft))
        right--;

      if(left <= right) {
        tmp = items[left];
        items[left] = items[right];
        items[right] = tmp;
        left++; right--;
      }
    } while(left <= right); //swaping again right for left position

    if(maxLeft < right) quickSortInt(items, maxLeft, right);
    if(left < maxRight) quickSortInt(items, left, maxRight);
  }
}
