TextView类

Android:text=”@string” 文本内容，可以引用，也可以直接写

Android:textSize=”16sp” 字体大小

Android:textColor=”” 字体颜色

Android:maxLines=”” 文本显示的最大行数

Android:ellipsize=”end” 如果文本在规定的最大显示行数显示不下，会在末尾以省略号的形式显示ellip（省略）

Android:drawableRight=”@drawable/” 图标和文字共存

设置下划线、中划线、跑马灯效果

一共有两个页面也就是两个activity组件activity_main.xml和avtivity_text_view.xml

主页面activity_main设置一个button按钮，对应java文件MainActivity.java里声明button按钮，同时设置点击事件

跳转页面activity_text_view设置了7个TextView控件，分别有各自的效果，有些只在xml文件里就可以设置所需要的结果

比如：设置背景、在文字的左右上下加上图标、跑马灯效果

有些需要在对应的java文件TextViewActivity.java里面设置，比如：下划线、中划线

所以对应的需要声明这种控件
