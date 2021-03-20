package ClassFiles;

import java.util.Scanner;

interface Shapes2D {
    float surfaceArea();
}

interface Shapes3D extends Shapes2D {
    float volume();
}

class Rectangle implements Shapes2D{
    protected float length;
    protected float breadth;

    //Constructor
    public Rectangle(){
        length=5.0f;
        breadth=5.0f;
    }
    //Setter
    public void setLength(float x) {
        length=x;
    }
    public void setBreadth(float x) {
        breadth = x;
    }

    //Getter
    public float getLength(){
        return length;
    }
    public float getBreadth() {
        return breadth;
    }

    
    public float surfaceArea(){
        return length*breadth;
    }

    public void callRectangle(){
        Scanner sc=new Scanner(System.in);
        int manipulation;

        do {
            System.out.println("\nYour Rectangle is ready. You can do this operations:");
            System.out.println("1.Find Area\n2.Change the length\n3.Change the breadth\n4.Get the length\n5.Get the breadth\n6.Destroy it");
            System.out.print("Enter your choice: ");
            manipulation = sc.nextInt();

            switch (manipulation) {
            case 1: {
                System.out.println(this.surfaceArea());
                break;
            }
            case 2: {
                System.out.print("Enter the new length: ");
                this.setLength(sc.nextFloat());
                System.out.println("\nLength successfully changed!");
                break;
            }
            case 3: {
                System.out.print("Enter the new breadth: ");
                this.setBreadth(sc.nextFloat());
                System.out.println("\nBreadth successfully changed!");
                break;
            }
            case 4: {
                System.out.println("Rectangle's length is: " + this.getLength());
                break;
            }
            case 5: {
                System.out.println("Rectangle's breadth is: " + this.getBreadth());
                break;
            }
            case 6:
                break;
            }
        } while (manipulation == 1 || manipulation == 2 || manipulation == 3 || manipulation == 4 || manipulation == 5);
    }
}

class Square implements Shapes2D{
    protected float side;
    
    // Constructor
    public Square(){
        side=5.0f;
    }
    // Setter
    public void setSide(float x) {
        side = x;
    }
    // Getter
    public float getSide() {
        return side;
    }

    public float surfaceArea(){
        return side*side;
    }

    public void CallSquare(){
        Scanner sc = new Scanner(System.in);
        int manipulation;

        do {
            System.out.println("\nYour Square is ready. You can do this operations:");
            System.out.println("1.Find Area\n2.Change the side\n3.Get the side\n4.Destroy it");
            System.out.print("Enter your choice: ");
            manipulation = sc.nextInt();
            switch (manipulation) {
                case 1: {
                    System.out.println(this.surfaceArea());
                    break;
                }
                case 2: {
                    System.out.print("Enter the new side: ");
                    this.setSide(sc.nextFloat());
                    System.out.println("\nSide successfully changed!");
                    break;
                }
                case 3: {
                    System.out.println("Square's side is: " + this.getSide());
                    break;
                }
                case 4: {
                    break;
                }
            }
        } while (manipulation == 1 || manipulation == 2 || manipulation == 3);
    }
}

class Circle implements Shapes2D{
    protected float radius;
    
    // Constructor
    public Circle(){
        radius=5.0f;
    }

    // Setter
    public void setRadius(float x) {
        radius = x;
    }

    // Getter
    public float getRadius() {
        return radius;
    }

    public float surfaceArea(){
        return (float)Math.PI*radius*radius;
    }

    public void callCircle(){
        Scanner sc = new Scanner(System.in);
        int manipulation;

        do {
            System.out.println("\nYour Circle is ready. You can do this operations:");
            System.out.println("1.Find Area\n2.Change the radius\n3.Get the radius\n4.Destroy it");
            System.out.print("Enter your choice: ");
            manipulation = sc.nextInt();
            switch (manipulation) {
                case 1: {
                    System.out.println(this.surfaceArea());
                    break;
                }
                case 2: {
                    System.out.print("Enter the new radius: ");
                    this.setRadius(sc.nextFloat());
                    System.out.println("\nRadius successfully changed!");
                    break;
                }
                case 3: {
                    System.out.println("Circle's radius is: " + this.getRadius());
                    break;
                }
                case 4: {
                    break;
                }
            }
        } while (manipulation == 1 || manipulation == 2 || manipulation == 3);
    }
}

class Cylinder extends Circle implements Shapes3D{
    protected float height;

    // Setter
    public void setHeight(float x) {
        height = x;
    }
    // Getter
    public float getHeight() {
        return height;
    }

    public float surfaceArea() {
        return (float)Math.PI*radius*2*(height+radius);
    }
    public float volume(){
        return (float)Math.PI*radius*radius*height;
    }

