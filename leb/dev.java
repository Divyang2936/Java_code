// public class RandomLicensePlate {
public class dev {

    

public static void main(String[] args) {

    StringBuilder licensePlate = new StringBuilder();

    for (int i = 0; i < 6; i++) {

        if (i < 3) { // Generate letters for the first three positions

            char letter = (char) ('A' + Math.random() * ('Z' - 'A' + 1));

            licensePlate.append(letter);

        } else { // Generate digits for the last three positions

            char digit = (char) ('0' + Math.random() * ('9' - '0' + 1));

            licensePlate.append(digit);

        }

    }

    System.out.println("Generated License Plate: " + licensePlate.toString());

}
}

