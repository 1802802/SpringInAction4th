package second;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import second.config.SecondSpringConfig;

//@Rule注解是方法级别的，每个测试方法执行时都会执行被@Rule注解的成员变量的方法（类似于@Before）。
//@ClassRule注解是类级别的，测试类执行时仅会执行一次被@ClassRule注解的静态变量的方法（类似于@BeforeClass）。

//运行问题：
//1.Java配置与XML配置存在冲突，若想运行成功此UT需手动注释SecondSpringConfig中的@ImportResource(locations = "classpath*:second/*.xml")配置
//2.Windows系统下换行为\r\n，若为Windows系统需手动将UT中的\n全部换成\r\n

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SecondSpringConfig.class)
public class ImportJavaConfigTest {

  @Rule
  public final SystemOutRule log = new SystemOutRule().enableLog();

  @Autowired
  private MediaPlayer player;

  @Test
  public void play() {
    player.play();
    assertEquals(
            "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n",
            log.getLog());
  }

}
