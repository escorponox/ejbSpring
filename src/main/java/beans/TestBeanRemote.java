package beans;

import javax.ejb.Remote;

@Remote
public interface TestBeanRemote {
    public String getHello();
}
