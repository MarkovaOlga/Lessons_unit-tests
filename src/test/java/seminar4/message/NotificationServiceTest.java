package seminar4.message;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {
    @Test
    void testSendMessage(){
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("test", "admin");
        verify(messageService, times(1)).sendMessage("test", "admin");
    }

}
