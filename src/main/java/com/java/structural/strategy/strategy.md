* 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改,在这里对应着动态的改变操作
* 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。
context里面的策略变了,也就是意味着我们换了不同的策略.

##### 关键代码：实现同一个接口。在这里也就是MyOperation接口

* 优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。(可以少了很多if-else)
* 缺点： 1、策略类会增多(自定义Operation)。 2、所有策略类都需要对外暴露。(也就是需要自己new具体的Operation)

使用场景:
当我们面对相同的操作,但是需要在运行的时候确定采用哪种算法或者哪种策略,那么就需要采取策略模式.