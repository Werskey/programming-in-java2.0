## Part 1

2) Using constants is benefits in programming to avoid creating a lot of variables which has the same value. it also prevents important value from being changed by mistake 


3)  - **Local variables:** local variable can be assigned only once.
    - **Instance variable:** final instance variable can be assigned only once for each object.
    - **Static constant:** a final static constant shared by all objects and cannot be changed
    - **Method:** a final method cannot be changed in a child class
    - **Class:** a final class cannot have a child class

4) a) No, having only private fields and no setters does not always make a class immutable because a field can contain a mutable object.

   b) Yes if there's no method which change the values.

5) This class is not immutable because getValues() returns the original array. He can be changed from outside the class  


## Part 2

1) Using an enum is a correct way to create a singleton. The creation of the singleton is thread-safe.


## Part 3


2) The difference is actually where the nested class is declared and how it is used. There are different types of nested classes:
    - **Static nested class:** belongs to the outer class and no need an object of the outer class
    - **Local class:** declared inside a method or a block
    - **Inner class:** non-static and needs an object of outer class
    - **Anonymous class:** has no named it is directly created when it is needed



3)  a) Yes an inner class can be used in another class if the inner is accessible.
    b) Yes it's possible, public, protected, private can be used for member inner classes. Nevertheless, if the nested class is static, it's not an inner class anymore.