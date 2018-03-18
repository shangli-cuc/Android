### drawable文件夹

用来设置button的不同效果：矩形、圆角、实心填充背景框、描边、按压时变色效果

前几种效果创建xml文件时的root是shape，按压变色选择的root是selector

### java文件夹

新增加了ButtonActivity.java，点击时显示提示信息

新增加了EditTextActivity.java，入了点击登陆显示“登陆成功”的提示信息，还增加了监听输入内容变化的部分

使用类addTextChangedListener的方法：beforeTextChange()、onTextChange()、afterTextChange()

在MainActivity.java里重写了类OnClick接口是类View.OnClickListener，简化了之前设置点击事件的代码

### layout文件夹

新增加了activity_button.xml，配合java文件里点击事件

新增加了activity_edit_text.xml，这是一个用户登陆界面user-login

Android:hint=””显示提示词

Android:maxLines=”” 最大显示行数

Android:inputType=”textPassword”或者”numberPassword”或者”number”限制输入数据的类型

比如：password是匿名显示，number只能输入数字

新增加了activity_radio_button.xml，对应相应的java文件里的点击事件

这是一个选择页面，默认勾选是android:checked="true"
