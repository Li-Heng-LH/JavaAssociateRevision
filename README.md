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
When does compiler decides that a method is a overriden method? 
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


