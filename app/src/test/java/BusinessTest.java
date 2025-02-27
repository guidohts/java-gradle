import com.google.inject.Guice;
import com.google.inject.Injector;

import interfaces.IBusiness;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusinessTest {

    @Test
    void testDoBusiness() {
        Injector injector = Guice.createInjector(new TestModule());
        IBusiness business = injector.getInstance(IBusiness.class);
        String result = business.doBusiness();
        assertEquals("Business done!", result, "The business method should return 'Business done!'");
    }
}