package by.teachmeskills.Lesson28.I;
// Interface Segregation Principle (1/2) - клиенты не должны зависеть от интерфейсов, которые они не используют

class Sunflower implements Seeds{
    String colour = "yellow"; //просто и бессмысленно добавил эту строку исключительно для наполнения

    @Override
    public String eatable() {
        return "Can be eaten by chicken (for example)";
    }
}
