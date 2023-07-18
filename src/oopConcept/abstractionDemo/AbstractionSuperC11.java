package oopConcept.abstractionDemo;

public abstract class AbstractionSuperC11 { // create abstract Class

    /*
    Abstraction -
    Abstraction is a process where we hide the implementation and showing only the functionality
    - we cannot create an object of Abstract Class because the method is not going be implemented inside the Abstract
     class but, we can create an object of Non-Abstract Class in where abstract method is going to be implemented.
    - Abstract Class cannot be instantiated
    -Abstract Class is 0%-100%  Abstraction
    - In Abstract Class there can be both abstract and non-abstract method

    (Abstraction in Programming is about hiding unwanted details while showing most essential information)
    (Data Abstraction in Java allows focussing on what the information object must contain)
    (Abstraction in Object-Oriented Programming solves the issues at the design level.)

     Abstraction Class-
     1. An abstract class can have both abstract and non-abstract methods.
     2. It does not support multiple inheritances.
     3.It can provide the implementation of the interface.
     4.An abstract class can have protected and abstract public methods.
     5.An abstract class can have protected and abstract public methods.

     *What is Abstract Class?
        Abstract Class is a type of class in OOPs, that declare one or more abstract methods. These classes can have
        abstract methods as well as concrete methods.
        A normal class cannot have abstract methods. An abstract class is a class that contains at least one
        abstract method.
     *What are Abstract Methods?
        Abstract Method is a method that has just the method definition but does not contain implementation. A method
        without a body is known as an Abstract Method. It must be declared in an abstract class. The abstract method
         will never be final because the abstract class must implement all the abstract methods.

    *Advantages of Abstraction:
        The main benefit of using an Abstraction in Programming is that it allows you to group several related classes
         as siblings. Abstraction in Object-Oriented Programming helps to reduce the complexity of the design and
         implementation process of software.

    *When to use Abstract Methods & Abstract Class?
            Abstract methods are mostly declared where two or more subclasses are also doing the same thing in
            different ways through different implementations. It also extends the same Abstract class and offers
            different implementations of the abstract methods.

            Abstract classes help to describe generic types of behaviors and object-oriented programming class
            hierarchy. It also describes subclasses to offer implementation details of the abstract class.

    *Summary:
        Abstraction in Programming is the process of selecting important data sets for an Object in your software and
        leaving out the insignificant ones. Once you have modeled your object using Data Abstraction in Java, the
        same set of data could be used in different applications.
     ref Guru99.

     */

    String customerName;
    int customerCardNo;
    int cardExpDate;
    int cardCvv;

    public abstract void placeOrder(); // create abstract method




    public abstract void  reduceAmount(); // create abstract method

    public void  cardDetails(){
        customerName = "Sayeed";
        customerCardNo = 1363013630;
        cardExpDate = 1224;
        cardCvv = 890;
    }





}
