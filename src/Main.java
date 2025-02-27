public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        String firstName = "Ivan";       //для хранения имени.
        String middleName = "Ivanovich"; //для хранения отчества.
        String lastName = "Ivanov";      //для хранения фамилии.
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Задача №2
        System.out.println("Задача №2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задача №3
        System.out.println("Задача №3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName.replace('ё', 'е'));
    }
}