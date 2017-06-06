package io.examples.designpatterns.reflection;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*

    The Java Reflection API is used to manipulate classes
    and everything in a class including fields, methods,
    constructors, private data, etc.

    Because using the Reflection API is most often Dynamic
    it can slow down a program because the JVM can't
    optimize the code.

    The Reflection API can't be used with applets because
    of the added security applets require.

    Because this API allows you to do things like access
    private fields, methods, etc. it should be used
    sparingly, or else potentially destroy the logic
    of a program.

 */
public class TestingReflection {

    public static void main(String[] args) {

        // Getting the class Object for UFOEnemyShip
        // Everything in Java has a Class Object

        Class reflectClass = UFOEnemyShip.class;

        // Get the class name of an Object

        String className = reflectClass.getName();

        System.out.println(className + "\n");

        // Check modifiers of a class
        // isAbstract, isFinal, isInterface, isPrivate, isProtected
        // isStatic, isStrict, isSynchronized, isVolatile

        int classModifiers = reflectClass.getModifiers();

        System.out.println(Modifier.isPublic(classModifiers) + "\n");

        // You can get a list of interfaces used by a class
        // Class[] interfaces = refelctionClass.getInterfaces();

        // Get the objects methods, return type and parameter type

        Method[] classMethods = reflectClass.getMethods();

        for(Method method : classMethods) {

            // Get the method name

            System.out.println("Method name: " + method.getName());

            // Check if a method is a getter or setter

            if (method.getName().startsWith("get")) {
                System.out.println("Getter method");
            } else if (method.getName().startsWith("set")) {
                System.out.println("Setter method");
            }

            // Get the methods return type

        }

    }

}
