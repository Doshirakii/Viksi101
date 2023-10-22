public class Family {
    public static void main(String[] args){
        Person nina = new Person("Nina","Ivanova", 60, null,null);
        Person sergey = new Person("Sergey","Ivanov",33, nina, null);
        Person eva = new Person("Lena", "Ivanova", 32, null,null);
        Person ivan = new Person("Ivan","Ivanov", 12, eva, sergey);
        //System.out.println(ivan.getFather().getMother().getName());
        eva.info();
    }
}
