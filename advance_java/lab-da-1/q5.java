import java.util.Scanner;
abstract class Shape{  
    abstract void area();  
  }  

class Rectangle extends Shape{  
    int length,breadth;  
    void area(){  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the  rectangle: ");
        length=sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        breadth=sc.nextInt();
        System.out.print("Area of Rectangle: "+(length*breadth));  
    }  
}

//square, triangle, circle
class Square extends Shape{  
    int side;  
    void area(){  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        side=sc.nextInt();
        System.out.print("Area of Square: "+(side*side));  
    }  
}

class Triangle extends Shape{  
    int base,height;  
    void area(){  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base=sc.nextInt();
        System.out.print("Enter the height of the triangle: ");
        height=sc.nextInt();
        System.out.print("Area of Triangle: "+(0.5*base*height));  
    }  
}

class Circle extends Shape{  
    int radius;  
    void area(){  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius=sc.nextInt();
        System.out.print("Area of Circle: "+(3.14*radius*radius));  
    }  
}

public class q5 {
    static void menu()
    {
        Shape s;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                s=new Rectangle();
                s.area();
                break;
            case 2:
                s=new Square();
                s.area();
                break;
            case 3:
                s=new Triangle();
                s.area();
                break;
            case 4:
                s=new Circle();
                s.area();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        menu();
    }
    public static void main(String[] args) {
        menu();
        }
}
