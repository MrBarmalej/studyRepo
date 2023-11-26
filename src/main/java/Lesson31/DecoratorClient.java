package Lesson31;

interface Person {
    void wear();
}

class BasicPerson implements Person {
    @Override
    public void wear() {
        System.out.println("Basic person is wearing");
    }
}

abstract class ClothingDecorator implements Person {
    protected Person person;

    public ClothingDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void wear() {
        person.wear();
    }
}

class JacketDecorator extends ClothingDecorator {
    public JacketDecorator(Person person) {
        super(person);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("Jacket is worn");
    }
}

class JeansDecorator extends ClothingDecorator {
    public JeansDecorator(Person person) {
        super(person);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("Jeans are worn");
    }
}

public class DecoratorClient {
    public static void main(String[] args) {
        Person basicPerson = new BasicPerson();

        Person personWithJacket = new JacketDecorator(basicPerson);
        Person personWithJeansAndJacket = new JeansDecorator(personWithJacket);

        personWithJeansAndJacket.wear();
    }
}
