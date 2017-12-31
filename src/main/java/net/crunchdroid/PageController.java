package net.crunchdroid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author CrunchDroid
 */
@Controller
public class PageController {

    @GetMapping("/plain-page")
    public String plainPage() {
        return "plain-page";
    }

    @GetMapping("/pricing-tables")
    public String pricingTables() {
        return "pricing-tables";
    }
    
    @GetMapping("/logins")
    public String login() 
    {
    	return "logins";
    }
    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }
}
