import java.util.Scanner;
class Box{
    int length;
    int bredth;
    int hight;
    public Box(int length,int bredth,int hight){
        this.length=length;
        this.bredth=bredth;
        this.hight=hight;
    }
    public Box(Box b){
        this.length=b.length;
        this.bredth=b.bredth;
        this.hight=b.hight;
        System.out.println("the variables are initialised \n"+length+" "+bredth+" "+hight);
    }
    public void volum(){
        int volume=length*bredth*hight;

        System.out.println("the volume of the box is" + volume);

    }

}
public class boxcode{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of the length");
        int l=sc.nextInt();

        System.out.println("enter the value of the bredth");
        int b=sc.nextInt();

        System.out.println("enter the value of the height");
        int h=sc.nextInt();

        Box bo = new Box(l,b,h);

        bo.volum();

        Box bx = new Box(bo);

    }
} 