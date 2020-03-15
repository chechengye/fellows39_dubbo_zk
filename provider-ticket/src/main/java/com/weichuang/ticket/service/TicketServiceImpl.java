package com.weichuang.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service  //此注解是将服务发布到注册中心的 ,将TicketService接口的全路径发布到zk
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String saleTicket() {
        return "《阿凡达》";
    }
}
