# Builder模式

标签（空格分隔）： 设计模式

---
> 原文：https://www.jianshu.com/p/0134f9da4261

### 定义
将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

### 使用场景
>* 相同的方法，不同的执行顺序，产生不同的结果
* 多个部件或零件，都可以装配到一个对象中，但是产生的结果不一样
* 初始化的对象很复杂，参数多，很多都有默认值的时候

### 理解
构造者（建造者）模式，既然是构造而不是生产，就说明我们需要对构造的参数、顺序进行设定，来构造出想要的对象；方便用户创建复杂的对象，使用者不需要关心构建的内部细节，将构建的过程和部件解耦；将对象构建过程和细节进行封装和复用

### 举个栗子
网上已经有很多简单的实现例子，都是比较标准的构建者模式；这里举一个实际项目中的栗子；在Android APP中，一般会有一些弹窗来提示用户比如获取权限、提示出错、等待什么的，一般来说风格都是一样的，有固定的几种按键，固定的几种布局；

![未标题-2.jpg-30.3kB][1]

对于一些弹窗很多的APP来说，每次有一个不一样的弹窗就写一个布局（即使是复制代码），需要初始化控件，设置风格、设置字体、设置点击事件，可以想象一大堆代码，非常麻烦，代码都不想贴了；

```java
inputView = new DialogBuilder(getContext())
                .setTitleTxt("输入操作数量")
                .setRightBtnTxt("取消")
                .setLeftBtnTxt("确定")
                .setLeftClickListener(listener)
                .openAutoCancle()
                .create();
```
使用构建者模式，可以实现一行代码就初始化完一个弹窗，事情就简单多了嘛，当我设置了不一样的值进去，得到的结果不一样，也不需要关心内部的构建细节；你完全可以在布局上添加各种控件，默认隐藏，当控件被设置了参数后自动显示，就可以创建出各种各样的弹窗


#### 实现方法
构造者模式的实现方法其实差不多是固定的，就是创建一个`Builder`对象，通过`Builder`设置一些参数来构建我们需要的对象；具体写法可能各有不同，偷一张类图展示原生的构造者模式的具体写法

![](https://upload-images.jianshu.io/upload_images/289828-f978dc45cb4fa773.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1000/format/webp)

#### 具体的实现
`DialogView`就是一个我们需要的自定义的View了，在`DialogBuilder`中要完成几件事，首先需要一个`DialogView`对象用来返回，在构造函数中初始化；因为自定义View需要一个`Context`对象，所以这里传入一个`Context`
```java
/**
* 弹窗
*/
private DialogView mDialogView;
public DialogBuilder(Context context) {
    mDialogView = new DialogView(context);
}
```

然后为`DialogView`设置各种参数，继续返回`DialogBuilder`对象，来形成一个链式调用；

```java
    /**
     * 设置标题
     *
     * @param titleTxt
     * @return
     */
    public DialogBuilder setTitleTxt(String titleTxt) {
        mDialogView.setTitleTxt(titleTxt);
        return this;
    }

    /**
     * 设置中间的内容
     *
     * @param contentTxt
     * @return
     */
    public DialogBuilder setContentTxt(String contentTxt) {
        mDialogView.setContentTxt(contentTxt);
        return this;
    }
    ...
```

最后还有一个`create`方法，返回需要的`DialogView`对象
```java
    /**
     * 创建View
     *
     * @return
     */
    public DialogView create() {
        return mDialogView;
    }
```
其实这个东西和Android弹窗`AlertDialog.Builder`其实差不多的，都去掉了`Director`类；但是我这里没有抽象出`Builder`接口来，因为和`AlertDialog.Builder`不一样，想要定义出更多样式的弹窗，又不想花太多时间，而且只在一个项目中使用，所以没有去抽象出接口，可能对于拓展不是很友好，但是目前够用了，不够用了再去重构；



  [1]: http://static.zybuluo.com/Tyhj/9910lc8m0vhodeet886gf5gx/%E6%9C%AA%E6%A0%87%E9%A2%98-2.jpg