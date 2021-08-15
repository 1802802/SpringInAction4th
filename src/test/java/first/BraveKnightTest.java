package first;

import org.junit.Test;
import org.mockito.Mockito;

public class BraveKnightTest {

    @Test
    public void testMethod() {
        Quest mockQuest = Mockito.mock(Quest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        Mockito.verify(mockQuest, Mockito.times(1)).embark();
    }
}
