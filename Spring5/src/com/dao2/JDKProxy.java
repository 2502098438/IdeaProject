package com.dao2;

import com.dao2.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {


        UserDaoImpl userDao = new UserDaoImpl();
        Class[] interfaces = {UserDao.class};
        UserDao userDao1 = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = userDao1.add(1, 5);
        System.out.println(add);
    }
}

class UserDaoProxy implements InvocationHandler {

    private Object object;

    public UserDaoProxy(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("方法执行之前" + method.getName() + "传递的参数" + Arrays.toString(args));

        Object invoke = method.invoke(object, args);

        System.out.println("方法执行之后" + object);

        return invoke;
    }
}