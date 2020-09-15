package Mockito;

import mock.SecurityCenter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.Mock;
import stub.GradeService;
import stub.GradeSystem;

//import static com.sun.javaws.JnlpxArgs.verify;
import static org.mockito.Mockito.when;

public class grade_mockito {
    private GradeService gradeService;
    @Mock
    GradeSystem gradeSystemmock;
    @BeforeEach
    public void setup(){
        gradeService = new GradeService(gradeSystemmock);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100(){
        when(gradeService.calculateAverageGrades(99l)).thenReturn(90.00);
        double result = gradeService.calculateAverageGrades(99l);
        Assertions.assertEquals(90.00, result);
    }
}
