import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int choice,floors,choiceHouse;
        do{
            System.out.println("1. Задание 1.1 Время ");
            System.out.println("2. Задание 1.2 Дома");
            System.out.println("3. Задание 2 Сотрудники и отделы");
            System.out.println("4. Задание 3 Сотрудники и отделы(обновление)");
            System.out.println("5. Задание 4 Дома(обновление)");
            System.out.println("6. Задание 5 Пистолет");
            System.out.println("0. Выход");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    try{
                        System.out.println("Пример преобразования 10, 10000, 100000 секунд: ");
                        Time time1=new Time();
                        time1.setSecunds(10);
                        Time time2=new Time();
                        time2.setSecunds(10000);
                        Time time3=new Time();
                        time3.setSecunds(100000);
                        System.out.println("Первое время: "+time1);
                        System.out.println("Второе время: "+time2);
                        System.out.println("Третье время: "+time3);
                    }catch(IllegalArgumentException e){
                    System.out.println("Ошибка: "+e.getMessage());
                }

                    break;
                case 2:
                    System.out.println("Примеры вывода с 1, 5, 23 этажами: ");
                    House house1=new House(1);
                    House house2=new House(5);
                    House house3=new House(23);
                    System.out.println("Первый дом: "+house1);
                    System.out.println("Второй дом: "+house2);
                    System.out.println("Третий дом: "+house3);
                    break;
                case 3:
                    Employee petrov=new Employee("Петров","IT");
                    Employee kozlov=new Employee("Козлов","IT");
                    Employee sidorov =new Employee("Сидоров","IT");
                    kozlov.setBoss(kozlov);
                    petrov.setBoss(kozlov);
                    sidorov.setBoss(kozlov);
                    System.out.println("Информация о трех сотрудниках: ");
                    System.out.println("Инфо про Петрова: "+petrov);
                    System.out.println("Инфо про Козлова: "+kozlov);
                    System.out.println("Инфо про Сидорова: "+ sidorov);
                    break;
                case 4:
                    Employee shukshin=new Employee("Шукшин","HR");
                    Employee kosareva=new Employee("Косарева","HR");
                    shukshin.setBoss(shukshin);
                    kosareva.setBoss(shukshin);
                    Employee romov =new Employee("Ромов","Sales");
                    Employee sirin=new Employee("Сирин","Sales");
                    romov.setBoss(romov);
                    sirin.setBoss(romov);

                    System.out.println("Информация о сотрудниках: ");
                    System.out.println("Инфо про Шукшина: "+shukshin);
                    System.out.println("Инфо про Косареву: "+kosareva);
                    System.out.println("Инфо про Ромова: "+ romov);
                    System.out.println("Инфо про Сирин: "+ sirin);
                    System.out.println("Все сотрудники HR отдела:");
                    Employee[] hrDepartment=shukshin.getDepartmentEmployees();
                    Employee.printEmployees(hrDepartment);
                    System.out.println("Все сотрудники Sales отдела:");
                    Employee[] salesDepartment=romov.getDepartmentEmployees();
                    Employee.printEmployees(salesDepartment);
                    break;
                case 5:
                    try{
                        House house4=new House(2);
                        House house5=new House(35);
                        House house6=new House(91);
                        System.out.println("Первый дом: "+house4);
                        System.out.println("Второй дом: "+house5);
                        System.out.println("Третий дом: "+house6);
                        house4.setFloors(45);
                        house5.setFloors(5);
                        System.out.println("Первый дом: "+house4);
                        System.out.println("Второй дом: "+house5);
                        System.out.println("Третий дом: "+house6);
                        House house7=new House(-56);
                        House house8=new House(0);
                        House house9=new House(1000);

                    }catch(IllegalArgumentException e){
                        System.out.println("Ошибка: "+e.getMessage());
                    }

                    break;
                case 6:
                    try{
                        Gun gun=new Gun(3);
                        System.out.println("Количество патронов: "+gun.getCartridges());
                        for(int i=1;i<6;i++){
                            System.out.println(i+" выстрел: "+gun);
                            System.out.println("Оставшееся количество патронов: "+gun.getCartridges());
                        }
                        break;
                    }catch(IllegalArgumentException e){
                        System.out.println("Ошибка: "+e.getMessage());
                    }
            }
        }while(choice!=0);
    }
}
