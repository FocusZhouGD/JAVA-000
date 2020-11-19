package autobeanreal;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class School implements ISchool{
    private String b ="你好";
    @Override
    public void ding() {
        System.out.println("在学校学习嗯");
    }
}
