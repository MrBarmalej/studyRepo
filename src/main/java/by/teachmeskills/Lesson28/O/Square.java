package by.teachmeskills.Lesson28.O;
//Open/closed principle (2/2): классы должны быть открыты для расширения, но закрыты для изменения
class Square implements Shape {
    //square - тут подразумеваю квадрат(фигура), а не площадь
    protected int anySide = 7;
    @Override
    public int area() {
        return anySide*anySide;
    }
}
