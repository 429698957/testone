public class Person {
    public Integer age ;
    public String sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != null ? !age.equals(person.age) : person.age != null) return false;
        return sex != null ? sex.equals(person.sex) : person.sex == null;
    }

    @Override
    public int hashCode() {
        int result = age != null ? age.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

    public Person(Integer age, String sex) {
        this.age = age;
        this.sex = sex;

    }
}
