package io.examples.designpatterns.interpreter;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MeasurementConversion {

    protected static final String PATH_TO_CLASSES = "io.examples.designpatterns.interpreter.";

    public static void main(String[] args) {

        // Create a pop up window that asks a question

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String questionAsked = JOptionPane.showInputDialog(frame, "What is your question");

        // Add the question to the context for analysis

        ConversionContext question = new ConversionContext(questionAsked);

        String fromConversion = question.getFromConversion();

        String toConversion = question.getToConversion();

        double quantity = question.getQuantity();

        try {

            // Get class based on the from conversion string

            System.out.println(System.getProperty("user.dir"));

            Class tempClass = Class.forName(PATH_TO_CLASSES + fromConversion);

            // Get the constructor dynamically for the conversion string

            Constructor con = tempClass.getConstructor();

            // Create a new instance of the object you want to convert from

            Object convertFrom = (Expression) con.newInstance();

            // Define the method parameters expected by the method that will convert to your chosen unit of measure

            Class[] methodParams = new Class[]{Double.TYPE};

            // Get the method dynamically that will be needed to convert into your chosen unot of measure

            Method conversionMethod = tempClass.getMethod(toConversion, methodParams);

            // Define the method parameters that will be passed to the above method

            Object[] params = new Object[]{new Double(quantity)};

            // Get the quantity after the conversion

            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

            // Print the results

            String answerToQues = question.getResponse() + toQuantity + " " + toConversion;

            JOptionPane.showMessageDialog(null, answerToQues);

            // Closes the frame after OK is clicked

            frame.dispose();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
