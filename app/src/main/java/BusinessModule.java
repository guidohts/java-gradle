import com.google.inject.AbstractModule;

import implementations.Business;
import implementations.Other;
import interfaces.IBusiness;
import interfaces.IOther;

class BusinessModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IBusiness.class).to(Business.class);
        bind(IOther.class).to(Other.class);
    }
}