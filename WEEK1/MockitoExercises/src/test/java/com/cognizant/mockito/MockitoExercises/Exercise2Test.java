package com.cognizant.mockito.MockitoExercises;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Exercise2Test {

    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.processData();

        verify(mockApi).sendData("Hello");
    }
}