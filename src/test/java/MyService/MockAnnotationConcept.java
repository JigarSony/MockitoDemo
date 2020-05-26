package MyService;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

public class MockAnnotationConcept {

    @Mock
    List<String> mockList;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void mockListTest(){

        when(mockList.get(0)).thenReturn("Jigar");
        assertEquals("Jigar",mockList.get(0));
    }


}
