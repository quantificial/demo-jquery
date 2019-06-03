package lc.jquery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	private final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
    @RequestMapping("/")
    public String index() {
        return "ajax";
    }
    
    @RequestMapping("/Hello")
    public String hello() {
        return "hello";
    }
    
}
