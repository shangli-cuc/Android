## android的第一个HelloWorld

第一个android程序
java代码是自动生成的，就不上传了

layout文件activity_main.xml
LinearLayout线性布局
RelativeLayout相对布局

---
LinearLayout线性布局：

Android:id=”” 设置id

Android:layout_width=”wrap_content”包含内容，内容有多少，宽度有多少

Android:layout_height=”match_parent”匹配副空间，上一级高度多少，这一级空间的高度就是多少

高度宽度如果要设置具体的长度，单位使用dp而不是px（像素点）

Android:text

Android:orientation=”vertical”或者”horizontal”垂直或者水平，如果不设置的话，默认LinearLayout是水平排列的，也就是vertical

Android:background=”#000000”RGB三基色

Android:padding=””多少个dp，padding是内部边距的意思，空间内部的元素距离边框的距离

具体还有距离左边、右边、上边、下边的距离paddingleft、paddingright、paddingtop、paddingbottom

Android:gravity=””内部元素的排列属性，居中之类的

Android:weight=””权重，需要注意的是将剩余部分按照权重分配

Android:layout_margin=””多少个dp，margin是外部边距的意思，边框和外部的距离，具体还有距离左边、右边、上边、下边的距离layout_marginLeft、layout_marginRight 、layout_margintop 、layout_marginbottom

---
RelativeLayout相对布局:

Android:Layout_top在谁的上边

Layout_below在谁的下边

layout_toLeftOf在谁的左边

Layout_toRightOf在谁的右边

Layout_alignTop跟谁顶部对齐

Layout_alignBottom跟谁底部对齐

Layout_alignParentBottom跟父空间底部对齐

Layout_alignParentTop跟父空间顶部对齐


