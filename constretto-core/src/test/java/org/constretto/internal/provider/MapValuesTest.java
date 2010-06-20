package org.constretto.internal.provider;

import org.constretto.ConstrettoBuilder;
import org.constretto.ConstrettoConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:kaare.nilsen@arktekk.no">Kaare Nilsen</a>
 */
public class MapValuesTest {

    @Test
    public void resolveGenericMaps(){
        final ConstrettoConfiguration config = new ConstrettoBuilder()
                .createPropertiesStore()
                .addResource(new ClassPathResource("maps.properties"))
                .done().getConfiguration();

        Map map = config.evaluateToMap("map");
        assertEquals("value_one",map.get("key_one"));
        assertEquals("value_two",map.get("key_two"));
    }
}
