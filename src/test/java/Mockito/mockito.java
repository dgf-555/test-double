package Mockito;

import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import stub.GradeService;

import static org.mockito.Mockito.*;

public class mockito {
    private SecurityCenter securityCenter;
    @Mock
    DoorPanel doorPanelmock;
    @BeforeEach
    public void setup(){
        securityCenter = new SecurityCenter(doorPanelmock);
    }
    @Test
    public void should_VerifyDoorIsClosed_without_doorpanel(){
//        DoorPanel doorPanelmock = mock(DoorPanel.class);
        securityCenter.switchOn();
        verify(doorPanelmock,times(1)).close();
    }

}
