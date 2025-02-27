import com.google.inject.AbstractModule;

import implementations.Business;
import interfaces.IBusiness;
import interfaces.IOther;

class TestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IOther.class).to(MockOther.class);
        bind(IBusiness.class).to(Business.class);
    }
}