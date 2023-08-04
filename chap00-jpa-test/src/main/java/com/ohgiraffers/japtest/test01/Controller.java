package com.ohgiraffers.japtest.test01;

import com.ohgiraffers.japtest.test01.repo.MemberRepository;
import com.ohgiraffers.japtest.test01.repo.OrderMappingRepo;
import com.ohgiraffers.japtest.test01.repo.OrderRepository;
import com.ohgiraffers.japtest.test01.repo.ProductRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {


    private final MemberRepository memberRepository;
    private final OrderRepository orderRepository;
    private final ProductRepo productRepo;
    private final OrderMappingRepo orderMappingRepo;

    public Controller(MemberRepository memberRepository, OrderRepository orderRepository, ProductRepo productRepo, OrderMappingRepo orderMappingRepo) {
        this.memberRepository = memberRepository;
        this.orderRepository = orderRepository;
        this.productRepo = productRepo;
        this.orderMappingRepo = orderMappingRepo;
    }

    @GetMapping("/minsert")
    public ResponseEntity<String> test(){
        Member member = new Member();
        member.setMemberName("이상우");
        member.setDetailedAddress("1층");
        member.setMemberAge(20);
        member.setZipCode(123);
        member.setGemetaAdderss("실미동");

        memberRepository.save(member);

        return ResponseEntity.ok().body("굿");
    }

    @GetMapping("/order")
    public void test1(){
        Order order = new Order();
        order.setMembercode(memberRepository.findById(1).getMemberCode());

        orderRepository.save(order);
        System.out.println(order.getMembercode());
    }


    @GetMapping("/orderList")
    public void orlist(){
        Product product = productRepo.findById(1);
        Member member = memberRepository.findById(1);

        // 주문 등록
        Order newOrder = new Order();
        newOrder.setMemberCode(member.getMemberCode());

        // 주문 리스트 추가
        OrderMapping orderMapping = new OrderMapping();
        orderMapping.setOrderMapping(new OrMppingPk(newOrder.getOrderCode(), product.getProductCode()));
        orderMapping.setOrder(newOrder);
        orderMapping.setProduct(product);

        List<OrderMapping> orderMappingList = new ArrayList<>();
        orderMappingList.add(orderMapping);

        newOrder.setOrderMapping(orderMappingList);

        orderRepository.save(newOrder);
    }

    @GetMapping("/product")
    public void insert(){
        Product product = new Product();
        product.setProductName("메카월드");
        productRepo.save(product);

    }

    @GetMapping("/orderFind")
    public void orFind(){
        Order order = orderRepository.findById(1);

        System.out.println(order.getOrderMapping());

    }

}
