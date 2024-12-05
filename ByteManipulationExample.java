import java.io.*;

public class ByteManipulationExample {
  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("output.bin");
         DataOutputStream dos = new DataOutputStream(fos)) {
      dos.writeByte(10);
      dos.writeInt(12345);
      dos.writeDouble(3.14159);
    } catch (IOException e) {
      e.printStackTrace();
    }
    try (FileInputStream fis = new FileInputStream("output.bin");
         DataInputStream dis = new DataInputStream(fis)) {
      byte b = dis.readByte();
      int i = dis.readInt();
      double d = dis.readDouble();

      System.out.println("byte: " + b);
      System.out.println("integer: " + i);
      System.out.println("double: " + d);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
