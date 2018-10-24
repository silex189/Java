package chapter6_Methods_And_Classes_In_Deep;

public class ControledArray {

  private int array[];
  private int errorValue;
  public int length;

  public ControledArray(int length, int errorValue) {
    array = new int[length];
    this.errorValue = errorValue;
    this.length = length;
  }

  public int get(int index) {
    if(indexOf(index)) return array[index];
    return errorValue;
  }

  public boolean put(int index, int value) {
    if(indexOf(index)) {
      array[index] = value;
      return true;
    }
    return false;
  }

  private boolean indexOf(int index) {
    if(index >= 0 & index < length) return true;
    return false;
  }
}
