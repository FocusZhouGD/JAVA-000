package autobeanreal;

import org.springframework.stereotype.Component;

@Component
public class School implements ISchool{
    private String b ="你好";
    @Override
    public void ding() {
        System.out.println("在学校学习嗯");
    }
}
