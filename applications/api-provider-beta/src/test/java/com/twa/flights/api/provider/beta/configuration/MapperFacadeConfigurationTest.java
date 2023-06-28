package com.twa.flights.api.provider.beta.configuration;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import com.epam.reportportal.junit5.ReportPortalExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ReportPortalExtension.class)
public class MapperFacadeConfigurationTest {

    @Test
    public void should_return_not_null_mapper_facade() {
        MapperFacadeConfiguration mapperConfiguration = new MapperFacadeConfiguration();
        assertNull(mapperConfiguration.mapperFacade());
    }
}
