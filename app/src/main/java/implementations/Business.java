package implementations;
import com.google.inject.Inject;

import interfaces.IBusiness;
import interfaces.IOther;

/**
 * The Business class represents a simple business logic handler.
 * It contains methods to perform business operations.
 */
public class Business implements IBusiness {

    IOther other;

    @Inject
    public Business(IOther other) {
        this.other = other;
    }
    /**
     * This method does some business logic
     * 
     * @return
     */
    public String doBusiness() {
        return other.doSomething();
    }

}
