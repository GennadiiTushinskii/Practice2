public class Teacher extends People{
    String subject;

    public Teacher(String name, int age, String profession, String subject) {
        super(name, age, profession);
        this.subject = subject;
    }

    @Override
    public String getProfession() {
        return this.profession;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public String giveALesson(){
        return "The lesson was ended";
    }
}
