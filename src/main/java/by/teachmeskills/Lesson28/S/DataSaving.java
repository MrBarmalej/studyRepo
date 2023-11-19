package by.teachmeskills.Lesson28.S;

    class DataSaving {
    //Single responcibillity principle(1/1) - каждый класс отвечает за 1 процесс (в презентации - "делай модули меньше")
    void saveData(){
        System.out.println("Some data to save");
    }

     class DataPrinter{
        public void printData(){
            System.out.println("Some data to print");
        }
    }
}
