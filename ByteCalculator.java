import java.util.Scanner;

public class ByteCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter first byte value: ");
    byte byte1 = scanner.nextByte();

    System.out.print("enter second byte value: ");
    byte byte2 = scanner.nextByte();

    System.out.println("choose an operation: ");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");

    int choice = scanner.nextInt();
    byte result;

    swtich(choice) {
      case 1:
        result = (byte) (byte1 + byte2);
        System.out.println("result: " + result);
        break;
      case 2:
        result = (byte) (byte1 - byte2);
        System.out.println("result: " + result);
        break;
      case 3:
        result = (byte) (byte1 * byte2);
        System.out.println("result: " + result);
        break;
      case 4:
        if (byte2 == 0) {
          System.out.println("error: division by zero");
      } else {
        result = (byte) (byte1 / byte2);
        System.out.println("Result: " + result);
      }
      break;
      default:
        System.out.println("invalid choice");
    }
    scanner.close();
  }
}
