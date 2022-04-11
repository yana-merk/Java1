public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee(
                "Merkulov Ilya Aleksandrovich",
                "junior QA Engeneer",
                "merk@mail.ru",
                "8910795",
                50000,
                43
        );

        employeeArray[1]= new Employee(
                "Merkulova Yana Stanislavovna",
                "middle QA Engeneer",
                "merk1@mail.ru",
                "8920003",
                100000,
                25
        );

        employeeArray[2] = new Employee(
                "Golovin Alexey Leonidovich",
                "QA Engeneer",
                "gol@mail.ru",
                "8901234",
                100000,
                30
        );

        employeeArray[3] = new Employee(
                "Golovin Dmitry Alekseevich",
                "Java Developer",
                "gda@mail.ru",
                "8950485",
                150000,
                35
        );
        employeeArray[4] = new Employee(
                "Ivanov Ivan Ivanovich",
                "senior Java Developer",
                "iii@mail.ru",
                "8904295",
                200000,
                41
        );

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}


