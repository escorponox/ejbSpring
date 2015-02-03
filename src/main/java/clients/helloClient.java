package clients;

import beans.TestBeanRemote;

public class helloClient {

    TestBeanRemote testBeanRemote;

    public void invocaAlEJB() {
        System.out.println("Invocacioooooon: " + testBeanRemote.getHello());
    }

    public TestBeanRemote getTestBeanRemote() {
        return testBeanRemote;
    }

    public void setTestBeanRemote(TestBeanRemote testBeanRemote) {
        this.testBeanRemote = testBeanRemote;
    }
}
