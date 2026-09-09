## Part 1

1)  **Encapsulation:** hiding the data of an object and controlling how other classes can use it. In the langage Java, we usually use private fields with getters and setters.


2) - **Getter:** used to read a value from an object and 
   - **Setter:** used to change a value in an object.


3) - **This:** refers to the current object.
   - **Super:** to the parent class and can be used to call parent methods or constructors.


4) **Inheritance:** allows one class to reuse fields and methods from another class.


5) **Polymorphism:** one type can represent different kinds of objects.The main type of polymorphism are:

- **subtype polymorphism** : a child can be used as a parent type.
- **polymorphism**: a code can work with different types.
- **ad-hoc polymorphism** :the method can be used in different ways .


6) - **Inheritance:** he creates a parent and child relationship. 
   - **Subtype polymorphism:** a child object can be used as a parent type.


8) the testable methods are area() and perimeter() in Circle and Rectangle. The unit tests checks if these methods return the correct values( look Testcircle and Testrectangle please)


```
void testGetterAndSetter() {
    HelloEncapsulation obj = new HelloEncapsulation(42);

    assertEquals(42, obj.getPropVal());

    obj.setPropVal(50);

    assertEquals(50, obj.getPropVal());
}
```


```
void testCircleArea() {
    Circle c = new Circle(2);

    assertEquals(Math.PI * 4, c.area());
}
```



## Part 2

1) - **Static variable:** a variable that belongs to the class and is shared by all objects of that class.
   - **Static constant:** A static value that cannot change.
   - **Static method:** a method that belongs tot he class and can be called without creating an object.
   

2) Static constants often have public visibility because their value cannot change and others classes can use them safely without problems.


3) Static methods cannot directly access instance members because the ydo not belong to one specific object and they doesn't have a reference.


4) We can take the Maths.sqrt(), this static method can be used without creating a Math object.



## Part 3

1) First of all, object initialization is the process Java uses when a new object is created, java gives default values to the fields. then that instance fields and instance blocks are initialized for each new object. Finally, the constructor is called to finish the object.

2) ``` 
   B1 
   ↑
   D1
   ↑
   D9
   ```
When a D9 object is created the constructor of the parent class is called first. the order is B1 constructor, D1 constructor and then D9 constructor, we need to initialize the parent class before the child class.

3) **Constructor:** a constructor creates an object directly

   **Factory method:** the method create and return an object


4) Two common applications of the singleton pattern are a logger which uses one shared object the whole program and also application settings which use one shared object so the same configuration is used everywhere


5)
```
void testEagerSingleton() {
    EagerSingleton a = EagerSingleton.getInstance();
    EagerSingleton b = EagerSingleton.getInstance();

    assertSame(a, b);
}
```

```
void testLazySingleton() {
    LazySingleton a = LazySingleton.getInstance();
    LazySingleton b = LazySingleton.getInstance();

    assertSame(a, b);
}
```
