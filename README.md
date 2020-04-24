# JavaAssociateRevision
Work out examples while revising Java Associate Cert. 

&nbsp;

### Some Learning Notes ###

#### compile-time & runtime type ####
* The "compile-time type" of a variable is the type it is declared as. 
* The "runtime type" is the type of the actual object the variable points to. 
&nbsp;

#### Iterator ####
* Using `iterator.remove()` : removes the last element returned by iterator
* Using `ArrayList.remove()` : `java.util.ConcurrentModificationException`

&nbsp;

#### Java is pass by value ####
* Since the variables are just the reference to the objects, we get confused that we are passing the reference so java is pass by reference. 
* However we are **passing a copy of the reference** and hence it’s pass by value.

&nbsp;

#### Java reference ####
* A variable of an object actually stores the "**address**" of the object. 
* object1 = object2 --> address is copied. Therefore, both pointing to the same object. 
* If object1 is changed to point to another object, object2 will s=be still pointing to the old object. 
&nbsp;

#### Java Autoboxing ####
Compiler applies autoboxing when a primitive value is: 
* passed as parameter to a method that expects the wrapper class (li.add(i) --> li.add(Integer.valueOf(i)))
* assigned to a variable of wrapper class

&nbsp;

#### Overriding ####
When does compiler decides that a method is a overridden method? 
When compiler sees a method in child class: 
* has the same name as the method in parent class, and 
* has the same parameter types as the method in parent class
&nbsp;

Then, compiler will think that this is a overriden method, ans starts to check for overriding eligibility: 
* same return types
* access level rules
* exceptions rules
&nbsp;

#### Type casting with inheritance ####
* ClassCastException is a RuntimeException
* Casting an animal instance to a dog instance --> ClassCastException
&nbsp;

#### super() ####
* If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass. 
* If the super class does not have a no-argument constructor, you will get a compile-time error. 
* Object does have such a constructor, so if Object is the only superclass, there is no problem.
&nbsp;

#### constructor ####
* Constructors are not inherited. 
* Constructors need to be of the same name as the class name!
&nbsp;

#### static ####
* static methods cannot be abstract. See below. 
* Question: can static methods be private? Yes. 
* Question: can property be private static? Yes. It can be used for [singleton](https://www.baeldung.com/java-singleton). 
* Question: can static methods be overridden? Not exactly overridden. But it has no errors. [Reference](http://geekexplains.blogspot.com/2008/06/can-you-override-static-methods-in-java.html)   
Static methods are class methods.   
Which static methods to use is resolved during compile time, using only the compile time type information. 
&nbsp;

#### private ####
* private methods cannot be overridden, since it is not visible to other classes. 
&nbsp;

#### abstract ####
* **abstract methods cannot be private**, since private methods cannot be overridden. 
* **abstract methods cannot be static**. Imagine `AbstractClass.abstractMethod()` is called, what will happen? 
* can have empty implementations for void abstract methods. 
&nbsp;

#### try throws catch finally ####
* **Whenever** an exception is thrown or there is a call that throws exception, it **must** be _**handled**_. 
* There are 2 ways to **handle** `Exception`: 
  * 1: **catch**  (catch and do nothing is fine)
  * 2: method **throws**  (just throws will do)
* **try must be followed by either catch or finally**.  
* **Use try...finally block** for important things that have to be done no matter what, example: close input stream. 

&nbsp;

#### How many objects are created when a Child object is created then? ####
* [One](https://stackoverflow.com/questions/16498211/does-creating-an-instance-of-a-child-class-automatically-create-its-super-class)

&nbsp;

