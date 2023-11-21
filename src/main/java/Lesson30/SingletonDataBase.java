package Lesson30;

public class SingletonDataBase {
    private static SingletonDataBase dataBase;

    private SingletonDataBase(){
    }
//Если класс базы данных уже существует - возвращает её, иначе - создает новую. Имеется глобальный доступ к ней и приватный
//конструктор для предотвращения создания экземпляров извне
    public static SingletonDataBase getDataBase() {
        if (dataBase == null) {
            dataBase = new SingletonDataBase();
        }
        return dataBase;
    }
}
