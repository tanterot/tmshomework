package ext;

public class Director extends Employee {
    Employee[] subordinates; //для хронения подчиненых
    int count; //их подщет

    public Director(String name, String surname, int experience, int size) {
        super(name, surname, experience, Post.DIRECTOR);
        this.subordinates = new Employee[size];  //инициализирую масив с работниками
        this.count = 0;
    }

    public void add(Employee employee) {             //проверяет ечсть ли место в масиве
        if (count < subordinates.length) {           //добовляет сотрудника
            subordinates[count] = employee;
            count++;
        } else {                                        //если нет места - сообщает в консоль
            System.out.println("There are no available seats ");
        }

    }
    public boolean hasSubordinate(String name) {                 //метод ищет работника
        for (int i = 0; i < count; i++) {
            if (subordinates[i].getFullName().equals(name)) {     //есть ли работник с нужным именем
                return true;                                    //если нашли то выходим
            }
            if (subordinates[i] instanceof Director) {          //проверяет вляеться ли работник деректором
                Director d = (Director) subordinates[i];
                if (d.hasSubordinate(name)) {                    //рекурсия ))  заходим в метоз сново и ищем сотрудников у директора
                    System.out.println("the employee works for "+ d.getFullName());
                    return true ;                                //если нашли
                }
            }
        }
        return false;                                           //если не нашли
    }
    public void printDetails() {                               //будут выводить сотрудников
        System.out.println(this);
        for (int i = 0; i < count; i++) {
            System.out.println("  " + subordinates[i]);
            if (subordinates[i] instanceof Director) {
                ((Director) subordinates[i]).printDetails();
            }
        }
    }
}

