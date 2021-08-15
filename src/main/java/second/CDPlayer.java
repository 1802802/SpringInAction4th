package second;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class CDPlayer implements MediaPlayer {
  private final CompactDisc cd;

  @Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
