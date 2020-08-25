public class Tester {
    public static void main(String[] args) {
        Person me=new Person();
        me.setFirstName("Omnia");
        me.setGender(true);
        me.setHeight(170);
        System.out.println("me="+me);
        Person rody=new Person(35,true,"Rodyna","Ismail",null,15);
        System.out.println("about "+rody);
    }
}
