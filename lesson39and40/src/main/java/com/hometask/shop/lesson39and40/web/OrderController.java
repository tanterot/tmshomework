package com.hometask.shop.lesson39and40.web;

import com.hometask.shop.lesson39and40.dto.OrderDto;
import com.hometask.shop.lesson39and40.dto.SearchDto;
import com.hometask.shop.lesson39and40.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping
    public String home(Model model) {
        var all = service.findAll();
        model.addAttribute("orders", all);
        return "home";
    }

    @PostMapping
    public String add(OrderDto dto, Model model) {
        service.createOrder(dto);
        model.addAttribute("orders", service.findAll());
        return "home";
    }

    @PostMapping("/update")
    public String update(OrderDto dto, Model model) {
        service.update(dto);
        model.addAttribute("orders", service.findAll());
        return "redirect:/order";

    }

    @GetMapping("/update")
    public String update(@RequestParam(name = "id") UUID id, Model model) {
        OrderDto result = service.findById(id);
        model.addAttribute("order", result);
        return "update";

    }

    @GetMapping("/deleted")
    public String updateFieldIsDeleted(@RequestParam(name = "id") UUID id, Model model) {
        OrderDto result = service.updateFieldIsDeleted(id);
        var all = service.findAll();
        model.addAttribute("orders", all);
        return "redirect:/order";
    }

    @PostMapping("/search")
    public String search(SearchDto dto, Model model) {
        List<OrderDto> search = service.search(dto);
        model.addAttribute("orders", search);
        return "home";

    }

//    @GetMapping("/search")
//    public String searchProducts(SearchDto searchDto, Model model) {
//        List<ProductDto> productDtos = productMapper.toProductDtoList(productsService.getAllProducts(searchDto));
//        model.addAttribute("searchDto", searchDto);
//        model.addAttribute("products", productDtos);
//        return "products";

//@PostMapping("/search")
//public String search(SearchDto dto, Model model) {
//    var result = orderServis.search(dto);
//    model.addAttribute("orders", result);
//    return "home";
}