    public void callCylinder(){
        Scanner sc = new Scanner(System.in);
        int manipulation;

        do {
            System.out.println("\nYour Cylinder is ready. You can do this operations:");
            System.out.println(
                    "1.Find Surface area\n2.Find volume\n3.Change the radius\n4.Change the height\n5.Get the radius\n6.Get the height\n7.Destroy it");
            System.out.print("Enter your choice: ");

            manipulation = sc.nextInt();

            switch (manipulation) {
                case 1: {
                    System.out.println(this.surfaceArea());
                    break;
                }
                case 2: {
                    System.out.println(this.volume());
                    break;
                }
                case 3: {
                    System.out.print("Enter the new radius: ");
                    this.setRadius(sc.nextFloat());
                    System.out.println("\nRadius successfully changed!");
                    break;
                }
                case 4: {
                    System.out.print("Enter the new height: ");
                    this.setHeight(sc.nextFloat());
                    System.out.println("\nHeight successfully changed!");
                    break;
                }
                case 5: {
                    System.out.println("Cylinder's radius is: " + this.getRadius());
                    break;
                }
                case 6: {
                    System.out.println("Cylinder's height is: " + this.getHeight());
                    break;
                }
                case 7: {
                    break;
                }
            }
        }while (manipulation==1||manipulation==2||manipulation==3||manipulation==4||manipulation==5||manipulation==6);
    
    }
}

class Sphere implements Shapes3D{
    
    protected float radius;
    
    // Constructor
    public Sphere(){
        radius=5.0f;
    }

    // Setter
    public void setRadius(float x) {
        radius = x;
    }

    // Getter
    public float getRadius() {
        return radius;
    }

    public float surfaceArea() {
        return 4*(float)Math.PI*radius*radius;
    }

    public float volume() {
        return 4*(float)Math.PI*radius*radius*radius/3;
    }

    public void callSphere() {
        
        Scanner sc = new Scanner(System.in);
        int manipulation;

        do {
            System.out.println("\nYour Sphere is ready. You can do this operations:");
            System.out.println("1.Find Surface area\n2.Find volume\n3.Change the radius\n4.Get the radius\n5.Destroy it");
            System.out.print("Enter your choice: ");

            manipulation = sc.nextInt();

            switch (manipulation) {
                case 1: {
                    System.out.println(this.surfaceArea());
                    break;
                }
                case 2: {
                    System.out.println(this.volume());
                    break;
                }
                case 3: {
                    System.out.print("Enter the new radius: ");
                    this.setRadius(sc.nextFloat());
                    System.out.println("\nRadius successfully changed!");
                    break;
                }
                case 4: {
                    System.out.println("Sphere's radius is: " + this.getRadius());
                    break;
                }
                case 5: {
                    break;
                }
            }
        } while (manipulation == 1 || manipulation == 2 || manipulation == 3 || manipulation == 4);
    }
}

public class CustomPackage {
    public static void main(String[] args) {
        
        Scanner main_class_scanner=new Scanner(System.in);
        /*
        You have to create a package named as ClassFiles
        This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
        These classes should use inheritance to properly manage the code!
        Include methods like volume, surface area, getters/setters for dimensions.
        */
        int user_input;
        do{
            
            System.out.println("\n\n\n\n\n----------------------------------------------------");
            System.out.println("Welcome to world of Shapes\n1.Create a rectangle\n2.Create a square\n3.Create a circle\n4.Create a cylinder\n5.Create a sphere\n6.Exit");
            System.out.println("----------------------------------------------------");
            System.out.print("Enter your choice: ");
            user_input=main_class_scanner.nextInt();
            
            switch(user_input){
                case 1:{
                    Rectangle rc=new Rectangle();

                    System.out.print("\nEnter the length of rectangle: ");
                    rc.setLength(main_class_scanner.nextFloat());
                    System.out.print("\nEnter the breadth of rectangle: ");
                    rc.setBreadth(main_class_scanner.nextFloat());

                    rc.callRectangle();
                    
                    break;
                }


                case 2:{
                    Square sq = new Square();
                    
                    System.out.print("\nEnter the side of square: ");
                    sq.setSide(main_class_scanner.nextFloat());

                    sq.CallSquare();
                    
                    break;
                }
                case 3:{
                    Circle c = new Circle();

                    System.out.print("\nEnter the radius of circle: ");
                    c.setRadius(main_class_scanner.nextFloat());

                    c.callCircle();
                    
                    break;
                }
                
                case 4:{
                    Cylinder cld = new Cylinder();

                    System.out.print("\nEnter the radius of cylinder: ");
                    cld.setRadius(main_class_scanner.nextFloat());
                    System.out.print("\nEnter the height of cylinder: ");
                    cld.setHeight(main_class_scanner.nextFloat());

                    cld.callCylinder();
                    
                    break;
                }


                case 5: {
                    Sphere sph = new Sphere();

                    System.out.print("\nEnter the radius of sphere: ");
                    sph.setRadius(main_class_scanner.nextFloat());

                    sph.callSphere();

                    break;
                }

                case 6: System.out.println("Good Bye!!"); System.exit(0);
            }

        }while(user_input==1||user_input==2||user_input==3||user_input==4||user_input==5);
        
        main_class_scanner.close();
    }
}