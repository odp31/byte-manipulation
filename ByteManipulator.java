public class ByteManipulator
  {
    public static byte setBit(byte b, int bitPosition) {
      return (byte) (b | (1 << bitPosition));
    }
    public static byte clearBit(byte b, int bitPosition) {
      return (byte) (b & ~(1 << bitPosition));
    }
    public static boolean getBit(byte b, int bitPosition) {
      return (b & (1 << bitPosition)) != 0;
    }
    public static byte toggleBit(byte b, int bitPosition) {
      return (byte) (b ^ (1 << bitPosition));
    }
  }
public class Main {
  public static void main(String[] args) {
    byte b = 10; // binary: 00001010
    // set the 3rd bit (index 2)
    b = ByteManipulator.setBit(b, 2);     // binary: 00011010
    // clear first bit (index 0)
    b = ByteManipulator.clearBit(b, 0);     // binary: 00011000
    // get value of 4th bit (index 3)
    boolean bitValue = ByteManipulator.getBit(b, 3);
    System.out.println("Bit 3 value: " + bitValue);
    // toggle 2nd bit (index 1)
    b = ByteManipulator.toggleBit(b, 1);
    System.out.println("final byte value: " + b);
  }
}
