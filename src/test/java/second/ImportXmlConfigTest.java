package second;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import second.config.SecondSpringConfig;

//运行问题：
//1.StandardOutputStreamLog已被弃用，需更换为SystemOutRule，且注意手动加上enableLog()调用
//2.SpringBoot默认打印DEBUG级别日志，导致最终比对存在数据多余，需加上logback.xml来控制日志输出等级
//3.Windows系统下换行为\r\n，若为Windows系统需手动将UT中的\n全部换成\r\n

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SecondSpringConfig.class)
public class ImportXmlConfigTest {

  @Rule
  public final SystemOutRule log = new SystemOutRule().enableLog();

  @Autowired
  private MediaPlayer player;

  @Test
  public void play() {
    player.play();
    assertEquals(
        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n" +
        "-Track: Sgt. Pepper's Lonely Hearts Club Band\r\n" +
        "-Track: With a Little Help from My Friends\r\n" +
        "-Track: Lucy in the Sky with Diamonds\r\n" +
        "-Track: Getting Better\r\n" +
        "-Track: Fixing a Hole\r\n",
        log.getLog());
  }

}
