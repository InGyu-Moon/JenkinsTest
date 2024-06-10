package data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
    @GetMapping("/")
    public String index() {
        return "redirect:/shop/list";
    }
    @GetMapping("/shop/list")
    public String shopList() {
        return "gitshop/shoplist";
    }
}
