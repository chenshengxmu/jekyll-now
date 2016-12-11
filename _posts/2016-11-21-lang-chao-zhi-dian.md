---
layout: post
title: 《送你一颗子弹》
---
{% assign filename = page.url | remove: '/' %}
{% assign col = site.collections | where: "label", filename | first %}

<img src="{{site.baseurl}}/images/{{filename}}.jpg" width="360">

这本书里记录的是作者2005—2009年左右（尤其是2006—2007年）生活里的点点滴滴。在这本书里，被“审视”的东西杂七杂八，有街上的疯老头，有同宿舍的室友，有爱情、电影和书，大到制度，小到老鼠。由于我写这些东西的时候，出发点并不是写一本书，所以不同文章往往风格迥异，长短不一，质量不均，随着社会形势、荷尔蒙周期以及我逃避生活的力度而起伏。

{% for cookie in col.docs reversed %}
## [{{ cookie.title }}]({{ cookie.url }})
{% endfor %}
