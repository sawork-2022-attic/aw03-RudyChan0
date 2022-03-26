# WebPOS

The demo shows a simple POS system in MVC architecture, which replaces the shell interface in aw02 with a pos web ui (https://github.com/bshbsh404/simple-pos-ui
).

![](screenshot.png)

To run

```shell
mvn clean spring-boot:run
```

Currently, it just lists the products for sale with a cart with one item (just for demonstration). 

Please read the tutorial at  https://www.baeldung.com/spring-boot-crud-thymeleaf and make the POS system robust and fully functional. You can also refer to other articles, for instance https://www.baeldung.com/tag/thymeleaf/ .



And please elaborate your understanding in MVC architecture via this homework in your README.md.

## My understanding
完成了Add，Delete和Item数量的增删，以及总价的显示,Cancle 和Charge

MVC架构确实极大地方便了后端和前端的对接，之前写过一个简单的网站，用jQuery硬写，仅仅是简单的逻辑和布局就直接上千行代码。但现在要是使用mvc架构实现的话，不仅工作量会大大减少，而且最后的成品也肯定有极大的改善。