package oopConcept.abstractionDemo;

public class AbstractSub extends AbstractionSuperC11 {


    // Implementation class
    public void placeOrder() {
        super.cardDetails();
        // Super is used because of calling a method from another class inside a method in other class in parent class
        System.out.println(customerName);
        System.out.println(customerCardNo);
        System.out.println(cardExpDate);
        System.out.println(cardCvv);
        System.out.println("Send the info to the bank");

    }


    @Override
    public void reduceAmount() {
        System.out.println("Reduce amount");

    }

    public static void main(String[] args) {
        AbstractSub obj = new AbstractSub();
        obj.placeOrder();
        obj.reduceAmount();
    }
}
