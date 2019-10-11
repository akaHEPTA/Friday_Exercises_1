package Week1.Classes;

import org.w3c.dom.css.Rect;

public class Rectangle {
    private int width = 0;
    private int height = 0;
    private String color = "Blue";

    public Rectangle() { }

    public Rectangle(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public Rectangle(int width, int height, String color) {
        this.setWidth(width);
        this.setHeight(height);
        this.setColor(color);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0)
            this.width = width;
        else
            this.width = 1;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
        else
            this.height = 1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.length() > 2 && color.length() < 20)
            this.color = color.substring(0, 1).toUpperCase() + color.substring(1);
        else
            this.color = "Blue";
    }

    public void draw() {
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) {
                System.out.print(this.color.substring(0,1));
            }
            System.out.println();
        }
    }
}
