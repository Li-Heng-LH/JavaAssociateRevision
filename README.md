### Some Learning Notes ###

&nbsp;

#### Iterator ####
* Using `iterator.remove()` : removes the last element returned by iterator
* Suing `ArrayList.remove()` : `java.util.ConcurrentModificationException`

&nbsp;

#### Java is pass by value ####
* Since the variables are just the reference to the objects, we get confused that we are passing the reference so java is pass by reference. 
* However we are **passing a copy of the reference** and hence it’s pass by value.