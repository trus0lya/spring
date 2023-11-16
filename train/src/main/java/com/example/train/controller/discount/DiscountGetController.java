package com.example.train.controller.discount;

import com.example.train.model.Discount;
import com.example.train.service.DiscountService;
import com.example.train.uri.discount.DiscountGetURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class DiscountGetController {
    private final DiscountService discountService;

    @Autowired
    public DiscountGetController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @RequestMapping(value = DiscountGetURI.GET_DISCOUNT_BY_ID, method = RequestMethod.GET)
    public ResponseEntity<Discount> getStationById(@PathVariable int id) {
        Discount discount = discountService.getDiscountById(id);
        if (discount != null) {
            return new ResponseEntity<>(discount, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @RequestMapping(value = DiscountGetURI.GET_ALL_DISCOUNTS, method = RequestMethod.GET)
    public ResponseEntity<List<Discount>> getAllTrains() {
        List<Discount> discounts = discountService.getAll();
        if(discounts.size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(discounts, HttpStatus.OK);

    }
}
