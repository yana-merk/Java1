public class Employee {
    public String name;
    public String profession;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String profession, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + name + " | " + " Profession: " + profession + " | " + " Email: " + email + " | " +
                " Phone: " + phoneNumber + " | " + " Salary: " + salary + " | " + " Age: " + age);
    }
}
