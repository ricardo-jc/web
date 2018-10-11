package my.test.web.serviceImpl;

import lombok.RequiredArgsConstructor;
import my.test.web.mapper.One;
import my.test.web.mapper.Three;
import my.test.web.mapper.Two;
import my.test.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor=@__(@Autowired))
public class DemoServiceImpl implements DemoService {

//    @Autowired
//    One one;
//    @Autowired
//    Two two;
//    @Autowired
//    Three three;
    private final One one;
    private final Two two;
    private final Three three;

    @Override
    public Object getContent(){
        return one.getContent() + two.getContent() + three.getContent();
    }

}
