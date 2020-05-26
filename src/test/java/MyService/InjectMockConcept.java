package MyService;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

public class InjectMockConcept {

    @Mock
    List<String> mockList;

    @InjectMocks
    Employee mockEmployee;


    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void EmployeeMockTest(){

        when(mockList.get(0)).thenReturn("Jigar");
        when(mockList.size()).thenReturn(1);

        assertEquals("Jigar",mockList.get(0));
        assertEquals(1,mockList.size());

        assertEquals("Jigar",mockEmployee.getEmpName().get(0));
        assertEquals(1,mockEmployee.empName.size());

//        mockList.add(1,"Tom");
//        System.out.println(mockList.get(1));
    }

}
class Employee {

    List<String> empName;

    public List<String> getEmpName() {
        return empName;
    }

    public void setEmpName(List<String> empName) {
        this.empName = empName;
    }
}