public class color{
public static void main(String[] args){
Rectangle r1 = new rectangle();
r1.setColor(Color.blue);
Rectangle r2 = r1;
r2.setColor(Color.red);
System.out.print(r1);

}
}