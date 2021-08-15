package first;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import first.config.FirstSpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FirstSpringConfig.class)
public class KnightMainTest {

    @Resource
    private Knight knight;

    @Test
    public void springBootTest() {
        knight.embarkOnQuest();
        Assert.assertTrue(true);
    }

    @Test
    public void contextTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(FirstSpringConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        Assert.assertTrue(true);
    }
}
