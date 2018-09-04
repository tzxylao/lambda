## 本项目写了一些jdk8相关的demo
1. 一些基本的lambda表达式
2. Stream流的使用
3. collect收集器的使用
4. 并行机制等

## 总结
1. 惰性求值
    - 中间操作 有状态/无状态（只有一个参数无状态，一个以上参数说明依赖别的参数，属有状态）
    - 终止操作 短路
    - parallel/sequential 不创建流 只修改标志
2. 收集器 - 分组
3. 运行机制
    - 链式，Head -> nextStage
    - 并行fork/join 阻塞