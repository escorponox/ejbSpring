package ManagedBeans;

import beans.TestBeanRemote;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloMb implements Serializable {

    @EJB
    TestBeanRemote testBean;

    public HelloMb() {
    }

    public String getText() {
        return testBean.getHello();
    }
}
