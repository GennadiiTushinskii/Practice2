public abstract class People {
    String name;
    int age;
    String profession;

    public People(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    abstract String getProfession();
    abstract int getAge();
    abstract String getName();
}
