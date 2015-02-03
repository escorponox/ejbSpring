package beans;

import javax.ejb.Stateless;

@Stateless(mappedName = "FooEJB")
public class TestBean implements TestBeanRemote {

    public String getHello() {
        return "Hello World";
    }
}
