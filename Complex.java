import java.util.Scanner;

public class Complex{
    float real,img;
     // Default constructor
     Complex() {
        real = 0;
        img = 0;
    }

    // Parameterized constructor
    Complex(float real, float img) {
        this.real = real;
        this.img = img;
    }
    Complex add(Complex a){
        Complex temp = new Complex();
        temp.real = this.real + a.real;
        temp.img = this.img + a.img;
        return temp;
    }
    Complex sub(Complex a){
        Complex temp = new Complex();
        temp.real = this.real - a.real;
        temp.img = this.img - a.img;
        return temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        System.out.println("enter first real number : ");
        c1.real=sc.nextInt();
        System.out.println("enter your first imaginary number : ");
        c1.img=sc.nextInt();
        System.out.println("enter second real number : ");
        c2.real=sc.nextInt();
        System.out.println("enter your second imaginary number : ");
        c2.img=sc.nextInt();
        Complex result;
        result = c1.add(c2);
        System.out.println("Addition : "+result.real+"+"+result.img+"i");
        result = c1.sub(c2);
        System.out.println("Subtraction : "+result.real+"+"+result.img+"i");
    }
}
