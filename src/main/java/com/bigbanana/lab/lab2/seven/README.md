嗯，虽然过程比较复杂，但是总的逻辑还是比较简单的。  
对于数字和字符混合的字符串，程序并没有做很多鉴别，算是一大瑕疵吧，虽说实现起来不难，但是这种异类的混搭可能存在类似`789sfdf772778
`这种本来就没什么实际意义并且不知道该把他解析成哪个数值的情况，姑且偷懒不写了。  

一个意外的收获是理解了空字符串和 null 的区别：  
* 字符串变量赋值为 null 是将其初始化为空指针，并不指向内存空间，所以这个变量就是 null，没有实际意义；
* 字符串变量赋值为空字符串`""`是将变量赋值为空字符串并且指向内存空间，此时这个变量就是真真切切的字符串变量，可以调用String类的各种方法；