# 学习笔记

242题起初想用循环写出来，但是发现循环对比，各种测试用例都有可能漏掉，后来用一个hashmap存储key,value,循环另一个，再去hashmap里相应的减操作；这样提交代码后，性能并不好，翻看别人的代码，巧用26个字母去操作，太神了。当时想到了数组存储，但是没有想到拿26个字母索引来，这块省掉了map的key