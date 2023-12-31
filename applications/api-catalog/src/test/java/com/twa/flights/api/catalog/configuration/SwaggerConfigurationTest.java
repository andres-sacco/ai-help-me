package com.twa.flights.api.catalog.configuration;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.twa.flights.api.catalog.service.AppInfoService;
import com.epam.reportportal.junit5.ReportPortalExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ReportPortalExtension.class)
public class SwaggerConfigurationTest {

    AppInfoService appInfoService;

    @BeforeEach
    public void setUp() {
        appInfoService = mock(AppInfoService.class);
    }

    @Test
    public void should_return_information_of_default_api() {
        SwaggerConfiguration swaggerConfiguration = new SwaggerConfiguration(appInfoService);
        assertNotNull(swaggerConfiguration.defaultApi());
    }

    @Test
    public void should_return_information_of_openapi() {
        SwaggerConfiguration swaggerConfiguration = new SwaggerConfiguration(appInfoService);
        assertNull(swaggerConfiguration.openAPI());
    }
}
