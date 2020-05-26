package MyService;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class MockList {

    @Test
    public void mockListTest(){

        List<String> mocklist = mock(List.class);
        when(mocklist.size()).thenReturn(5);
        assertTrue(mocklist.size()==5);
    }
}
