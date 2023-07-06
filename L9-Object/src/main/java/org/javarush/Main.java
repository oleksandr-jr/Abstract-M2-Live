package org.javarush;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user1 = new User(0, null, "password");
        User user2 = new User(0, "asdasdasd123123", "password");


        Class<User> userClass = User.class;

        Method testMethod = userClass.getDeclaredMethod("testMethod");
        testMethod.setAccessible(true);
        testMethod.invoke(user1);

//        user1.testMethod();

    }

}