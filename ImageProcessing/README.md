# Image Processing

This project is a Java-based image processing application that allows users to manipulate images by cropping, mirroring (horizontally or vertically), and converting them to greyscale. The program runs in a command-line interface and provides an interactive menu for users to select different image processing operations.

---

## Features

- **Display Image**: Opens and displays an image in a separate window.
- **Crop Image**: Allows users to crop an image by specifying x and y percentages.
- **Greyscale Conversion**: Converts an image to greyscale by averaging RGB values.
- **Mirror Image**:
  - **Horizontal Flip**: Flips the image along its vertical center line.
  - **Vertical Flip**: Flips the image along its horizontal center line.

---

## How to Run

1. Compile the Java program:
   ```sh
   javac ImageManipulator.java
   ```
2. Run the program:
   ```sh
   java ImageManipulator
   ```
3. Follow the on-screen prompts to select an image file and apply processing options.

---

## Code Structure

- **ImageManipulator.java**: The main program that provides a menu for image manipulation.
- **displayImage(BufferedImage pic)**: Displays an image in a separate window.
- **crop(int x, int y, BufferedImage pic)**: Crops an image based on percentage values.
- **mirrorHorizontal(BufferedImage pic)**: Mirrors an image horizontally.
- **mirrorVertical(BufferedImage pic)**: Mirrors an image vertically.
- **greyscale(BufferedImage pic)**: Converts an image to greyscale.

---

## Author

- **Name**: Yousef
- **GitHub**: [YousefY02](https://github.com/YousefY02)

