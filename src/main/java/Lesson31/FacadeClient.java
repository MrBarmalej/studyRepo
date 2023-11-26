package Lesson31;

class OrderingSystem {
    public void newOrder() {
        System.out.println("Making a new order");
    }
}

class DeliverySystem {
    public void delivery() {
        System.out.println("Order delivering");
    }
}
class PaymentSystem {
    public void payment() {
        System.out.println("Order payment");
    }
}

class Facade {
    private OrderingSystem orderingSystem;
    private DeliverySystem deliverySystem;
    private PaymentSystem paymentSystem;

    public Facade() {
        this.orderingSystem = new OrderingSystem();
        this.deliverySystem = new DeliverySystem();
        this.paymentSystem = new PaymentSystem();
    }
    // Да, тут можно добавить много сервисов и не включать их в "обязательный" комплект и скрыть от клиента

    public void facadeOperation() {
        orderingSystem.newOrder();
        deliverySystem.delivery();
        paymentSystem.payment();
    }
}

public class FacadeClient {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.facadeOperation();
        System.out.println("Thank you for using our services");
    }
}
