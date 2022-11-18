class Pen{
    String colour;
    String type;
    public void write(){
        System.out.println("SAjidpenscompany.slavic ");
    }   //Method 
    public void printcolour(){
        System.out.println(this.colour);
    }
}

public class OOP1{
    public static void main(String[] args){
        Pen obj = new Pen();
        obj.colour= "blue";
        obj.type="Normal";
        obj.write();

        Pen x= new Pen();
        x.colour = "Red";
        x.type="Ball point ";

        x.printcolour();
        obj.printcolour();



    }

}