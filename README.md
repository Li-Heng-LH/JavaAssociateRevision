### Some Learning Notes ###

&nbsp;

#### Iterator ####
* Using `iterator.remove()` : removes the last element returned by iterator
* Using `ArrayList.remove()` : `java.util.ConcurrentModificationException`

&nbsp;

#### Java is pass by value ####
* Since the variables are just the reference to the objects, we get confused that we are passing the reference so java is pass by reference. 
* However we are **passing a copy of the reference** and hence it’s pass by value.

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

### static ###
* static methods cannot be abstract. See below. 
* Question: can static methods be overridden? 
* Question: can static methods be private? 
&nbsp;

### private ###
* private methods cannot be overridden, since it is not visible to other classes. 
&nbsp;

### abstract ###
* **abstract methods cannot be private**, since private methods cannot be overridden. 
* **abstract methods cannot be static**. Imagine `AbstractClass.abstractMethod()` is called, what will happen? 
* can have empty implementations for void abstract methods. 
&nbsp;

#### How many objects are created when a Child object is created then? ####
* [One](https://stackoverflow.com/questions/16498211/does-creating-an-instance-of-a-child-class-automatically-create-its-super-class)

&nbsp;

