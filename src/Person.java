public class Person {
private String name;
private String lastname;
private int age;
private int hp;
private Person mother;
private Person father;
    public Person(String name, String lastname, int age, Person mother, Person father) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.hp = 100;
        this.mother = mother;
        this.father = father;
    }
public void info(){
        String info = "Меня зовут "+this.name+"\n"+
                "Моя фамилия "+this.lastname+"\n"+
                "Мне "+this.age+" лет\n";
                if(this.mother != null) {
                    info += "Мою маму зовут " + this.mother.name + "\n";
                }
                        if(this.father != null) {
                            info += "Моего папу зовут " + this.father.name;
                        }
    System.out.println(info);
}
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp){
        if (this.hp + hp > 100) this.hp = 100;
        else this.hp = this.hp + hp;
    }


    public void sayHi(){
    System.out.println("Hello world");
}
}


