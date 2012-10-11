package sp.training.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxy {

  @SuppressWarnings("unchecked")
  public static <T> T wrapWithLoggingProxy(final Object target, Class<T> intf) {

    return (T) Proxy.newProxyInstance(intf.getClassLoader(), 
        new Class[] { intf }, 
        new InvocationHandler() {
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            System.out.println("Before method " + method.getName());
            try {
              return method.invoke(target, args);
            } finally {
              System.out.println("After method " + method.getName());
            }
          }
      });
  }

}
