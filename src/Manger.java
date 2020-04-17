import Employee;

public class Manger extends Employee{
   private  double bonus;

    public Manger(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {

    }

   public void setBonus(double bonus) {
       this.bonus = bonus;
   }
}
