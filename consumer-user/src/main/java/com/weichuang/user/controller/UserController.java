package com.weichuang.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.weichuang.ticket.service.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    TicketService ticketService;

    @RequestMapping("/buyTicket")
    public String buyTicket(String name){
        return name + "购买了" + ticketService.saleTicket();
    }
}
