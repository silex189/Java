package chapter6;

class Block {

  private int height, length, width;
  private int volume;

  Block(int height, int length, int width) {
    this.height = height;
    this.length = length;
    this.width = width;
    volume = height * length * width;
  }

  boolean sameBlock(Block block) {
    if((block.height == height) & (block.length == length) & (block.width == width))
      return true;
    else return false;
  }

  boolean sameVolume(Block block) {
    if(block.volume == volume)
      return true;
    else return false;
  }
}

public class BlockDemo {

	public static void main(String[] args) {
		Block block1 = new Block(10, 2, 5);
		Block block2 = new Block(10, 2, 5);
		Block block3 = new Block(4, 5, 5);

		System.out.println("block1 same dimensions as block2: " + block1.sameBlock(block2));
		System.out.println("block1 same dimensions as block3: " + block1.sameBlock(block3));
		System.out.println("block1 same volume as block2: " + block1.sameVolume(block3));
	}

}
