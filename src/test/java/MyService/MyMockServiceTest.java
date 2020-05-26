package MyService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMockServiceTest {

    @Test
    public void testMock(){

        MyServiceProvider mockObj = Mockito.mock(MyServiceProvider.class);
        Mockito.when(mockObj.add(20,50)).thenReturn(70);
        assertEquals(70,mockObj.add(20,50));
    }
}
