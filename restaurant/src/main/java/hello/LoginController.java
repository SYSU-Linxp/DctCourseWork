package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by young on 16-11-2.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String finishOrder() {
        return "login";
    }
}
