public abstract class Animals {
    private String nickname;
    private int age;
    private String breed;

    public Animals(String nickname, int age, String breed) {
        this.nickname = nickname;
        this.age = age;
        this.breed = breed;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }
}

class Cat extends Animals {
        public Cat(String nickname, int age, String breed) {
            super(nickname, age, breed);
        }

        public void run() {
            System.out.println(this.getNickname() + " побежал");
        }
    }

    class Bird extends Animals{
        public Bird(String nickname, int age, String breed) {
            super(nickname, age, breed);
        }

        public void fly() {
            System.out.println(this.getNickname() + " полетел");
        }
    }


