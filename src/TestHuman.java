public class TestHuman {
    public static void main(String[] args){
    Human.Head h=new Human.Head("brown","blue");
    Human.Leg l1=new Human.Leg('r');
    Human.Leg l2=new Human.Leg('l');
    Human.Arm a1=new Human.Arm('r');
    Human.Arm a2=new Human.Arm('l');
    Human h1=new Human(l1,l2,a1,a2,h);
    System.out.print(h1);
    }
}
