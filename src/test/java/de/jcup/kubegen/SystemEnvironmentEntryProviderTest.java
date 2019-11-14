package de.jcup.kubegen;

import static org.junit.Assert.*;

import org.junit.Test;

public class SystemEnvironmentEntryProviderTest {

    @Test
    public void path_variable_from_environment_is_same_as_from_provider() {
       String fromEnv = System.getenv("PATH");
       assertNotNull(fromEnv);
       
       assertEquals(fromEnv, new SystemEnvironmentMapDataProvider().getMap().get("PATH"));
    }

}
