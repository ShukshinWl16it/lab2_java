# Шукшин Владимир ИТ-16 Лабораторная №2

# Задание 1
## Задача 4
### Время
Переводит секунды в формат ЧЧ:ММ:СС
### Алгоритм решения
Создается класс Time с полем private int secunds. Добавленны конструкторы по умолчанию, по значению. 
Проверка исключений через trow.
int secondsDay=secunds%(3600*24);
int hours=secondsDay/3600;
int minutes=(secondsDay%3600)/60;
int seconds=secondsDay%60;
return hours+":"+minutes+":"+seconds;

<img width="399" height="89" alt="image" src="https://github.com/user-attachments/assets/2ad79347-b787-489f-a9c0-f07461c44430" />

# Задание 1
## Задача 5
### Дом
Создает дом с определенным количеством этажей
### Алгоритм решения
Создается класс House c полем private int floors; 
Добавлен конструктор по значению.
Проверка исключений через trow.
Вывод информации о этажах в правильном виде:
int floorInHouse=getFloors();
if(floorInHouse%10==1){
    return "дом с " + floorInHouse+" этажом";
}
else{
    return "дом с "+floorInHouse+" этажами";
}

<img width="291" height="92" alt="image" src="https://github.com/user-attachments/assets/ae736183-87e8-4d02-91ee-cb654a63940d" />

# Задание 2
## Задача 4
### Сотрудники и отделы
Создает сотрудника с именем, в каком отделе работает и кто начальник
### Алгоритм решения
Создается класс Employee с полями:
private String name;
private String departmentName;
private Employee boss;
Добавлен конструктор по умолчанию, по значениям без босса, по значением с боссом.
Добавлены геттеры и сеттеры.
Правильный вывод информации о сотрудниках:
public String toString(){
    if(boss==null||this==boss){
        return name+" начальник отдела "+departmentName;
    }
    else{
        return name+" работаетe в отделе "+departmentName+", начальник которого "+boss.getName();
    }
}

<img width="615" height="92" alt="image" src="https://github.com/user-attachments/assets/af14faa8-5217-4833-9328-e285cd4f9a39" />

# Задание 3
## Задача 4
### Сотрудники и отделы(обновление)
Создает сотрудника с именем, в каком отделе работает и кто начальник
### Алгоритм решения
Все как в предыдущем задании 2.4
Добавлен вывод сотрудников одного отдела:
1. Создается массив private static Employee[] allEmployees=new Employee[50]; для хранения всех сотрудников
2. Создается метод для добавления в массив со всеми сотрудниками
3. Подсчитываются сотрудники из одного отдела и создается статический массив с их количеством
for(int i=0;i<count;i++){
    if(allEmployees[i].getDepartmentName()==this.departmentName){
        c++;
    }
}
5. Создается массив и вносятся сотрудники одного из отделов, по ссылке на одного сотрудника
for(int i=0;i<count;i++){
    if(allEmployees[i].getDepartmentName()==this.departmentName){
        departmentEmployees[index]=allEmployees[i];
        index++;
    }
}
6. Выводятся информация о сотрудниках по сотруднику который работает в этом отделе
public static void printEmployees(Employee[] employees){
    for(int i=0;i<employees.length;i++){
        System.out.println(employees[i]);
    }
}
# Задание 4
## Задача 3
### Дом(обновление)
Создает дом с определенным количеством этажей и их нельзя поменять 
### Алгоритм решения
Все как и в предыдущем задании с домами, только изменено что поле теперь private final int floors для того чтобы нельзя было поменять значение уже существующего дома.
Убран сеттер для того чтобы пользователь не менял количество этажей дома

<img width="491" height="130" alt="image" src="https://github.com/user-attachments/assets/f714d347-7bc5-4abf-805e-c598e9e5806d" />

# Задание 5
## Задача 1
### Пистолет
Создает пистолет, который стреляет с звуком Бах!, если патроны закончились то Клац!
### Алгоритм решения
Создается класс Gun с полем private int cartridges.
Сделан конструктор по умолчанию, где устанавливается значение патронов 5 и конструктор по значению.
Сделана проверка исключений через trow.
Добавлены геттеры и сеттеры.
Пистолет делает выстрел и проверяет количество патронов через функцию, выводит резултат.
public String toString(){
    if (getCartridges() > 0){
        setCartridges(getCartridges() - 1);
        return "Бах!";
    } else{
        return "Клац!";
    }
}

<img width="291" height="241" alt="image" src="https://github.com/user-attachments/assets/b56f1a18-8297-4f76-bffc-8bf9dc3169b3" />
