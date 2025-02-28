///@author Yousef Yousef
/// This class process an image either cropping, mirroring or greyscaling it
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ImageManipulator {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file path of the image:");
        String filePath = scan.nextLine();
        BufferedImage image = ImageIO.read(new File(filePath));

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("0 - Display image");
            System.out.println("1 - Crop");
            System.out.println("2 - Greyscale");
            System.out.println("3 - Flip");
            System.out.println("4 - Quit");
            int choice = scan.nextInt();

            switch (choice) {
                case 0:
                    displayImage(image);
                    break;
                case 1:
                    System.out.println("Enter x and y percentages:");
                    int x = scan.nextInt();
                    int y = scan.nextInt();
                    BufferedImage croppedImage = crop(x, y, image);
                    displayImage(croppedImage);
                    break;
                case 2:
                    BufferedImage greyImage = greyscale(image);
                    displayImage(greyImage);
                    break;
                case 3:
                    System.out.println("Enter 1 for vertical flip or 2 for horizontal flip:");
                    int flipChoice = scan.nextInt();
                    if (flipChoice == 1) {
                        BufferedImage verticalFlippedImage = mirrorVertical(image);
                        displayImage(verticalFlippedImage);
                    } else if (flipChoice == 2) {
                        BufferedImage horizontalFlippedImage = mirrorHorizontal(image);
                        displayImage(horizontalFlippedImage);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void displayImage(BufferedImage pic) {
        JFrame frame = new JFrame();
        frame.add(new JLabel(new ImageIcon(pic)));
        frame.getContentPane();
        frame.setVisible(true);
        frame.setSize(pic.getWidth(), pic.getHeight());
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method crops an image according to the new width and new height calculated from the given percentages
     * and return the result of the image
     *
     * @param x   The percentage of the width to crop.
     * @param y   The percentage of the height to crop.
     * @param pic The original image to crop.
     * @return A new BufferedImage containing the cropped region.
     */
    public static BufferedImage crop(int x, int y, BufferedImage pic) {
        //Calculates new dimensions from the given percentages
        int cropWidth = pic.getWidth() * x / 100;
        int cropHeight = pic.getHeight() * y / 100;
        //Creating new blank image to store the cropped image
        BufferedImage croppedImage = new BufferedImage(cropWidth, cropHeight, BufferedImage.TYPE_INT_RGB);
        //Copying pixels from the original image to the cropped image
        for (int i = 0; i < cropWidth; i++) {
            for (int j = 0; j < cropHeight; j++) {
                int rgb = pic.getRGB(i, j);//getting the RGB value from the original image
                croppedImage.setRGB(i, j, rgb);// Set RGB value in the cropped image
            }
        }
        return croppedImage;

    }

    /**
     * Mirrors an image horizontally by flipping it along its vertical center line.
     * The left side of the image becomes the right side, and vice versa.
     *
     * @param pic The original image to mirror.
     * @return A new BufferedImage containing the horizontally mirrored image.
     */
    public static BufferedImage mirrorHorizontal(BufferedImage pic) {
        int width = pic.getWidth();
        int height = pic.getHeight();
        BufferedImage mirroredImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // Iterating over each pixel in the original image
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                //width - 1 is the last column of the image
                mirroredImage.setRGB(width - 1 - x, y, pic.getRGB(x, y));//calculates the mirrored position of each pixel
            }
        }
        return mirroredImage;
    }

    /**
     * Mirrors an image vertically by flipping it along its horizontal center line.
     * The top side of the image becomes the bottom side, and vice versa.
     *
     * @param pic The original image to mirror.
     * @return A new BufferedImage containing the vertically mirrored image.
     */
    public static BufferedImage mirrorVertical(BufferedImage pic) {
        int width = pic.getWidth();
        int height = pic.getHeight();
        BufferedImage mirroredImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                //Calculating the last row of the image (height-1)
                //Set the pixel at the mirrored position
                mirroredImage.setRGB(x, height - 1 - y, pic.getRGB(x, y));
            }
        }

        return mirroredImage;
    }

    /**
     * Converts an image to greyscale by setting each pixel's RGB values to their average.
     * The resulting image appears in shades of grey.
     *
     * @param pic The original image to convert to greyscale.
     * @return A new BufferedImage containing the greyscale version of the image.
     */
    public static BufferedImage greyscale(BufferedImage pic) {
        int width = pic.getWidth();
        int height = pic.getHeight();
        BufferedImage greyImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                //Extracting the RGB value of the pixel and creating color object
                Color color = new Color(pic.getRGB(i, j));
                //Calculating the average of RGB components to get Grey value
                int greyValue = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                //Creating a new grey color using the grey value
                Color greyColor = new Color(greyValue, greyValue, greyValue);
                //Setting the pixel in the greyscale image to the new grey color
                greyImage.setRGB(i, j, greyColor.getRGB());
            }
        }

        return greyImage;
    }
}
